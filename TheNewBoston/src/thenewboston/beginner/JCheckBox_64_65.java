package thenewboston.beginner;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class JCheckBox_64_65 extends JFrame {
	private JTextField tf = new JTextField("Sentence here");
	private JCheckBox boldBox = new JCheckBox("bolding");
	private JCheckBox italicBox = new JCheckBox("italicize");

	public JCheckBox_64_65() {
		super("Title");
		setLayout(new FlowLayout());
		tf.setFont(new Font("Arial", Font.PLAIN, 20));
		add(tf);
		add(boldBox);
		add(italicBox);

		Handler handlez = new Handler();
		boldBox.addItemListener(handlez);
		italicBox.addItemListener(handlez);
	}

	private class Handler implements ItemListener {

		public void itemStateChanged(ItemEvent e) {
			Font font;

			if (boldBox.isSelected() && italicBox.isSelected()) {
				font = new Font("Arial", Font.BOLD + Font.ITALIC, 20);
			} else if (boldBox.isSelected()) {
				font = new Font("Arial", Font.BOLD, 20);
			} else if (italicBox.isSelected()) {
				font = new Font("Arial", Font.ITALIC, 20);
			} else
				font = new Font("Arial", Font.PLAIN, 20);

			tf.setFont(font);
		}
	}

}
