package entities;


import java.util.Locale;
import java.util.Scanner;

public class PrimeiraQuestao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner z = new Scanner(System.in);
		
		System.out.print("Insira o valor de A: ");
		int valorA = z.nextInt();
		
		if (valorA>10) {
			System.out.println("A > 10");
		}
		
		System.out.print("Insira o valor de B: ");
		int valorB = z.nextInt();
		
		if (valorA+valorB == 20) {
			System.out.println("A + B == 20");
		}else {
			System.out.println("Número não válido.");
		}
		
		z.close();
	}

}
