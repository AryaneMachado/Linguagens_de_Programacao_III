package model;

public class Analista implements Cargo {
	
	Double salarioFinal;
	Double salarioFixo = 2.000;
	Double valorHora = 100.00;


	public void setSalarioFinal(Double salarioFinal) {
		this.salarioFinal = salarioFinal;
	}
	
	private Double getQtdHora() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String descricao() {
		// TODO Auto-generated method stub
		return "Analista";
	}

	@Override
	public Double calculaSalario(Double qtdHora) {

	return this.salarioFinal = this.salarioFixo + (this.valorHora * this.getQtdHora());
		
	}
	



}