package exerciciosVetores;

import java.util.Locale;
import java.util.Scanner;

public class Dados_pessoas {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, homens=0, mulheres=0;
		double alturaM=0.0, maisAlto, maisBaixo;
		
		System.out.println("Quantas pessoas serão digitadas? ");
		n = sc.nextInt();
		
		char[] genero = new char[n];
		double[] altura = new double[n];
		
		for (int i=0; i<n; i++) {
			System.out.printf("Altura da %da pessoa ", i + 1);
			altura[i] = sc.nextDouble();
			System.out.printf("Genero da %da pessoa ", i + 1);
			genero[i] = sc.next().charAt(0);
		}
		
		maisAlto = altura[0];
		maisBaixo = altura[0];
		
		for (int i=0; i<n; i++) {
			if (altura[i] > maisAlto) {
				maisAlto = altura [i];
			}
			if (altura[i] < maisBaixo) {
				maisBaixo = altura [i];
			}
		}
		
		for (int i=0; i<n; i++) {
			if (genero[i] == 'M') {
				homens++;
			} else {
				mulheres++;
				alturaM = alturaM + altura[i];
			}
		}
		
		alturaM = alturaM / mulheres;
		
		System.out.printf("Menor altura = %.2f\n", maisBaixo);
		System.out.printf("Maior altura = %.2f\n", maisAlto);
		System.out.printf("Media de altura das mulheres = %.2f\n", alturaM);
		System.out.println("Numero de homens = " + homens);
		
		sc.close();
	}

}
