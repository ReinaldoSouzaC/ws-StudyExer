package exercicio04;

import java.util.Locale;
import java.util.Scanner;

import entiites04.Metod04;

public class Main04 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Metod04 met = new Metod04();
		met.nota1 = sc.nextDouble();
		met.nota2 = sc.nextDouble();
		met.nota3 = sc.nextDouble();
		
		System.out.printf("Final grade: %.2f%n", met.finalGrade());
		
		if(met.finalGrade() < 100 * 60 / 100) {
			System.out.println("FAILED");
			System.out.println(met);
		}
		else {
			System.out.println("PASS");
		}
		
		sc.close();

	}

}
