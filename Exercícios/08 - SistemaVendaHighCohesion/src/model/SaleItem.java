package model;

public class SaleItem {
	private Product product;
	private int amount;
	
	public SaleItem(String productCode, int amount) {
		String[] prodDesc = DataBase.getProductDescription(productCode);
		
		
		String productDescription = prodDesc[0];
		double productPrice = Double.parseDouble(prodDesc[1]);
		
		this.product = new Product(productDescription, productPrice);
		this.amount = amount;
	}
	
	public Product getProduct() {
		return this.product;
	}
	
	private void setProduct(Product p) {
		this.product = p;
	}
	
	public int getAmount() {
		return this.amount;
	}
	
	public double getSaleItemSubTotal() {
		return this.product.getPrice() * this.amount;
	}
	
	public void createProduct(String name, double price) {
		Product p = new Product(name, price);
		this.setProduct(p);
	}
}
