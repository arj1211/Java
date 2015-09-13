package thenewboston.beginner;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class JRadioButton_66_67 extends JFrame {

	private JTextField textF;
	private Font plainF = new Font("Arial", Font.PLAIN, 20);
	private Font boldF = new Font("Arial", Font.BOLD, 20);
	private Font italicF = new Font("Arial", Font.ITALIC, 20);
	private Font boldItalicF = new Font("Arial", Font.BOLD + Font.ITALIC, 20);
	private JRadioButton plainB;
	private JRadioButton boldB;
	private JRadioButton italicB;
	private JRadioButton boldItalicB;
	private ButtonGroup group;

	public JRadioButton_66_67() {

		super("Title");
		setLayout(new FlowLayout());

		textF = new JTextField("Here", 20);

		plainB = new JRadioButton("plain", true);
		boldB = new JRadioButton("bold", false);
		italicB = new JRadioButton("italic", false);
		boldItalicB = new JRadioButton("bold & italic", false);
		add(textF);
		add(plainB);
		add(boldB);
		add(italicB);
		add(boldItalicB);

		group = new ButtonGroup();
		group.add(plainB);
		group.add(boldB);
		group.add(italicB);
		group.add(boldItalicB);
		
		textF.setFont(plainF);
		plainB.addItemListener(new HandlerC(plainF));
		boldB.addItemListener(new HandlerC(boldF));
		italicB.addItemListener(new HandlerC(italicF));
		boldItalicB.addItemListener(new HandlerC(boldItalicF));
		
	}
	
	public class HandlerC implements ItemListener{
		private Font font;
		
		
		public HandlerC(Font f){
			font=f;
		}
			// sets font to font Obj passed in
			public void itemStateChanged(ItemEvent e) {
				textF.setFont(font);
		}
	}

}
