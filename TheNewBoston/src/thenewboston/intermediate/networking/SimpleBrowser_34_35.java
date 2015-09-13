package thenewboston.intermediate.networking;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;

public class SimpleBrowser_34_35 extends JFrame {

	private JTextField addressBar;
	private JEditorPane display;

	public SimpleBrowser_34_35() {
		super("My Browser");
		addressBar = new JTextField("Enter URL");
		addressBar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				loadCrap(e.getActionCommand());
			}
		});
		add(addressBar, BorderLayout.NORTH);

		display = new JEditorPane();
		display.setEditable(false);
		display.addHyperlinkListener(new HyperlinkListener() {

			@Override
			public void hyperlinkUpdate(HyperlinkEvent e) {
				// TODO Auto-generated method stub
				if (e.getEventType() == HyperlinkEvent.EventType.ACTIVATED)
					loadCrap(e.getURL().toString());
			}

		});

		add(new JScrollPane(display), BorderLayout.CENTER);
		setSize(500, 300);
		setVisible(true);

	}

	private void loadCrap(String usrTxt) {

		try {
			display.setPage(usrTxt);
			addressBar.setText(usrTxt);
		} catch (Exception e) {
			System.out.println("no");
		}

	}

}
