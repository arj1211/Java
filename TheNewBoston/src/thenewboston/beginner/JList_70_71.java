package thenewboston.beginner;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class JList_70_71 extends JFrame {

	private JList list;
	private static String[] colornames = { "black", "blue", "red", "white", "yellow", "green"};
	private static Color[] colors = { Color.BLACK, Color.BLUE, Color.RED,
			Color.WHITE, Color.YELLOW, Color.GREEN};

	public JList_70_71() {

		super("Title");
		setLayout(new FlowLayout());
		list = new JList(colornames);
		list.setVisibleRowCount(6);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		add(new JScrollPane(list));

		list.addListSelectionListener(new ListSelectionListener() {

			public void valueChanged(ListSelectionEvent e) {
				getContentPane().setBackground(colors[list.getSelectedIndex()]);
			}
		}

		);

	}

}
