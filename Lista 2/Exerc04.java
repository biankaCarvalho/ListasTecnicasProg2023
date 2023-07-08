package Lista2;

import java.util.Locale;
import java.util.Scanner;

public class Exerc04 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner z = new Scanner(System.in);
		
		System.out.print("Informe o número: ");
		int numero = z.nextInt();
		
		int i = 0;
		while (i<11) {
			int tabuada = numero * i;
			System.out.println(numero + " x " + i + " = " + tabuada);
			i++;
		}
		
		
		z.close();
	}

}
