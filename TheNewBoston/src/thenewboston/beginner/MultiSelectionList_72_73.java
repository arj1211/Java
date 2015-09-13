package thenewboston.beginner;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class MultiSelectionList_72_73 extends JFrame {
	private JList leftList;
	private JList rightList;
	private JButton moveButton;

	private static String[] foods = { "bacon", "wings", "ham", "beef",
			"chicken" };

	public MultiSelectionList_72_73() {
		super("TItle");
		setLayout(new FlowLayout());

		leftList = new JList(foods);
		leftList.setVisibleRowCount(foods.length);
		leftList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		add(new JScrollPane(leftList));

		moveButton = new JButton("Move -->");
		moveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rightList.setListData(leftList.getSelectedValues());

			}
		});
		add(moveButton);

		rightList = new JList();
		rightList.setVisibleRowCount(foods.length);
		
		rightList
				.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		add(new JScrollPane(rightList));

	}

}
