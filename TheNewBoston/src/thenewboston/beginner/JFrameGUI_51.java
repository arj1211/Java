package thenewboston.beginner;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JFrameGUI_51 extends JFrame {

	private JLabel item1;
	private JLabel item2;
	private JLabel item3;

	JFrameGUI_51() {
		super("Title Bar");
		setLayout(new FlowLayout());

		item1 = new JLabel("sentence placeholder");

		item1.setToolTipText("You can see this cause you hovered over this text");
		add(item1);
	}
}
