package model;

public class CreditCard implements PaymentMethod{

	@Override
	public double calculate(double price) {
		
		double finalPrice = price *  1.05;
		return finalPrice;
	}

}
