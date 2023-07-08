package Lista3;

import java.util.Locale;
import java.util.Scanner;

public class Exe12 {
	
	public static void verificarPrimo(int numero) {
		
		if(numero%2!=0 && numero%3!=0 && numero%5!=0 && numero%7!=0) {
			System.out.println("O número "+numero+" é primo.");
		}else {
			if(numero==2 || numero==3 || numero==5 || numero==7) {
				System.out.println("O número "+numero+" é primo.");
			}else {
			System.out.println("O número "+numero+" não é primo.");
			}
		}
		
	}

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner z = new Scanner(System.in);
		
		System.out.print("Informe um número: ");
		int numero = z.nextInt();
		verificarPrimo(numero);
		
		z.close();
	}

}
