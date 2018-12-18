package exercicio03;

import java.util.Locale;
import java.util.Scanner;

import entities03.Metod03;

public class Main03 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Metod03 met = new Metod03();
		
		System.out.print("Name: ");
		met.name = sc.nextLine();
		System.out.print("Gross Salary: ");
		met.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		met.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee: " + met);
		
		System.out.println();
		System.out.print("Which percentage to increase salary ?");
		int percentage = sc.nextInt();
		met.increaseSalary(percentage);
		
		System.out.println();
		System.out.println("Updated data: " + met);
		
		sc.close();
		
	}
}
