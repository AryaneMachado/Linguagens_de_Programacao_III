package model;

public class Architect extends Employee {
	
	private int projects;
	private double percentualPerProject; // Percentual por projeto
	
	public Architect(String name,double salary, int projects, double percentual) {
		super(name, "Arquiteto", salary);
		
		this.projects = projects;
		this.percentualPerProject = percentual / 100;
	
	}

	@Override
	public double salary() {
		// Implementação da forma de cálculo de salário desse tipo de funcionário:
		
		double baseSalary = getSalary(); // Atribuição
		double extraEarnings = getExtraHours() * getPerExtraHour();
		
		double bonusPerProject = getSalary() * percentualPerProject;
		double extraBonus = 
	}
	

}
