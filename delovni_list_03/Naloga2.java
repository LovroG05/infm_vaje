public class Naloga2 {
	private static double[] rezultati = {108.9, 107.0, 109.3, 109.8, 108.7,
			110.8, 110.2, 111.5, 113.5, 110.1};

	public static void main(String[] args) {
		System.out.println(razlikaCasov(rezultati));
	}

	private static double razlikaCasov(double[] rezultati) {
		double min = rezultati[0];
		double max = rezultati[0];

		for(double a : rezultati) {
			if(a < min) {
				min = a;
			}

			if(a > max) {
				max = a;
			}
		}

		return max - min;
	}
}
