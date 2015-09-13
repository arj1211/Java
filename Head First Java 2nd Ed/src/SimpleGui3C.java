import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SimpleGui3C implements ActionListener {

	public static void main(String[] args) {
		SimpleGui3C gui = new SimpleGui3C();
		gui.go();
	}

	JFrame frame;
	int click = 0;

	public void go() {
		frame = new JFrame("Colour Changing Circles");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(Color.BLACK);

		JButton button = new JButton("Colour Change");
		button.addActionListener(this);

		MyDrawPanel drawPanel1 = new MyDrawPanel();

		frame.getContentPane().add(button, BorderLayout.SOUTH);
		frame.getContentPane().add(drawPanel1, BorderLayout.CENTER);
		frame.setSize(300, 300);
		frame.setResizable(false);
		frame.setVisible(true);

	}

	public void actionPerformed(ActionEvent event) {
		click++;
		frame.setTitle("Clicked: " + Integer.toString(click) + " time(s)");
		frame.repaint();

	}

}

class MyDrawPanel extends JPanel {
	public void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;

		int red = (int) (Math.random() * 255);
		int green = (int) (Math.random() * 255);
		int blue = (int) (Math.random() * 255);
		Color startColor = new Color(red, green, blue);

		red = (int) (Math.random() * 255);
		green = (int) (Math.random() * 255);
		blue = (int) (Math.random() * 255);
		Color andColor = new Color(red, green, blue);

		GradientPaint gradient = new GradientPaint(70, 70, startColor, 150,
				150, andColor);
		g2d.setPaint(gradient);
		g2d.fillOval(75, 75, 125, 125);

	}
}
