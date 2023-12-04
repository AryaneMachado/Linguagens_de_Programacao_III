package model;

public class Analyst extends Employee {

	public Analyst(String name, String role, double salary) {
		super(name, "Analista", salary);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double salary() {
		// Implementação da forma de cálculo de salário desse tipo de funcionário:
		
		return baseSalary();
	}
	
	

}
