package thenewboston.intermediate.networking;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

@SuppressWarnings("serial")
public class IMServer_38to47 extends JFrame {

	private JTextField usrTxt;
	private JTextArea chatWindow;
	private ObjectOutputStream output;
	private ObjectInputStream input;

	private ServerSocket server;

	private Socket connection;

	public IMServer_38to47() {
		super("IM - Server");

		usrTxt = new JTextField();

		usrTxt.setEditable(false);

		usrTxt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				sendMsg(e.getActionCommand());
				usrTxt.setText("");

			}
		});
		add(usrTxt, BorderLayout.SOUTH);
		chatWindow = new JTextArea();
		chatWindow.setEditable(false);
		add(new JScrollPane(chatWindow));
		setSize(300, 450);
		setVisible(true);

	}

	public void startRunning() {
		try {
			showMsg("  Type   END   to close connection normally\n");
			server = new ServerSocket(6789, 100);
			while (true) {
				try {
					waitForConnection();
					setupStreams();
					whileChatting();
				} catch (EOFException e) {
					showMsg("\n Server ended the connection.");
				} finally {
					closeCrap();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void waitForConnection() throws IOException {
		showMsg("Waiting for someone to connect...\n");
		connection = server.accept();
		showMsg("Connected to: " + connection.getInetAddress().getHostName()
				+ "!\n");
	}

	private void setupStreams() throws IOException {
		output = new ObjectOutputStream(connection.getOutputStream());
		output.flush();
		input = new ObjectInputStream(connection.getInputStream());
		showMsg("\nStreams are set up.\n");
	}

	private void whileChatting() throws IOException {
		String message = " You are now connected! ";
		sendMsg(message);
		ableToType(true);
		do

		{
			try {
				message = (String) input.readObject();
				showMsg("\n" + message);
				if (message.equals("CLIENT - END"))
					showMsg("Client closed the connection.");
			} catch (ClassNotFoundException e) {
				showMsg("\n w0t did this user just send?!");
			} catch (IOException eo) {
				eo.printStackTrace();
			}
		} while (!message.equals("CLIENT - END"));
	}

	private void closeCrap() {

		showMsg("\n Closing connection... ");
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

	private void sendMsg(String message) {

		try {
			output.writeObject(server.getInetAddress().getHostName() + " - "
					+ message);
			output.flush();
			showMsg("\n" + server.getInetAddress().getHostName() + " - "
					+ message);
		} catch (IOException e) {
			chatWindow.append("\n Cannot Send! Re-try");
		}

	}

	private void showMsg(final String string) {

		SwingUtilities.invokeLater(

		new Runnable() {

			@Override
			public void run() {

				chatWindow.append("\n" + string);

			}

		}

		);

	}

	private void ableToType(final boolean b) {

		SwingUtilities.invokeLater(

		new Runnable() {

			@Override
			public void run() {

				usrTxt.setEditable(b);

			}

		}

		);

	}

}
