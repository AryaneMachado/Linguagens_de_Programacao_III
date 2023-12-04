package model;

public class Arquiteto implements Cargo{

	Double salarioFinal;
	Double salarioFixo = 4.000;
	Double valorHora = 200.00; // hora extra
	int qtdProjeto; // qtd de projetos que está envolvido

	public void setSalarioFinal(Double salarioFinal) {
		this.salarioFinal = salarioFinal;
	}
	
	public int getQtdProjeto() {
		return qtdProjeto;
	}
	
	private Double getQtdHora() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String descricao() {
		// TODO Auto-generated method stub
		return "Arquiteto";
	}

	@Override
	public Double calculaSalario(Double qtdHora) {

	return this.salarioFinal = this.salarioFixo + (this.valorHora * this.getQtdHora());
		
	}
	
	public Double calculaSalarioAquiteto(Double qtdHora, int qtdProjeto) {

		return this.salarioFinal = this.salarioFixo + (this.valorHora * this.getQtdHora()) + 
				(this.getQtdProjeto() * (this.salarioFixo * 0.02));
			
		}




}
