package thenewboston.beginner;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawingMoreStuff_86 extends JPanel {

	public static void main(String[] args) {

		JFrame fr = new JFrame("Framtittles");
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		DrawingMoreStuff_86 stuff = new DrawingMoreStuff_86();
		stuff.setBackground(Color.WHITE);
		fr.add(stuff);
		fr.setSize(550, 320);
		fr.setVisible(true);

	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		this.setBackground(Color.WHITE);

		g.setColor(Color.BLUE);
		g.drawLine(10, 25, 200, 45);

		g.setColor(Color.RED);
		g.drawRect(10, 55, 100, 30);

		g.setColor(Color.GREEN);
		g.fillOval(10, 95, 100, 30);

		g.setColor(Color.ORANGE);
		g.fill3DRect(10, 160, 100, 50, true);
	}

}
