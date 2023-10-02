package view;

import model.ItemSale;
import model.Product;
import model.Sale;

public class Invoice {
	private Sale sale;
	private double finalPrice;
	
	public Invoice(Sale sale) {
		this.sale = sale;
	}
	
	public void printInvoice() {
		for(ItemSale item : sale.getItens()) {
			Product product = item.getProduct();
			double quantity = item.getQuantity();
			
			System.out.println(product.getName() + " - " + "R$" + product.getUnitPrice() + " - Quantidade: " + quantity);
			this.finalPrice += item.calculate();
		}
		
		System.out.println("Preço total: R$" + this.finalPrice);
	}
}
