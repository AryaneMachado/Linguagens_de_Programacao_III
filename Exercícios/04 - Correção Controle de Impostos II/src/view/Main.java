package view;

import model.ICMS;
import model.IPI;
import model.ISS;
import model.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		IPI ipi = new IPI();
		ICMS icms = new ICMS();
		ISS iss = new ISS();
		
		Product arroz = new Product("Arroz", 7.00, 20, true);
		arroz.addTax(icms);
		arroz.addTax(iss);
		
		Product feijao = new Product("Feijão", 7.00, 25, true);
		feijao.addTax(icms);

		Product carne = new Product("Carne", 7.00, 35, true);
		carne.addTax(icms);
		carne.addTax(ipi);
		
		Product cerveja = new Product("Cerveja", 7.00, 30, false);
		cerveja.addTax(icms);
		cerveja.addTax(iss);
		cerveja.addTax(ipi);
		
		Product gas = new Product("Gás", 7.00, 15, true);
		gas.addTax(icms);
		gas.addTax(ipi);
		
		Product gasolina = new Product("Gasolina", 7.00, 15, true);
		gasolina.addTax(icms);
		
		System.out.printf("Preço final do arroz: R$%.2f\n", arroz.calculateSalePrice());
		System.out.printf("Preço final do feijão: R$%.2f\n", feijao.calculateSalePrice());
		System.out.printf("Preço final da carne: R$%.2f\n", carne.calculateSalePrice());
		System.out.printf("Preço final da cerveja: R$%.2f\n", cerveja.calculateSalePrice());
		System.out.printf("Preço final do gás: R$%.2f\n", gas.calculateSalePrice());
		System.out.printf("Preço final da gasolina: R$%.2f\n", gasolina.calculateSalePrice());
		
	}

}
