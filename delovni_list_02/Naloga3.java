import java.util.Scanner;

public class Naloga3 {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String stevilo = "";

		while(!(stevilo.length() >= 4 && stevilo.length() <= 6)) {
			System.out.print("> ");
			stevilo = sc.next();
		}

		vsotaStevk(stevilo);
		najvecjaStevka(stevilo);
		palidnromskoStevilo(stevilo);
	}

	private static void vsotaStevk(String stevilo) {
		int vsota = 0;

		for(char c : stevilo.toCharArray()) {
			vsota += Character.getNumericValue(c);
		}

		System.out.println(vsota);
	}

	private static void najvecjaStevka(String stevilo) {
		int najvecja = 0;

		for(char c : stevilo.toCharArray()) {
			int a = Character.getNumericValue(c);

			if(a > najvecja) {
				najvecja = a;
			}
		}

		System.out.println(najvecja);
	}

	private static boolean palidnromskoStevilo(String stevilo) {
		char[] a = stevilo.toCharArray();

		for(int i = 0; i < a.length / 2; i++) {
			if(a[i] != a[a.length - 1 - i]) {
				return false;
			}
		}

		return true;
	}
}
