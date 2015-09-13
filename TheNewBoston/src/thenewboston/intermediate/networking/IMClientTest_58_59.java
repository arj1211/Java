package thenewboston.intermediate.networking;

import java.net.UnknownHostException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class IMClientTest_58_59 {
	public static void main(String[] args) throws InterruptedException,
			UnknownHostException {

		String ip = JOptionPane.showInputDialog("IP");
		// Scanner inIP = new Scanner(System.in);
		// System.out.println("Server must be already running to continue...");
		// System.out.println("Server IP to connect to?:");
		IMClient_49to57 clien = new IMClient_49to57(
		/* inIP.nextLine() */ip);
		clien.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		clien.setLocationRelativeTo(null);

		clien.startRunning();
		// inIP.close();

	}
}
