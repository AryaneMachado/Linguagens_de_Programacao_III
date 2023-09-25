package model;

import java.util.ArrayList;
import java.util.List;

public class Product {
	private String name;
	private double costPrice;
	private double profit;
	private boolean productNational;
	private List <Tax> taxes;
	
	public Product(String name, double costPrice, double profit, boolean productNational) throws Exception {
		setName(name);
		setCostPrice(costPrice);
		setProfit(profit);
		setProductNational(productNational);
		this.taxes = new ArrayList<>();
	}
	
	public boolean hasIpi() {
		for(Tax tax : taxes) {
			if(tax instanceof IPI) {
				return true;
			}
		}
		return false;
	}
	
	public double getCostPrice() {
		return this.costPrice;
	}
	
	public boolean getProductNational() {
		return this.productNational;
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getProfit() {
		return this.profit;
	}
	
	public boolean addTax(Tax tax) throws Exception{
		
		if(tax == null) {
			throw new Exception("Imposto não deve ser nulo!");
		}
		
		if(taxes.contains(tax)) {
			return false;
		}else {
			taxes.add(tax);
		}
		
		return true;
	}
	
	public double calculateSalePrice() {
		double taxesSum = 0;
		
		for(Tax tax : taxes) {
			taxesSum += tax.calculate(this);
		}
		
		double finalCost = costPrice + taxesSum;
		
		double finalPrice = finalCost + (finalCost * profit);
		
		return finalPrice;
	}

	private void setProfit(double profit) throws Exception{
		if(profit <= 0) {
			throw new Exception("Margem está inválida.");
		}
		this.profit = profit / 100;
	}

	private void setCostPrice(double costPrice) throws Exception{
		if(costPrice <= 0) {
			throw new Exception("Preço de custo inválido.");
		}
		this.costPrice = costPrice;
	}

	private void setName(String name) throws Exception {
		if(name == null || name.equals("")) {
			throw new Exception("Nome inválido.");
		}
		this.name = name;
	}
	
	private void setProductNational(boolean productNational){
		this.productNational = productNational;
	}
}
