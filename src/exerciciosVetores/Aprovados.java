package exerciciosVetores;

import java.util.Locale;
import java.util.Scanner;

public class Aprovados {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		double media=0.0;
		
		System.out.println("Quantos alunos serão digitados? ");
		n = sc.nextInt();
		
		String[] nome = new String[n];
		double[] n1 = new double[n];
		double[] n2 = new double[n];
		
		for (int i=0; i<n; i++) {
			System.out.printf("\nDigite nome, primeira e segunda nota do %do aluno\n",  i + 1);
			sc.nextLine();
			System.out.println("Nome: ");
			nome[i] = sc.nextLine();
			System.out.println("Nota primeiro semestre: ");
			n1[i] = sc.nextDouble();
			System.out.println("Nota segunda semestre: ");
			n2[i] = sc.nextDouble();
		}
		
		System.out.println("Alunos aprovados: ");
		
		for (int i=0; i<n; i++) {
			media = (n1[i] + n2[i]) / 2;
			
			if (media >= 6.0) {
				System.out.printf("%s\n", nome[i]);
			}
		}
		
		sc.close();
	}

}
