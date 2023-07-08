package entities;

import java.util.Locale;
import java.util.Scanner;

public class SetimaQuestao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner z = new Scanner(System.in);
		
		System.out.print("Insira o valor de A: ");
		int valorA = z.nextInt();
		System.out.print("Insira o valor de B: ");
		int valorB = z.nextInt();
		
		if (valorA > 10 || valorA + valorB == 20) {
			if (valorA < 10) {
				System.out.println("Número não válido;");
			}else {
				System.out.println("Números válidos;");
			}
		}
		z.close();
	}

}
