public class Naloga1 {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);

		a(a);
		b(a);
		c(args[0]);
		č(a);
	}

	private static void a(int a) {
		for(int i = 1; i < a; i++) {
			if(a % i == 0) {
				System.out.println(i);
			}
		}
	}

	private static void b(int a) {
		for(int i = 2; i < a; i++) {
			if(a % i == 0) {
				System.out.println("NI PRASTEVILO");
				return;
			}
		}

		System.out.println("PRASTEVILO");
	}

	private static void c(String a) {
		StringBuilder c = new StringBuilder(a);
		System.out.println(c.reverse());
	}

	private static void č(int a) {
		int vsota = 0;

		for(int i = 1; i < a - 1; i++) {
			if(a % i == 0) {
				vsota += i;
			}
		}

		if(vsota == a) {
			System.out.println("POPOLNO");
		} else {
			System.out.println("NI POPOLNO");
		}
	}
}