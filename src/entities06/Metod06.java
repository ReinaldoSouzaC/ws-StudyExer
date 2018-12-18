package entities06;

public class Metod06 {

	private int accountNumber;
	private String name;
	private double deposit;
	
	public Metod06(int accountNumber, String name) {
		this.accountNumber = accountNumber;
		this.name = name;
	}
	
	public Metod06(int accountNumber, String name, double initialDeposit) {
		this.accountNumber = accountNumber;
		this.name = name;
		addDeposit(initialDeposit);
	}
	
	public void addDeposit(double deposit) {
		this.deposit += deposit;
	}
	
	public void removeDeposit(double deposit) {
		this.deposit -= deposit + 5.00;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public double getDeposit() {
		return deposit;
	}	
	
	public String toString() {
		return getAccountNumber()
				+ ", Holder: "
				+ getName()
				+ ", Balance: $"
				+ String.format("%.2f", getDeposit());
	}
}
