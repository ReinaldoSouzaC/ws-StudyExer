package entities;

import java.util.Scanner;

public class Metod {
	
	public String name;
	public int quantity;
	public double price;
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	public String toString() {
		return  name
				+ ", $"
				+ String.format("%.2f", price)
				+ ", "
				+ quantity
				+ " units, total value $"
				+ String.format("%.2f", totalValueInStock());
	}
}
