package model;

public class SaleItem {
	
	private Product product;
	private int amount;
	
	public SaleItem(int productCode, int amount) {
		
		//Precisamos da descrição e do preço do produto
		
		String productDescription = "";
		double productPrice = 0.0;
		this.productCode = new Product( , productPrice);
		this.amount = amount;
	}
	
	public Product getProduct() {
		return this.product;
		
	}
	
	public int getAmount() {
		return this.amount;
	}
	
	public double getSaleItemSubTotal() {
		return this.amount * this.product.getPrice();
	}

}
