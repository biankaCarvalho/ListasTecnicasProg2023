package lista3continuacao;

import java.util.Locale;
import java.util.Scanner;

public class Exe07 {
	
//	public static boolean verificarOrdem(int vetor[]) {
//		
//		for (int i = 0; i < 5; i++) {
//			if(vetor[i]>vetor[i+1]) {
//				return true;
//			}
//				return false;
//			}
//		}

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner z = new Scanner(System.in);
		
		int vetor[] = new int[5];
		System.out.print("Informe os componentes do vetor: ");
		for (int i = 0; i < 5; i++) {
			vetor[i] = z.nextInt();
		}
	//	System.out.println(verificarOrdem(vetor));
		
		z.close();
	}

}
