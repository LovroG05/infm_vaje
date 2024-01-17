public class Naloga1 {
	private static double[] rezultati = {108.9, 107.0, 109.3, 109.8, 108.7,
			110.8, 110.2, 111.5, 113.5, 110.1};

	public static void main(String[] args) {
		System.out.println(povprecje(rezultati));
	}

	private static double povprecje(double[] rezultati) {
		double vsota = 0;

		for(double a : rezultati) {
			vsota += a;
		}

		return vsota / rezultati.length;
	}
}