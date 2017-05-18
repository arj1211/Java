import java.io.*;
import java.util.*;

public class DataISUGen {

	static Random r = new Random();

	public static Entry entryMaker(int stressLevel) {
		Entry e = new Entry();
		e.stress = stressLevel;
		int max = 100, min = 0;
		if (stressLevel >= 0 && stressLevel <= 2) {
			min = 51;
			max = 63;
		} else if (stressLevel >= 3 && stressLevel <= 5) {
			min = 64;
			max = 76;
		} else if (stressLevel >= 6 && stressLevel <= 8) {
			min = 77;
			max = 89;
		} else if (stressLevel >= 9 && stressLevel <= 10) {
			min = 90;
			max = 100;
		}

		e.average = r.nextInt((max - min) + 1) + min;

		return e;
	}

	public static void main(String[] args) {

		/*
		 * 
		 * separate stress levels: 0-2 3-5 6-8 9-10
		 * 
		 * avgs will reflect those quartiles: 51-63 64-76 77-89 90-100
		 */

		ArrayList<Entry> entries = new ArrayList<>();

		for (int i = 0; i < 200; i++) {
			entries.add(entryMaker(r.nextInt((10 - 0) + 1) + 0));
		}

		Collections.sort(entries);

		try {

			File out = new File(
					"E:/Non-Installed Files/School/Grade 12/Data Management/dataisu4entries.txt");
			PrintWriter bw = new PrintWriter(new FileWriter(out));

			for (int i = 0; i < entries.size(); i++) {
				String s = entries.get(i).stress + " " + entries.get(i).average+"\n";
				bw.println(s);
				System.out.println(s);
			}
			bw.flush();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

class Entry implements Comparable<Entry> {
	int stress;
	int average;

	@Override
	public int compareTo(Entry o) {
		return ((this.stress > o.stress) ? o.stress : this.stress);

	}
}