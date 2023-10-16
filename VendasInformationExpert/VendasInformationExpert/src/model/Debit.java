package model;

public class Debit implements PaymentMethod{
	
	@Override
	public double calculate(double price) {
		
		return price;
		
	}

}
