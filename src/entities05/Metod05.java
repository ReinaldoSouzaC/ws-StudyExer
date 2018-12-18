package entities05;

public class Metod05 {
	public static double IOF = 0.06;
	
	public static double currencyConverter(double amount, double dollarPrice) { 
		return amount * dollarPrice * (1.0 + IOF);
	}
	
}
