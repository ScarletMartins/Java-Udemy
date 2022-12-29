package exerciciosVetores;

import java.util.Locale;
import java.util.Scanner;

public class Alturas {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, menores = 0;
		double somaA=0.0, mediaA, percentualMenores;
		
		System.out.print("Quantas pessoas serão digitadas? ");
		n = sc.nextInt();
		
		String[] name = new String[n];
		int[] idade = new int[n];
		double[] altura = new double[n];
		
		
		for (int i=0; i<n; i++) {
			System.out.printf("\nDados da %da pessoa\n", i + 1);
			System.out.print("\nNome: ");
			name[i] = sc.next();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
			System.out.print("Altura: ");
			altura[i] = sc.nextDouble();
		}
		
		for (int i=0; i<n; i++) {
			somaA += altura[i];
		}
		
		System.out.printf("\nAltura média: %.2f", mediaA = somaA / n);
		
		for (int i=0; i<n; i++) {
			if (idade[i] < 16) {
				menores++;
			}
		}
		
		percentualMenores = ((double)menores / n) * 100.0;
		
		System.out.printf("\nPessoas com menos de 16 anos: %.1f%%\n", percentualMenores);
		
		for (int i=0; i<n; i++) {
			if (idade[i] < 16) {
				System.out.printf("%s\n", name[i]);
			}
		}
		
		sc.close();
	}

}
