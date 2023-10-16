package view;

import model.Sale;

public class main {

	public static void main(String[] args) {
		
		/*Product arroz = new Product("Arroz Pileco T1", 15);
		Product feijao = new Product("Feijão Malícia", 20);
		Product sal = new Product("Sal Cisne", 3);
		
		SaleItem siArroz = new SaleItem(arroz, 3);
		SaleItem siFeijao = new SaleItem (feijao, 2);
		SaleItem siSal = new SaleItem(sal, 2);*/
		
		Sale sale = new Sale();
		sale.addSaleItem(1, 3); // recebe código e quantidade de produto
		sale.addSaleItem(2, 2);
		sale.addSaleItem(3, 1);
		
		
		System.out.println(String.format("Venda - #1234 - %s", 
				sale.getDate().toLocaleString()));
		
		for(SaleItem saleItem : sale.getSaleItems()) {
			System.out.print(saleItem.getProduct().getDescription() + " - ");
			System.out.print(saleItem.getAmount() + " - ");
			System.out.print("R$" + saleItem.getProduct().getPrice() + " - ");
			System.out.print("R$" + saleItem.getSaleItemSubTotal() + "\n");
			
		}
		
		System.out.print("Total: R$" + sale.getTotal());
		
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