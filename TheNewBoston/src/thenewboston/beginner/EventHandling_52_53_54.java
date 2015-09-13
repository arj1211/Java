package thenewboston.beginner;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class EventHandling_52_53_54 extends JFrame {

	private JTextField textF1;
	private JTextField textF2;
	private JTextField textF3;

	private JPasswordField passField;

	public EventHandling_52_53_54() {

		super("Title");
		setLayout(new FlowLayout());

		textF1 = new JTextField(10);
		add(textF1);

		textF2 = new JTextField("enter txt here");
		add(textF2);

		textF3 = new JTextField("unedittable", 20);
		textF3.setEditable(false);
		add(textF3);

		passField = new JPasswordField("mypassowrd");
		add(passField);

		TheHandler handler = new TheHandler();

		textF1.addActionListener(handler);
		textF2.addActionListener(handler);
		textF3.addActionListener(handler);
		passField.addActionListener(handler);
	}

	private class TheHandler implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			String string = " ";

			if (e.getSource() == textF1)
				string = String.format("field 1: %s", e.getActionCommand());
			else if (e.getSource() == textF2)
				string = String.format("field 2: %s", e.getActionCommand());
			else if (e.getSource() == textF3)
				string = String.format("field 3: %s", e.getActionCommand());
			else if (e.getSource() == passField)
				string = String.format("Password Field is: %s",
						e.getActionCommand());
			JOptionPane.showMessageDialog(null, string);

		}

	}
}
