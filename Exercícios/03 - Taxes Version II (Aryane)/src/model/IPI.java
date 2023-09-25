package model;

public class IPI extends Tax {
	
	public IPI() {
		super("IPI", "Imposto sobre Produtos Industrializados", 0);
	}
	
	@Override
	public double calculate(Product p) {
		if(p.getProductNational()) {
			this.setAliquot(8);
			return p.getCostPrice() * this.getAliquot();
		}
		
		setAliquot(10);
		return p.getCostPrice() * this.getAliquot();
	}

}
