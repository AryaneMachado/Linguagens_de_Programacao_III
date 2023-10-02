package view;

import model.Product;
import model.Sale;
import model.SaleItem;

public class main {

	public static void main(String[] args) {
		
		Product arroz = new Product("Arroz Pileco T1", 15);
		Product feijao = new Product("Feijão Malícia", 20);
		
		
		Sale sale = new Sale();
		SaleItem siArroz = new SaleItem(arroz, 3);
		SaleItem siFeijao = new SaleItem (feijao, 2);
		
		System.out.println(String.format("Venda - #1234 - %s", 
				sale.getDate().toLocaleString()));
		
		for(SaleItem saleItem : sale.getSaleItems()) {
			System.out.println(saleItem.getProduct().getDescription() + " - ");
			System.out.println(saleItem.getAmount() + " - ");
			System.out.println("R$" + saleItem.getProduct().getPrice() + " - ");
			System.out.println("R$" + saleItem.getSaleItemSubTotal() + "\n");
			
		}
		
		System.out.println("Total: R$"+sale.getTotal());
		
		
		
	

}


}
	
	
	
	
	
	
	
	
	
	
	
	
	//EXPLICAÇÃO USO DO FOR EACH:
	
	/*int [] numbers = new int[5];
		
		numbers[0] = 2;
		numbers[1] = 4;
		numbers[2] = 6;
		numbers[3] = 8;
		numbers[4] = 10;
		
		for(int u: numbers) {
			System.out.print(u);
			
		}
		
		for (int i = 0; i<5; i++) {
			System.out.println(numbers[i]);
		}
		

	}*/