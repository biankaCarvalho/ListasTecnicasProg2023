package lista3continuacao;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Exe13 {
	
	public static void ocorrencia(int vet1[], int vet2[]) {
		
		int vetOcorrencia[] = new int[5];
		Arrays.sort(vet1);
		Arrays.sort(vet2);
		for (int i = 0; i < 5; i++) {
			if(vet1[i]==vet2[i]) {
				vetOcorrencia[i] = vet1[i];
				System.out.print(vetOcorrencia[i]+" ");
			}
		}
	}

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner z = new Scanner(System.in);
		
		int vetor1[] = new int[5];
		System.out.print("Informe os componentes do primeiro vetor: ");
		for (int i = 0; i < 5; i++) {
			vetor1[i]=z.nextInt();
		}
		
		int vetor2[] = new int[5];
		System.out.print("Informe os componentes do segundo vetor: ");
		for (int i = 0; i < 5; i++) {
			vetor2[i]=z.nextInt();
		}
		
		System.out.print("Novo vetor: [");
		ocorrencia(vetor1, vetor2);
		System.out.print("]");
		z.close();
	}

}
