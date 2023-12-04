package model;

public class Cash implements PaymentMethod{

	private double discount;
	
	public Cash(double discount) {
		this.discount = discount/100;
	}
	
	@Override
	public String description() {
		return "Dinheiro/Pix";
	}

	@Override
	public Double value(Double saleValue) {
		double value = saleValue - (this.discount * saleValue);
		return value;
	}

	
}
