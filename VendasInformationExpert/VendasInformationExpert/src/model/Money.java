package model;

public class Money implements PaymentMethod {

	@Override
	public double calculate(double price) {
		
		double finalPrice = price - (price * 0.05);
		return finalPrice;
	}

}
