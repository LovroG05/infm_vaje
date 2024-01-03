import java.util.Arrays;
import java.util.Scanner;

public class Naloga5 {
	public static void main(String[] args) {
		a();
		b();
		System.out.println(
				Arrays.toString(
						racun(new int[]{1, 2, 3, 4, 5, 6}, new int[]{10, -2, 49, 88, -634, 144})
				)
		);
		System.out.println(vsotaBrezMin(new int[]{2, 7, 3, 4, 6, 2, 5}));
	}

	private static void a() {
		Scanner sc = new Scanner(System.in);
		int next = 123;
		int vsota = 0;

		while(next != 0) {
			next = sc.nextInt();

			if(next != 0) {
				vsota++;
			}
		}

		System.out.println(vsota);
	}

	private static void b() {
		String[] a = {"aaa", "bbb", "ccc"};
		String[] b = {"123", "456", "789"};

		System.out.print(a[(int) (Math.random() * (a.length - 1))]);
		System.out.println(b[(int) (Math.random() * (b.length - 1))]);
	}

	private static int[] racun(int[] a1, int[] a2) {
		int[] toReturn = new int[6];

		for(int i = 0; i < a1.length; i++) {
			int a = a1[i];
			int b = a2[i];

			if(a == b) {
				toReturn[i] = -1;
			} else {
				toReturn[i] = a > b ? a - b : b - a;
			}
		}

		return toReturn;
	}

	private static int vsotaBrezMin(int[] a) {
		int min = a[0];
		int vsota = 0;

		for(int j : a) {
			if(j < min) {
				min = j;
			}
		}

		for(int i : a) {
			if(i != min) {
				vsota += i;
			}
		}

		return vsota;
	}
}
