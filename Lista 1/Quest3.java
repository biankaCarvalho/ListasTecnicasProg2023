package entities;

import java.util.Locale;
import java.util.Scanner;

public class TerceiraQuestao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner z = new Scanner(System.in);
		
		System.out.print("Insira o valor de A: ");
		int valorA = z.nextInt();
		System.out.print("Insira o valor de B: ");
		int valorB = z.nextInt();
		
		if (valorA == 10) {
			System.out.println("A == 10");
		}
		if (valorA + valorB == 20) {
			System.out.println("A + B == 20");
		}
		if (valorB == 10) {
			System.out.println("B == 10");
		}
		
		
		
		z.close();
	}

}
