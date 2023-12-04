package model;

public interface PaymentMethod {

	String description();
	
	Double value(Double saleValue);
	
}
