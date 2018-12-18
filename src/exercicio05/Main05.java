package exercicio05;

import java.util.Locale;
import java.util.Scanner;

import entities05.Metod05;

public class Main05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price ? ");
		double dollarPrice = sc.nextDouble();
		
		System.out.println();
		System.out.print("How many dollars will be bought? ");
		double amount = sc.nextDouble();
		double result = Metod05.currencyConverter(amount, dollarPrice);
		
		System.out.println();
		System.out.printf("Amount to be paid in real: %.2f", result);
		
		
		sc.close();

	}

}
