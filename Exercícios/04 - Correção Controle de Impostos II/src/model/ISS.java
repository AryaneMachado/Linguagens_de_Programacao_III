package model;

public class ISS extends Tax{

	public ISS() {
		super("ISS", "Imposto Sobre Servico", 5);
	}
	
	@Override
	public double calculate(Product p) {
		double profitPrice = p.getCostPrice() * p.getProfit();
		return (p.getCostPrice() + profitPrice) * this.getAliquot();
	}
}
