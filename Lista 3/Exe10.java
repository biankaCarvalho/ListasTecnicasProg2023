package Lista3;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Exe10 {
	
	public static void verificarIgualdade(int vet1[], int vet2[]) {
		Arrays.sort(vet1);
		Arrays.sort(vet2);
		
		for (int i = 0; i < 5; i++) {
			if(vet1[i]==vet2[i]) {
				System.out.println(vet1[i] + " = " + vet2[i]);
			}else {
				System.out.println(vet1[i] + " != " + vet2[i]);
			}
		}
	}
	

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner z = new Scanner(System.in);
		
		int vetor1[] = new int[5];
		System.out.print("Elementos do vetor 1: ");
		for (int i = 0; i < vetor1.length; i++) {
			vetor1[i] = z.nextInt();
		}
		
		int vetor2[] = new int[5];
		System.out.print("Elementos do vetor 2: ");
		for (int i = 0; i < vetor2.length; i++) {
			vetor2[i] = z.nextInt();
		}
		
		verificarIgualdade(vetor1, vetor2);
		
		z.close();
	}

}
