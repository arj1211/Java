package thenewboston.intermediate.applets;

import java.awt.Graphics;

import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class InitForApplets_22 extends JApplet {

	private double sum;

	public void init() {
		String fn = JOptionPane.showInputDialog("Input first num ");
		String sn = JOptionPane.showInputDialog("Input second num ");

		double n1 = Double.parseDouble(fn);
		double n2 = Double.parseDouble(sn);

		sum = n1 + n2;
	}

	public void paint(Graphics g) {
		super.paint(g);
		g.drawString("Sum is " + sum, 25, 30);
	}
}
