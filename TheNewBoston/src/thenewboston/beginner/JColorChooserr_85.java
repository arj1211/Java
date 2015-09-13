package thenewboston.beginner;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JColorChooserr_85 extends JFrame {

	public static void main(String[] args) {

		JColorChooserr_85 mychoose = new JColorChooserr_85();
		mychoose.setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	private JButton b;
	private Color color = (Color.WHITE);
	private JPanel panel;

	public JColorChooserr_85() {
		super("Tittle");
		panel = new JPanel();
		panel.setBackground(color);

		b = new JButton("Choose a Color");

		b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Color cool = color;
				color = JColorChooser.showDialog(null, "Pick a color", color);
				
				if (color == null)
					color = cool;
				panel.setBackground(color);
			}

		});
		add(panel, BorderLayout.CENTER);
		add(b, BorderLayout.SOUTH);
		setSize(425, 250);
		setVisible(true);
	}

}
