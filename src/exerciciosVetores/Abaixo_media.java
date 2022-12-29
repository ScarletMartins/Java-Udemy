package exerciciosVetores;

import java.util.Locale;
import java.util.Scanner;

public class Abaixo_media {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		double media=0.0, soma=0.0;
		
		System.out.print("Quantos elementos terá o vetor? ");
		n = sc.nextInt();
		
		double[] vect = new double[n];
		
		for (int i=0; i<n; i++) {
			System.out.println("Digite um número: ");
			vect[i] = sc.nextDouble();
		}
		
		for (int i=0; i<n; i++) {
			soma += vect[i];
		}
		
		media = soma / n;
		
		System.out.printf("\nMEDIA DO VETOR = %.3f", media);
		System.out.println("\nELEMENTOS ABAIXO DA MEDIA: ");
		
		for (int i=0; i<n; i++) {
			if (vect[i] < media) {
				System.out.printf("%.1f\n", vect[i]);
			}
		}
		
		sc.close();
	}

}
