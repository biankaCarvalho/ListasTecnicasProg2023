package lista3continuacao;

import java.util.Locale;
import java.util.Scanner;

public class Exe11 {
	
	public static double potencia(int base, int expoente) {
		
		double potencia = Math.pow(base, expoente);
		
		return potencia;
	}

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner z = new Scanner(System.in);
		
		System.out.print("Informe dois números ");
		int base = z.nextInt();
		int expoente = z.nextInt();
		
		System.out.println(potencia(base, expoente));
		
		
		z.close();
	}

}
