package exerciciosVetores;

import java.util.Locale;
import java.util.Scanner;

public class Maior_posicao {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, posM;
		double maiorN;
		
		System.out.println("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();
		
		double[] vect = new double[n];
		
		for (int i=0; i<n; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
		}
		
		maiorN = vect[0];
		posM = 0;
		
		for (int i=1; i<n; i++) {
			if (vect[i] > maiorN) {
				maiorN = vect[i];
				posM = i;
			}
		}
		
		System.out.printf("MAIOR VALOR = %.1f\n", maiorN);
	    System.out.printf("POSICAO DO MAIOR VALOR = %d\n", posM);
		
		sc.close();
	}

}
