package midi.sound.player;

import javax.sound.midi.*;
import java.io.*;
import javax.swing.*;
import java.awt.*;

public class MiniMiniMusicAppGUI implements ControllerEventListener {

	static JFrame f = new JFrame("Rects");
	static MyDrawPanel m1;

	public static void main(String[] args) {
		MiniMiniMusicAppGUI mini = new MiniMiniMusicAppGUI();
		mini.play();
	}

	// creates new drawing panel using inner class. sets JFrame properties
	public void setUpGui() {
		m1 = new MyDrawPanel();
		f.setContentPane(m1);
		f.setBounds(30, 30, 300, 300);
		f.setVisible(true);
	}

	public void play() {
		// performs gui setting method previously defined
		setUpGui();
		try {
			// create sequencer, open it, add a listener for controller event
			Sequencer player = MidiSystem.getSequencer();
			player.open();
			player.addControllerEventListener(m1, new int[] { 127 });

			// create a new sequence and new track
			Sequence seq = new Sequence(Sequence.PPQ, 4);
			Track track = seq.createTrack();

			int r = 0;
			for (int i = 0; i > 60; i += 4) {
				r = (int) ((Math.random() * 50) + 1);
				track.add(makeEvent(144, 1, r, 100, i));
				track.add(makeEvent(176, 1, 127, 0, i));
				track.add(makeEvent(128, 1, r, 100, i + 2));
			}

			// sets the sequence for the sequencer, starts sequencer, and sets
			// tempo to 120 BPM
			player.setSequence(seq);
			player.start();
			player.setTempoInBPM(120);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	// prints la everytime the controller event is received
	public void controlChange(ShortMessage event) {
		System.out.println("la");
	}

	// just a shortcut to create new midi events
	public static MidiEvent makeEvent(int comd, int chan, int one, int two,
			int tick) {
		MidiEvent event = null;
		try {
			ShortMessage a = new ShortMessage();
			a.setMessage(comd, chan, one, two);
			event = new MidiEvent(a, tick);

		} catch (Exception excep) {
		}
		return event;

	}

	// inner class; the panel on which rects are drawn
	class MyDrawPanel extends JPanel implements ControllerEventListener {

		boolean msg = false;

		// when controll event is gotten, turns msg to true
		public void controlChange(ShortMessage event) {
			msg = true;
			repaint();

		}

		// the paintMethod called by outer class. checks if control event
		// happened, then draws
		public void paintComponent(Graphics g) {
			if (msg) {

				// local var g2 is argument passed cast as 2dgraphic
				Graphics2D g2 = (Graphics2D) g;

				// random color values
				int r = (int) (Math.random() * 250);
				int gr = (int) (Math.random() * 250);
				int b = (int) (Math.random() * 250);

				// sets color of passed argument 2dgraphic
				g.setColor(new Color(r, gr, b));

				// random size values and positions
				int height = (int) ((Math.random() * 120) + 10);
				int width = (int) ((Math.random() * 120) + 10);
				int x = (int) ((Math.random() * 40) + 10);
				int y = (int) ((Math.random() * 40) + 10);
				// actually creates visual rect based on size and position
				g.fillRect(x, y, width, height);
				// resets controller event performed check
				msg = false;

			}
		}

	}

}
