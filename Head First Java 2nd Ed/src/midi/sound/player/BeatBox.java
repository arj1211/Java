package midi.sound.player;

import java.awt.*;

import javax.swing.*;
import javax.sound.midi.*;

import java.util.*;
import java.awt.event.*;

public class BeatBox {

	JPanel mainPanel;
	// store checkboxes in arraylist
	ArrayList<JCheckBox> checkboxList;
	Sequencer sequencer;
	Sequence sequence;
	Track track;
	JFrame frame;

	// names of instruments as string array; to build gui labels on each row
	String[] instrumentNames = { "Bass Drum", "Closed Hi-Beat", "Open Hi-Hat",
			"Acoustic Snare", "Crash Cymbal", "Hand Clap", "High Tom",
			"Hi Bongo", "Maracas", "Whistle", "Low Conga", "Cowbell",
			"Vibraslap", "Low-Mid Tom", "High Agogo", "Open Hi Conga" };

	// the drum 'keys'. drum channel is like a piano,
	// except each 'key' on the piano is a different drum. so the number '35'
	// is the key for the bass drum, 42 is closed hi-hat, etc.
	int[] instruments = { 35, 42, 46, 38, 49, 39, 50, 60, 70, 72, 64, 56, 59,
			47, 67, 63 };

	public static void main(String[] args) {
		new BeatBox2.buildGUI();
	}

	public void buildGUI() {
		frame = new JFrame("Cyber Beatbox");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		BorderLayout layout = new BorderLayout();
		JPanel background = new JPanel(layout);
		// an empty border gives us a margin between the edges of the panel
		// and where the components are placed. this is purely aesthetic.
		background.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

		checkboxList = new ArrayList<JCheckBox>();
		Box buttonBox = new Box(BoxLayout.Y_AXIS);

		JButton start = new JButton("Start");
		start.addActionListener(new MyStartListener());
		buttonBox.add(start);

		JButton stop = new JButton("Stop");
		stop.addActionListener(new MyStopListener());
		buttonBox.add(stop);

		JButton upTempo = new JButton("Tempo Up");
		upTempo.addActionListener(new MyUpTempoListener());
		buttonBox.add(upTempo);

		JButton downTempo = new JButton("Tempo Down");
		downTempo.addActionListener(new MyDownTempoListener());
		buttonBox.add(downTempo);

		Box nameBox = new Box(BoxLayout.Y_AXIS);
		for (int i = 0; i < 16; i++)
			nameBox.add(new Label(instrumentNames[i]));

		background.add(BorderLayout.EAST, buttonBox);
		background.add(BorderLayout.WEST, nameBox);

		frame.getContentPane().add(background);

		GridLayout grid = new GridLayout(16, 16);
		grid.setVgap(1);
		grid.setHgap(2);
		mainPanel = new JPanel(grid);
		background.add(BorderLayout.CENTER, mainPanel);

		// make checkboxes, set false/unchecked, add to arraylist (for function)
		// AND gui panel (so its there)
		for (int i = 0; i < 16 * 16; i++) {
			JCheckBox c = new JCheckBox();
			c.setSelected(false);
			checkboxList.add(c);
			mainPanel.add(c);
		}

		setUpMidi();

		frame.setBounds(50, 50, 300, 300);
		frame.pack();
		frame.setVisible(true);
	}

	public void setUpMidi() {
		try {
			sequencer = MidiSystem.getSequencer();
			sequencer.open();
			sequence = new Sequence(Sequence.PPQ, 4);
			track = sequence.createTrack();
			sequencer.setTempoInBPM(120);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// NOW the checkboxes will turn into midi events, and be added to the track!
	public void buildTrackAndStart() {

		// we're making a 16 element array to hold the values
		// for one instrument, across all 16 beats. if instrument
		// is supposed to play on that beat, the value at that element
		// will be the key. if that instrument is not supposed to play on that
		// beat,
		// put in a 0.
		int[] trackList = null;

		sequence.deleteTrack(track); // get rid of old track, refresh with new
										// one
		track = sequence.createTrack();

		// do this for each of 16 rows
		for (int i = 0; i < 16; i++) {
			trackList = new int[16];

			// set 'key' representing which instrument this is. the instruments
			// array holds
			// actual midi numbers for each instrument
			int key = instruments[i];

			// do this for each BEAT in the row
			for (int j = 0; j < 16; j++) {
				JCheckBox jc = (JCheckBox) checkboxList.get(j + (16 * i));

				// is the checkbox at this beat selected?
				// if yes, put the key value in this slot in the array
				// (the slot that represents this beat)
				// Otherwise, the instrument is NOT supposed
				// to play at this beat, so set it to 0.
				if (jc.isSelected()) {
					trackList[j] = key;
				} else {
					trackList[j] = 0;
				}
			}

			makeTracks(trackList); // for this instrument and for all 16 beats,
			// make events and add them to the track
			track.add(makeEvent(176, 1, 127, 0, 16));
		}

		// always need to make sure there IS a beat on beat 16,
		// otherwise the BeatBox might not go the full 16 beats before it starts
		// over
		track.add(makeEvent(192, 9, 1, 0, 15));
		try {

			sequencer.setSequence(sequence);

			// lets you specify loop iterations, or infinite looping
			sequence.setLoopCount(sequencer.LOOP_CONTINUOUSLY);
			// PLAY IT
			sequencer.start();
			sequencer.setTempoInBPM(120);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}// close buildTrackAndStart method

	//button listener classes to follow vvv
public class MyStartListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			buildTrackAndStart();
		}
}

public class MyStopListener implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		sequencer.stop();
	}
}
	
public class MyUpTempoListener implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		float tempoFactor = sequencer.getTempoFactor();
		
		//tempo factor scales sequencer's tempo by factor provided. 
		//default is 1.0, so its being adjusted + %3 per click.
		sequencer.setTempoFactor(((float)(tempoFactor*1.03)));
	}
}

public class MyDownTempoListener implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		float tempoFactor = sequencer.getTempoFactor();
		//tempo factor scales sequencer's tempo by factor provided. 
		//default is 1.0, so its being adjusted - %3 per click.
		sequencer.setTempoFactor((float)(tempoFactor*.97));
	}
}


//makes events for one instrument at a time, for all
//16 beats. so it might get an int[] for the bass drum,
//and each index in the array will hold either the key
//of that instrument, or a zero. if its zero, the instrument
//isn't supposed to play at that beat. otherwise, makes an
//event and adds it to the track.
//		VVVV		VVVV
public void makeTracks(int[] list){
	for (int i=0;i<16;i++){
		int key=list[i];
		if (key!= 0){
			//make note ON and NOT OFF events, add to track
			track.add(makeEvent(144,9,key,100,i));
			track.add(makeEvent(128,9,key,100,i+1));
		}
	}
}

//vvv simplifying method
public MidiEvent makeEvent(int comd, int chan, int one, int two, int tick){
	MidiEvent event = null;
	try{
		ShortMessage a = new ShortMessage();
		a.setMessage(comd, chan, one, two);
		event = new MidiEvent(a, tick);
	} catch (Exception e){
		e.printStackTrace();
	}
	return event;
}



}//close BeatBox Program
