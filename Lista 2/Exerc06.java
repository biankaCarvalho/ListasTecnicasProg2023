package Lista2;

import java.util.Locale;
import java.util.Scanner;

public class Exerc06 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner z = new Scanner(System.in);
		
		int n = z.nextInt();
		int[][] matriz = new int[n][n];
		
		for(int i = 0; i<n; i++) {
			for (int j = 0; j<n; j++) {
				matriz[i][j] = z.nextInt();
			}
		}
		System.out.println(matriz[n][n]);
		
		
		
		
		z.close();
	}

}
