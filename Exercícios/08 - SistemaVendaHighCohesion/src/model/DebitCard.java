package model;

public class DebitCard implements PaymentMethod{

	private double discount;
	
	public DebitCard(double discount) {
		this.discount = discount/100;
	}
	
	@Override
	public String description() {
		return "Cartão de Débito";
	}

	@Override
	public Double value(Double saleValue) {
		double value = saleValue - (saleValue * this.discount);
		return value;
	}

}
