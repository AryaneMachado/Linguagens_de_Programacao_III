package view;

import model.ItemSale;
import model.Product;
import model.Sale;

public class Main {

	public static void main(String[] args) {
		Product arroz = new Product("Arroz 5KG", 5.50);
		ItemSale itemArroz = new ItemSale(arroz, 10);
		
		Sale venda = new Sale();
		venda.addItemSale(itemArroz);
		
		Invoice notaFiscal = new Invoice(venda);
		
		notaFiscal.printInvoice();

	}

}
