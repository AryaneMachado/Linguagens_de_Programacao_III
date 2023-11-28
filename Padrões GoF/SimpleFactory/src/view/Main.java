package view;

import model.Employee;
import model.EmployeeFactory;
import model.EmployeeType;

public class Main {

	public static void main(String[] args) {

		Employee objEmployee = EmployeeFactory.createEmployee(EmployeeType.MANAGER, "Salomão", 200000, 5, 8);
		
		System.out.println(objEmployee);
	}
}
