package thenewboston.beginner;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JButton_62_63 extends JFrame {

	private JButton reg;
	private JButton custom;

	public JButton_62_63() {
		super("Title");
		setLayout(new FlowLayout());

		reg = new JButton("Regular Button");

		Icon icon = new ImageIcon(getClass().getResource("Jbutton.jpg"));
		// Icon icon = new ImageIcon("/Jbutton.jpg");
		custom = new JButton("Custom Button", icon);

		add(reg);
		add(custom);

		Handler handle = new Handler();
		reg.addActionListener(handle);
		custom.addActionListener(handle);
	}

	private class Handler implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null,
					String.format("%s", e.getActionCommand()));
		}

	}
}
