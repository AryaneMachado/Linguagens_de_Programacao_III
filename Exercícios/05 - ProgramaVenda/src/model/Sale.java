package model;

import java.util.ArrayList;
import java.util.List;

public class Sale {
	private List<ItemSale> itens;
	
	public Sale() {
		this.itens = new ArrayList<>();
	}
	
	public void addItemSale(ItemSale itemsale) {
		this.itens.add(itemsale);
	}
	
	public List<ItemSale> getItens() {
		return this.itens;
	}
	
}
