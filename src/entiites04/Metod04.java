package entiites04;

public class Metod04 {

	public double nota1;
	public double nota2;
	public double nota3;
	
	public double finalGrade() {
		return nota1 + nota2 + nota3;
	}
	public double missing() {
		return 60 - finalGrade();
	}
	
	public String toString() {
		return  "MISSING: "
				+ String.format("%.2f", missing());
	}
}
