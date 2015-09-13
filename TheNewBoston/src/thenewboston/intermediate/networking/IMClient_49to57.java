package thenewboston.intermediate.networking;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

@SuppressWarnings("serial")
public class IMClient_49to57 extends JFrame {

	private JTextField usrText;
	private JTextArea chatWindow;
	private ObjectOutputStream output;

	private ObjectInputStream input;
	private String message = "";
	private String serverIP, myName;
	private Socket connection;

	public IMClient_49to57(String host) throws UnknownHostException {
		super("IM - Client");
		serverIP = host;
		myName = InetAddress.getLocalHost().getHostAddress();
		usrText = new JTextField();
		usrText.setEditable(false);
		usrText.addActionListener(

		new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sendMsg(e.getActionCommand());
				usrText.setText("");
			}
		}

		);
		add(usrText, BorderLayout.SOUTH);
		chatWindow = new JTextArea();
		chatWindow.setEditable(false);
		add(new JScrollPane(chatWindow));
		setSize(300, 450);
		setVisible(true);

	}

	public void startRunning() {

		try {
			showMsg("  Type   END   to close connection normally\n");
			connectToServer();
			setupStreams();
			whileChatting();
		} catch (EOFException ef) {
			showMsg("\n Client closed connection...");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			closeCrap();
		}
	}

	private void connectToServer() throws IOException {
		showMsg("Attempting Connection...\n");
		connection = new Socket(InetAddress.getByName(serverIP), 6789);
		showMsg("Connected to: " + connection.getInetAddress().getHostName());
	}

	private void setupStreams() throws IOException {

		output = new ObjectOutputStream(connection.getOutputStream());
		output.flush();
		input = new ObjectInputStream(connection.getInputStream());
		showMsg("\n Streams ready. \n");

	}

	private void whileChatting() throws IOException {

		ableToType(true);
		do {
			try {
				message = (String) input.readObject();
				showMsg("\n" + message);
			} catch (ClassNotFoundException e) {
				showMsg("wait, w0t sever just sendedd??");
			}
		} while (!message.equals("SERVER - END"));

	}

	private void closeCrap() {

		showMsg("Closing connection...");
		ableToType(false);
		try {
			// output.flush();
			output.close();
			input.close();
			connection.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void ableToType(final boolean b) {

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				usrText.setEditable(b);
			}
		});

	}

	private void showMsg(final String string) {

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				chatWindow.append("\n" + string);
			}
		});

	}

	public void sendMsg(String message) {

		try {
			output.writeObject(myName + " - " + message);
			output.flush();
			showMsg("\n" + myName + " - " + message);
		} catch (IOException e) {
			showMsg("\nUnable to send that message...Re-try\n");
		}

	}
}
