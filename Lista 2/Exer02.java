package Lista2;

import java.util.Locale;
import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner z = new Scanner(System.in);
		
		int num, soma=0;
		do {
			num = z.nextInt();
			if (num>0) {
				soma= soma + num;
			}
		}while(num>0);
		System.out.println(soma);
		
		
		z.close();
	}

}
