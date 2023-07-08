package Lista2;

import java.util.Locale;
import java.util.Scanner;

public class Exerc08 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner z = new Scanner(System.in);

		System.out.print("Informe uma expressão matemática: ");
		String expressao = z.nextLine();

		if (verificaExpressao(expressao)) {
			System.out.println("A expressão está bem formada.");
		} else {
			System.out.println("A expressão não está bem formada.");
		}
		z.close();
	}

	public static boolean verificaExpressao(String expressao) {
		int abertos = 0;

		for (int i = 0; i < expressao.length(); i++) {
			char c = expressao.charAt(i);

			if (c == '(' || c == '[' || c == '{') {
				abertos++;
			} else if (c == ')' || c == ']' || c == '}') {
				if (abertos == 0) {
					return false;
				}
				abertos--;
			}
		}

		return abertos == 0;
	}

}
