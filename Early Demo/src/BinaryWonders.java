public class BinaryWonders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Start");

		for (int y = 0; y <= 65535; y++) {
			System.out.println(String.format("%16s", Integer.toBinaryString(y))
					.replace(' ', '0'));
		}
		System.out
				.println("Numbers 0 - 65535 in binary; Arjun's 'Binary Wonders' ");

	}

}
