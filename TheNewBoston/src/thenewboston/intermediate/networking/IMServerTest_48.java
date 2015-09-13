package thenewboston.intermediate.networking;

import javax.swing.JFrame;

public class IMServerTest_48 {
	public static void main(String[] args) {

		IMServer_38to47 serv = new IMServer_38to47();

		serv.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		serv.setLocationRelativeTo(null);
		serv.startRunning();

	}
}