package exerciciosVetores;

import java.util.Locale;
import java.util.Scanner;

public class Numeros_pares {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n, pares;

		System.out.print("Quantos números voce vai digitar? ");
		n = sc.nextInt();

		int[] vect = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Digite um número: ");
			vect[i] = sc.nextInt();
		}

		System.out.println("\nNumeros pares: ");

		pares = 0;
		for (int i = 0; i < n; i++) {
			if (vect[i] % 2 == 0) {
				System.out.printf("%d ", vect[i]);
				pares++;
			}
		}

		System.out.println("\nQuantidades de pares = " + pares);

		sc.close();
	}

}
