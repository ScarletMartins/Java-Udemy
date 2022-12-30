package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pensionato;

public class ProgramPensionato {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n;

		Pensionato[] vect = new Pensionato[10];

		System.out.println("How many rooms will be rented? ");
		n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("\nRent #" + i + ":");
			System.out.print("\nName: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("E-mail: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();

//			Pensionato pensionato = new Pensionato(name, email);

			vect[room] = new Pensionato(name, email);
		}

		System.out.println("\nBusy rooms: ");
		for (int i = 0; i < 10; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}
		sc.close();

	}

}
