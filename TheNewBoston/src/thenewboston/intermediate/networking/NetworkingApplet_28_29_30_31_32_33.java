package thenewboston.intermediate.networking;

import java.applet.AppletContext;
import java.awt.BorderLayout;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JApplet;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class NetworkingApplet_28_29_30_31_32_33 extends JApplet {

	private HashMap<String, URL> siteInfo;
	private ArrayList<String> titles;
	private JList mainList;

	public void init() {
		siteInfo = new HashMap<String, URL>();
		titles = new ArrayList<String>();

		grabHTMLInfo();

		add(new JLabel("Website Selection:"), BorderLayout.NORTH);

		mainList = new JList(titles.toArray());

		mainList.addListSelectionListener(new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent e) {

				Object obj = mainList.getSelectedValue();
				URL newDoc = siteInfo.get(obj);

				AppletContext browser = getAppletContext();

				browser.showDocument(newDoc);

			}

		});
		add(new JScrollPane(mainList), BorderLayout.SOUTH);
	}

	private void grabHTMLInfo() {

		String title, address;
		URL url;
		int counter = 0;

		title = getParameter("title" + counter);

		while (title != null) {
			address = getParameter("address" + counter);
			try {
				url = new URL(address);
				siteInfo.put(title, url);
				titles.add(title);
			} catch (MalformedURLException urlE) {
				urlE.printStackTrace();
			}
			counter++;
			title = getParameter("title" + counter);
		}

	}

}
