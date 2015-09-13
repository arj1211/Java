package thenewboston.beginner;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawingGraphics_84 extends JPanel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Yoo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		DrawingGraphics_84 graa = new DrawingGraphics_84();
		frame.add(graa);
		frame.setSize(450, 200);
		frame.setVisible(true);

	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		this.setBackground(Color.WHITE);

		g.setColor(Color.BLUE);
		g.fillRect(25, 25, 100, 30);

		g.setColor(new Color(190, 81, 215));
		g.fillRect(25, 65, 100, 30);

		g.setColor(Color.RED);
		g.drawString("Ayeee", 25, 120);
	}

}
