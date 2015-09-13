package thenewboston.intermediate;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class DrawingOvalWithSlider_24 extends JFrame {

	private JSlider slider;
	private DrawingOvalWithSlider_23 panel;

	public DrawingOvalWithSlider_24() {

		super("Title");

		panel = new DrawingOvalWithSlider_23();
		panel.setBackground(Color.DARK_GRAY);

		slider = new JSlider(SwingConstants.VERTICAL, 0, 200, 10);
		slider.setMajorTickSpacing(10);
		slider.setPaintTicks(true);

		slider.addChangeListener(

		new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {

				panel.setDiam(slider.getValue());

			}

		}

		);

	
	
	add(slider,BorderLayout.SOUTH);
	add(panel,BorderLayout.CENTER);
	
	
	
	
	
	
	
	
	}

}
