package exercicio07;

import java.util.Locale;
import java.util.Scanner;

import entities07.Metod07;

public class Main07 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Metod07[] vect = new Metod07[10];

		System.out.print("How many rooms will be rented? ");
		int rents = sc.nextInt();

		for (int i = 0; i < rents; i++) {
			System.out.println("Rent #" + (i + 1));
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("E-mail: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			vect[room] = new Metod07(name, email, room);
		}

		System.out.println();
		System.out.println("Busy rooms: ");
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] != null) {
				System.out.println(vect[i]);
			}
		}

		sc.close();
	}
}
