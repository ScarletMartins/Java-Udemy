package exerciciosVetores;

import java.util.Locale;
import java.util.Scanner;

public class Negativos {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.println("Quantos números voce vai digitar? ");
		n = sc.nextInt();
		
		int[] vect = new int[n];
		
		for (int i=0; i<n; i++) {
			System.out.println("Digite um número: ");
			vect[i] = sc.nextInt();
		}
		
		System.out.println("NUMERO NEGATIVOS: ");
		
		for (int i=0; i<n; i++) {
			if (vect[i] < 0) {
				System.out.printf("%d\n", vect[i]);
			}
		}
		
		sc.close();

	}

}
