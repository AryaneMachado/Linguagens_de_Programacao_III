package model;

import java.util.ArrayList;
import java.util.List;

public class ItemSale {
	private Product product;
	private int quantity;
	
	public ItemSale(Product product, int quantity) {
		this.product = product;
		this.quantity = quantity;
	}
	
	public Product getProduct() {
		return this.product;
	}
	
	public double getQuantity() {
		return this.quantity;
	}
	
	public double calculate() {
		return this.product.getUnitPrice() * this.quantity;
	}
}
