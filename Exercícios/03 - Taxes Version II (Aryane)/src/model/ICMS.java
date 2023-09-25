package model;

public class ICMS extends Tax{

	public ICMS() {
		super("ICMS", "Imposto sobre Circulação de Produtos e Mercadorias", 0);
	}
	
	public void setAliquot(Product product) {
		if(product.hasIpi()) {
			setAliquot(7);
		}else {
			setAliquot(5);
		}
	}
	
	@Override
	public double calculate(Product p) {
		setAliquot(p);
		return p.getCostPrice() * this.getAliquot();
	}
	
}
