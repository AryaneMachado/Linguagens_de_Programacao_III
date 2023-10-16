package model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Sale {
	private Date date;
	private List<SaleItem> items;
	private PaymentMethod paymentMethod;
	
	public Sale() {
		this.date = Calendar.getInstance().getTime();
		this.items = new ArrayList<>();
	}
	
	public Date getDate() {
		return this.date;
	}
	
	public List<SaleItem> getSaleItems(){
		return this.items;
	}
	
	public void addSaleItem(SaleItem item) {
		this.items.add(item);
	}
	
	public void addPaymentMethod(PaymentMethod paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	
	public double getTotal() {
		double total = 0;
		
		for (SaleItem saleItem : items) {
			total += saleItem.getSaleItemSubTotal();
			
		}
		
		total = paymentMethod.calculate(total);
		
		return total;
	}
	
	
	
	

	public void setPaymentMethod(PaymentMethod paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
}
