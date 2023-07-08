package Lista3;

import java.util.Locale;
import java.util.Scanner;

public class Exe01 {

	public static int somatorio(int vet[]) {

		int somatorio = 0;
		for (int i = 2; i < vet.length - 2; i++) {
			somatorio += vet[i];
		}
		return somatorio;
	}

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner z = new Scanner(System.in);

		System.out.print("Informe a dimensão do vetor: ");
		int tamanho = z.nextInt();

		int vetor[] = new int[tamanho];
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = i;
			System.out.println("Vetor: " + vetor[i]);
		}
		somatorio(vetor);
		System.out.println(somatorio(vetor));

		z.close();
	}

}
