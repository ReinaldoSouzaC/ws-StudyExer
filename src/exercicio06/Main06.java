package exercicio06;

import java.util.Locale;
import java.util.Scanner;

import entities06.Metod06;

public class Main06 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		System.out.print("Enter account name: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("Is there a initial deposit value ? (y/n) ");
		char resp = sc.next().charAt(0);
		Metod06 met;
		if (resp == 'y') {
			System.out.print("Enter initial value: $");
			double initialDeposit = sc.nextDouble();
			met = new Metod06(accountNumber, name, initialDeposit);
		}
		else {
			met = new Metod06(accountNumber, name);
		}
		
		System.out.println(name);
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println("Account: " + met);
		
		System.out.println();
		System.out.print("Enter a deposit value: $");
		double deposit = sc.nextDouble();
		met.addDeposit(deposit);
		
		System.out.println();
		System.out.println("Updated data: ");
		System.out.println("Account: " + met);
		
		System.out.println();
		System.out.print("Enter a with draw value: $");
		deposit = sc.nextDouble();
		met.removeDeposit(deposit);
		
		System.out.println();
		System.out.println("Updated data: ");
		System.out.println("Account: " + met);
		
		sc.close();
	}

}
