package model;

import java.util.HashMap;
import java.util.Map;

public class DataBase {
	private static Map<String, String[]> products = new HashMap<>();
	
	private static Map<String, PaymentMethod> payments = new HashMap<>();
	
	static {
		products.put("arroz", new String[] {"Arroz Tipo 1", "20"});
		products.put("feijao", new String[] {"Feijão Malícia", "30"});
		products.put("sal", new String[] {"Sal Marino", "8"});
		
		payments.put("cc", new CreditCard(5));
		payments.put("dc", new DebitCard(0));
		payments.put("c", new Cash(5));
		
	}
	
	public static String[] getProductDescription(String key) {
		return products.get(key);
	}
	
	public static PaymentMethod getPayment(String key) {
		return payments.get(key);
	}
}
