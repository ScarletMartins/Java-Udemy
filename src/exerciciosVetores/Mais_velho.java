package exerciciosVetores;

import java.util.Locale;
import java.util.Scanner;

public class Mais_velho {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, maisVelho, posicaoMaior=0;
		
		System.out.println("Quantas pessoas irá digitar? ");
		n = sc.nextInt();
		
		String[] nome = new String[n];
		int[] idade = new int[n];
		
		for (int i=0; i<n; i++) {
			System.out.printf("Digite os dados da %da pessoa:\n", i + 1);
			System.out.print("Nome: ");
			nome[i] = sc.next();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
		}
		
		maisVelho= idade[0];
		for (int i=0; i<n; i++) {
			if (idade[i] > maisVelho) {
				maisVelho = idade[i];
				posicaoMaior = i;
			}
		}
		
		System.out.printf("PESSOA MAIS VELHA: %s\n", nome[posicaoMaior]);
		
		sc.close();
	}

}
