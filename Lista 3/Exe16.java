package Lista3;

import java.util.Locale;
import java.util.Scanner;

public class Exe16 {
	
	public static boolean primo(int numero) {
		
		if (numero%2!=0 && numero%3!=0 && numero%5!=0 && numero%7!=0) {
			return true;
		}
		if(numero==2||numero==3||numero==5||numero==7) {
			return true;
		}else
			return false;
	}

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner z = new Scanner(System.in);
		
		System.out.print("Informe um número: ");
		int numero = z.nextInt();
		
		System.out.println("False = não é primo\nTrue = é primo");
		System.out.println(primo(numero));
		
		
		z.close();
	}

}
