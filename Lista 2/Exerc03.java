package Lista2;

import java.util.Locale;
import java.util.Scanner;

public class Exerc03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner z = new Scanner(System.in);
		
		int numero = 13;
		System.out.print("Adivinhe um número entre 1 a 100!");
		int numUsuario = z.nextInt();
		
		while (numero != numUsuario) {
			if (numUsuario > numero) {
				System.out.print("O número a ser adivinhado é menor; Tente novamente: ");
			}else {
				System.out.print("O número a ser adivinhado é maior; Tente novamente: ");
			}
			numUsuario = z.nextInt();
		}
		
		System.out.println("Parabéns! Você adivinhou o número!");
		
		
		z.close();
	}

}
