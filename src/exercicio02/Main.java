package exercicio02;

import java.util.Locale;
import java.util.Scanner;

import entities02.Metod02;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Metod02 met = new Metod02();
		System.out.println("Enter rectangle width and height: ");
		met.width = sc.nextDouble();
		met.height = sc.nextDouble();
		
		System.out.println();
		System.out.println("AREA: " + met.area());
		System.out.println("PERIMETER: " + met.perimeter());
		System.out.println("DIAGONAL: " + met.diagonal());
		
		sc.close();

	}

}
