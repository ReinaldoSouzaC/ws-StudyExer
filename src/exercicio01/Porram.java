package exercicio01;

import java.util.Locale;
import java.util.Scanner;

import entities.Metod;

public class Porram {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Metod met = new Metod();
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		met.name = sc.nextLine();
		System.out.print("Price: ");
		met.price = sc.nextDouble();
		System.out.print("Quantity: ");
		met.quantity = sc.nextInt();
		
		System.out.println();
		System.out.println(met);
		
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		met.addProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + met);
		
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		met.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + met);
		
		sc.close();

	}

}
