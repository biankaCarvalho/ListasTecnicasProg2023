package entities;

import java.util.Locale;
import java.util.Scanner;

public class QuartaQuestao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner z = new Scanner(System.in);
		System.out.print("Insira o valor de A: ");
		int valorA = z.nextInt();
		System.out.print("Insira o valor de B: ");
		int valorB = z.nextInt();
		
		if (valorA > 10||valorA + valorB == 20) {
			System.out.println("Número válido.");
		}else {
			if (valorA == valorB) {
				System.out.println("A é igual a B\nA e B são diferentes de 10\nA é menor que 10.");
			}else {
				System.out.println("Número não válido.");
			}
		}
		
		z.close();
	}

}
