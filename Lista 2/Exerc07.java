package Lista2;

import java.util.Locale;
import java.util.Scanner;

public class Exerc07 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner z = new Scanner(System.in);

		int numero = z.nextInt();
		int i = 2;

		for (int j = 1; j < numero; j++) {
			while (i < j) {
				if (j % 2 != 0 && j % 3 != 0 && j % 5 != 0) {
					System.out.println(j + " é um número primo.");
				}
				i++;
			}
		}
		z.close();
	}
}
