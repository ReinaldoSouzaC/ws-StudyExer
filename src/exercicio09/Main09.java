package exercicio09;

import java.util.Locale;
import java.util.Scanner;

public class Main09 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[][] mat = new int[n][m];
		
		for(int i = 0; i<mat.length; i++) {
			for(int j = 0; j<mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		int x = sc.nextInt();
		
		for(int i = 0; i<mat.length; i++) {
			for(int j = 0; j<mat[i].length; j++) {
				if(mat[i][j] == x) {
					System.out.println("Position: " + i + "," + j);
					if(i > 0) { // Up
						System.out.println("Up: " + mat[0][j]);
					}
					if(i < mat.length) { // Down
						System.out.println("Down: " + mat[i + 1][j]);
					}
					if(j < mat[i].length) { // left
						System.out.println("Left: " + mat[i][j - 1]);
					}
					if(j > 0) {
						System.out.println("Right: " + mat[i][j + 1]);
					}
				}
			}
		}
		
		sc.close();

	}

}
