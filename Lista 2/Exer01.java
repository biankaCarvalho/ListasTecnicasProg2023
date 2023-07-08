package Lista2;

import java.util.Locale;
import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner z = new Scanner(System.in);
		
		for (int i = 0; i < 101; i++) {
			if (i%2 == 0) {
				System.out.println(i);
			}
		}
		z.close();
	}

}
