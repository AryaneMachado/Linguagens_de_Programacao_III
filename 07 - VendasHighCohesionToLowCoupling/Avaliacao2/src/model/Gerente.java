package model;

public class Gerente implements Cargo{
	
	Double salarioFinal;
	Double salarioFixo = 6.000;
	Double valorHora = 250.00; // hora extra
	int qtdSubordinados;
	Double bonus; // por projeto concluido no mês
	
	
	public Double getBonus() {
		return bonus;
	}

	public int getQtdSubordinados() {
		return qtdSubordinados;
	}

	int qtdProjetosConcluidos;

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
		return "Gerente";
	}

	@Override
	public Double calculaSalario(Double qtdHora) {

	return this.salarioFinal = this.salarioFixo + (this.valorHora * this.getQtdHora());
		
	}
	
	
	public Double calculaSalarioLiderGerente(Double qtdHora, int qtdSubordinados, Double bonus) {

		return this.salarioFinal = this.salarioFixo + (this.valorHora * this.getQtdHora()) + 
				(this.getQtdSubordinados() * (this.salarioFixo * 0.01)) + this.getBonus();
			
		}


}
