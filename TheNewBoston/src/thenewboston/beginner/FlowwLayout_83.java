package thenewboston.beginner;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class FlowwLayout_83 extends JFrame {

	public static void main(String[] args) {
		FlowwLayout_83 flowflow = new FlowwLayout_83();
		flowflow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		flowflow.setSize(300, 100);
		flowflow.setVisible(true);
	}

	private JButton L_B;
	private JButton C_B;
	private JButton R_B;

	private FlowLayout layout;
	private Container container;

	public FlowwLayout_83() {
		super("tittle");
		layout = new FlowLayout();
		container = getContentPane();
		setLayout(layout);

		// left
		L_B = new JButton("Left");
		add(L_B);
		L_B.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				layout.setAlignment(FlowLayout.LEFT);
				layout.layoutContainer(container);// rearrange based on
													// alignment
			}
		});
		// center
		C_B = new JButton("Center");
		add(C_B);
		C_B.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				layout.setAlignment(FlowLayout.CENTER);
				layout.layoutContainer(container);// rearrange based on
													// alignment
			}
		});
		// right
		R_B = new JButton("Right");
		add(R_B);
		R_B.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				layout.setAlignment(FlowLayout.RIGHT);
				layout.layoutContainer(container);// rearrange based on
													// alignment
			}

		});

	}

}
