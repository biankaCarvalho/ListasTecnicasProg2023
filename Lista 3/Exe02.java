package Lista3;

import java.util.Locale;
import java.util.Scanner;

public class Exe02 {
	
	public static double media (int vet1[], int vet2[]) {
		
		int somaVet1 = 0, somaVet2 = 0;
		for (int i = 0; i < vet1.length; i++) {
			somaVet1 += vet1[i];
		}
		for (int i = 0; i < vet2.length; i++) {
			somaVet2 += vet2[i];
		}
		
		double mediaVet1 = (double) somaVet1 / vet1.length;
		double mediaVet2 = (double) somaVet2 / vet2.length;
		double media = mediaVet1+mediaVet2;
		
		return media;
	}
	
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner z = new Scanner(System.in);
		
		System.out.print("Informe a dimensão do primeiro vetor: ");
		int tamanhoVet1 = z.nextInt();
		System.out.print("Informe a dimensão do segundo vetor: ");
		int tamanhoVet2 = z.nextInt();
		
		int vetor1[] = new int[tamanhoVet1];
		int vetor2[] = new int[tamanhoVet2];
		
		for (int i = 0; i < vetor1.length; i++) {
			vetor1[i] = i;
		}
		for (int i = 0; i < vetor2.length; i++) {
			vetor2[i] = i;
		}
		media(vetor1, vetor2);
		System.out.println("A soma das médias dos vetores é de "+media(vetor1, vetor2));
		
		z.close();
	}

}
