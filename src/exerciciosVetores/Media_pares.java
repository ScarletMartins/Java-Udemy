package exerciciosVetores;

import java.util.Locale;
import java.util.Scanner;

public class Media_pares {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, pares=0, soma=0;
		double media;
		
		System.out.println("Quantos elementos terá o vetor? ");
		n = sc.nextInt();
		
		int[] vect = new int[n];
		
		for (int i=0; i<n; i++) {
			System.out.println("Digite um número: ");
			vect[i] = sc.nextInt();
		}
		
		for (int i=0; i<n; i++) {
			if (vect[i] % 2 == 0) {
				pares++;
				soma += vect[i];
			}
		}
		
		if (pares == 0) {
			System.out.println("NENHUM NÚMERO PAR");
		} else {
			media = soma / pares;
			System.out.printf("MEDIA DOS PARES = %.1f%n", media);
		}
		
		sc.close();
	}

}
