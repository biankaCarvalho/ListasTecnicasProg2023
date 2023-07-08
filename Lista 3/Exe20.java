package Lista3;

import java.util.Locale;
import java.util.Scanner;

public class Exe20 {
	
	public static void diminuirVetor (int vetor[], int size) {
		
		for (int i = vetor.length; i >= 1; i--) {
			size = i;
			System.out.println("Tamanho atual do vetor: "+size);
		}
		
		System.out.println("Tamanho final do vetor: "+size);
	}

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner z = new Scanner(System.in);
		
		System.out.print("Informe o tamanho do vetor: ");
		int size = z.nextInt();
		int vetor[] = new int[size];

		diminuirVetor(vetor, size);
		
		z.close();
	}

}
