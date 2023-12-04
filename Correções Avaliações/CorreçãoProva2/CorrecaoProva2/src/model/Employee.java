package model;

public abstract class Employee {
	
	private String name;
	private String role; // cargo
	private double salary;
	private double perExtraHour; // valor hora extra
	private double extraHours; // qtd horas extras
	
	public Employee(String name, String role, double salary) {
		this.name = name;
		this.role = role;
		this.salary = salary;
	}
	
	public abstract double salary();

	public String getName() {
		return name;
	}

	public String getRole() {
		return role;
	}
	
	public void setPerExtraHour(double perExtraHour) {
		this.perExtraHour = perExtraHour;
	}
	
	public void setextraHours(double extraHours) {
		this.extraHours = extraHours;
	}

	public double getSalary() {
		return salary;
	}

	public double getPerExtraHour() {
		return perExtraHour;
	}

	public double getExtraHours() {
		return extraHours;
	}
	
	protected double baseSalary() {
		double baseSalary = getSalary();
		double extraEarnings = getExtraHours() * getPerExtraHour();
		
		return baseSalary + extraEarnings;
		
	}
	
	

	
}
