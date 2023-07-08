package Lista3;

import java.util.Locale;
import java.util.Scanner;

public class Exe03 {
	
	public static double mediaPonderada (int vetNotas[], int vetPeso[], int size) {
		
		double media = 0.0;
		for (int i = 0; i < size; i++) {
			media += (double)(vetNotas[i]*vetPeso[i])/size;
		}
		
		return media;
	}

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner z = new Scanner(System.in);
		
		System.out.print("Qual a quantidade de notas que serão informadas? ");
		int quantNotas = z.nextInt();
		int notas[] = new int[quantNotas];
		System.out.print("Informe as notas: ");
		for (int i = 0; i < notas.length; i++) {
			notas[i] = z.nextInt();
		}
		System.out.print("Informe o peso da nota correspondente: ");
		int peso[] = new int[quantNotas];
		for (int i = 0; i < peso.length; i++) {
			peso[i]=z.nextInt();
		}		
		
		mediaPonderada(notas, peso, quantNotas);
		System.out.println("A média ponderada é de "+ mediaPonderada(notas, peso, quantNotas));
		
		z.close();
	}

}
