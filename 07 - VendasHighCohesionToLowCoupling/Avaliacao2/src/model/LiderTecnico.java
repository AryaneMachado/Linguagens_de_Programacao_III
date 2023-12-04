package model;

public class LiderTecnico implements Cargo{
	
	Double salarioFinal;
	Double salarioFixo = 5.000;
	Double valorHora = 150.00; // hora extra
	int qtdMembros; //qtd de membros da equipe que lidera

	public int getQtdMembros() {
		return qtdMembros;
	}

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
		return "Líder Técnico";
	}

	@Override
	public Double calculaSalario(Double qtdHora) {

	return this.salarioFinal = this.salarioFixo + (this.valorHora * this.getQtdHora());
		
	}
	
	public Double calculaSalarioLiderTecnico(Double qtdHora, int qtdMembros) {

		return this.salarioFinal = this.salarioFixo + (this.valorHora * this.getQtdHora()) + 
				(this.getQtdMembros() * (this.salarioFixo * 0.05));
			
		}



}
