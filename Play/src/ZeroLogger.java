public class ZeroLogger {

	static double f(double x) {
		return (0.775104966 * Math.cos(2.6209 * x) * Math.sqrt(x) - 0.9524);
	}

	static boolean valid(double v) {
		if (v < 0.1 && v > -0.1)
			return true;
		return false;
	}

	public static void main(String[] args) {

		int i = 1;
		for (double d = 2; d < 100; d += 0.01) {
			if (valid(f(d))) {
				System.out.println(Math.round(d * 100) / 100.0 + "  "
						+ Math.round(f(d) * 100) / 100.0);
				d += 0.45;
			}
			if (valid(f(d))) {
				System.out.print(((i % 2 == 0) ? "" : "(")
						+ (1945 + (Math.round(d * 100) / 100.0))
						+ ((i % 2 == 0) ? ") U " : ", "));
				d += 0.45;
				i++;
			}
		}

	}
}
