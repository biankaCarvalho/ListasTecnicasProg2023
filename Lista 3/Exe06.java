package Lista3;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Exe06 {
	
	public static void ordenarVetor (int vet[], int size) {
		Arrays.sort(vet);
		System.out.println("Vetor ordenado em ordem crescente:");
		for (int i = 0; i < vet.length; i++) {
			System.out.println(vet[i]);
		}
	}
		
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner z = new Scanner(System.in);
		
		System.out.print("Informe o tamanho do vetor: ");
		int size = z.nextInt();
		int vetor[] = new int[size];
		
		System.out.print("Informe os valores: ");
		for (int i = 0; i < size; i++) {
			vetor[i] = z.nextInt();
		}
		
		System.out.println("Vetor atual: ");
		for (int i = 0; i < size; i++) {
			System.out.println(vetor[i]);
		}
		
		ordenarVetor(vetor, size);
		
		
		z.close();
	}

}
