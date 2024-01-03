import java.util.Scanner;

public class Naloga4 {
	public static void main(String[] args) {
		String[] besede = new String[100];
		Scanner sc = new Scanner(System.in);

		for(int i = 0; i < besede.length; i++) {
			System.out.print("> ");
			besede[i] = sc.next();
		}

		vrniPrviZnak(2, args);
		System.out.println(steviloSoglasnikov(args[1]));
		najvecSoglasnikov(args);
	}

	private static void vrniPrviZnak(int n, String[] besede) {
		System.out.println(besede[n].charAt(0));
	}

	private static int steviloSoglasnikov(String beseda) {
		int vsota = 0;

		for(char c : beseda.toCharArray()) {
			if(c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
				vsota++;
			}
		}

		return vsota;
	}

	private static void najvecSoglasnikov(String[] besede) {
		String max = "";

		for(String beseda : besede) {
			if(steviloSoglasnikov(beseda) > steviloSoglasnikov(max)) {
				max = beseda;
			}
		}

		System.out.println(max);
	}
}
