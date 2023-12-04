package model;

public class TecLeader extends Employee{
	
	private int subordinados;
	private double percentPerSubordinado;

	public TecLeader(String name, double salary, int subs, double percent) {
		super(name, "Líder Técnico", salary);
		// TODO Auto-generated constructor stub
		
		this.subordinados = subs;
		this.percentPerSubordinado = percent / 100;
	}

	@Override
	public double salary() {
		// Implementação da forma de cálculo de salário desse tipo de funcionário:
		
		double valuePerS
		
	}
	
	

}

}
