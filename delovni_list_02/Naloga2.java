import java.util.ArrayList;

public class Naloga2 {
	private static ArrayList<Integer> tabela = new ArrayList<>();

	public static void main(String[] args) {
		for(int i = -20; i <= 20; i++) {
			tabela.add(f(i));
		}

		lihaStevila(tabela);
		System.out.println();

		System.out.println(povprecje(tabela));
		System.out.println();

		manjsaStevila(123, tabela);
	}

	private static void lihaStevila(ArrayList<Integer> tabela) {
		for(int i : tabela) {
			if(i % 2 != 0) {
				System.out.println(i);
			}
		}
	}

	private static float povprecje(ArrayList<Integer> tabela) {
		int vsota = 0;

		for(int i : tabela) {
			vsota += i;
		}

		return (float) vsota / tabela.size();
	}

	private static void manjsaStevila(int a, ArrayList<Integer> tabela) {
		for(int i : tabela) {
			if(i < a) {
				System.out.println(i);
			}
		}
	}

	public static int f(int x) {
		return x * x * x - 2;
	}
}
