package thenewboston.intermediate;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class DrawingOvalWithSlider_23 extends JPanel {

	private int diam = 10;

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.RED);
		g.fillOval(super.getWidth()/2-diam/2, super.getHeight()/2-diam/2, diam, diam);
	}

	public void setDiam(int nD) {
		diam = (nD >= 0 ? nD : 10);
		repaint();
	}

	public Dimension getPreferredSize() {
		return new Dimension(200, 200);
	}

	public Dimension getMinimumSize() {
		return getPreferredSize();
	}

}
