package entities08;

public class Metod08 {

	private int id;
	private String name;
	private double salary;
	
	public Metod08(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public void salaryIncrease(double percentage) {
		this.salary += salary * percentage / 100;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}
	public String toString() {
		return id
				+ ", "
				+ name 
				+ ", "
				+ String.format("%.2f", salary);
	}
}
