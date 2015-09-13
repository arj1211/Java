package thenewboston.beginner;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class AdapterClasses_77 extends JFrame {
	

	private String details;
	private JLabel statusbar;

	public AdapterClasses_77() {
		super("Turtle");
		statusbar = new JLabel("Shailuuu <3 :*");
		add(statusbar, BorderLayout.SOUTH);

		addMouseListener(new MouseClass());

	}

	private class MouseClass extends MouseAdapter {
		public void mouseClicked(MouseEvent event) {
			details = String.format("You clicked %d ", event.getClickCount());

			if (event.isMetaDown())
				details += "With Right Mouse Button at this location";
			else if (event.isAltDown())
				details += "With Center Mouse Button at this location";
			else
				details += "With Left Mouse Button at this location";

			statusbar.setText(details);

		}
	}

}
