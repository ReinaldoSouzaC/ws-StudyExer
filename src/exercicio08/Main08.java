package exercicio08;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities08.Metod08;

public class Main08 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Metod08> list = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		System.out.println();
		
		for(int i = 0; i<n; i++) {
			System.out.println("Employee #" + (i + 1));
			System.out.print("ID: ");
			int id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			list.add(new Metod08(id, name, salary));
		}
		
		System.out.println();
		System.out.print("Enter the employee name will be salary increase: ");
		int id = sc.nextInt();
		Metod08 emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if(emp == null) {
			System.out.println("Id not found !");
		}
		else {
			System.out.print("Enter the percentage: %");
			double percentage = sc.nextDouble();
			emp.salaryIncrease(percentage);
		}
		
		System.out.println();
		System.out.println("List of employees: ");
		for(Metod08 obj : list) {
			System.out.println(obj);
		}
		
		sc.close();
	}	
}
	
