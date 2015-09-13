package thenewboston.beginner;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MouseEvents_74_75_76 extends JFrame {
	private JPanel mousePanel;
	private JLabel statusBar;

	public MouseEvents_74_75_76() {
		super("Title");

		mousePanel = new JPanel();
		mousePanel.setBackground(Color.WHITE);
		add(mousePanel, BorderLayout.CENTER);

		statusBar = new JLabel("default");
		add(statusBar, BorderLayout.SOUTH);

		Handlerr handler = new Handlerr();
		mousePanel.addMouseListener(handler);
		mousePanel.addMouseMotionListener(handler);

	}

	private class Handlerr implements MouseListener, MouseMotionListener {

		@Override
		public void mouseDragged(MouseEvent e) {
			statusBar.setText("Draggin");
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			statusBar.setText("Movin");

		}

		@Override
		public void mouseClicked(MouseEvent e) {
			statusBar.setText(String.format("clicked at %d,  %d", e.getX(),
					e.getY()));
		}

		@Override
		public void mousePressed(MouseEvent e) {
			statusBar.setText("you pressed down the mouse");
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			statusBar.setText("You released");
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			statusBar.setText("You entered area");
			mousePanel.setBackground(Color.DARK_GRAY);
		}

		@Override
		public void mouseExited(MouseEvent e) {
			statusBar.setText("You out");
			mousePanel.setBackground(Color.WHITE);

		}

	}

}
