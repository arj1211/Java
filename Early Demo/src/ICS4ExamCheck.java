public class ICS4ExamCheck {

	public static int binToDec1(int b, int pv) {
		if (b == 0) {
			return 0;
		} else {
			return binToDec1((b / 10), 2 * pv) + ((b % 10) * pv);
		}
	}

	public static int binToDec2(int b, int pv) {
		if (b == 0) {
			return 0;
		} else {
			return (int) (((b % 10) * Math.pow(2, pv - 1)) + binToDec2(b / 10,
					pv + 1));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Yours:" + binToDec1(11011, 1));
		System.out.println("Mine:" + binToDec2(11011, 1));

	}

}
