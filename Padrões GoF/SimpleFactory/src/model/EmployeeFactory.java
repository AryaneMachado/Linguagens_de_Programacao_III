package model;

public class EmployeeFactory {

	public static Employee createEmployee(EmployeeType id, String name, double salary, int subs, double percentual) {

		switch (id) {
		case ANALYST: {
			return new Analyst(name, salary);
		}

		case ARCHITECT: {
			return new Architect(name, salary, percentual, 0);
		}

		case MANAGER: {
			return new Manager(name, salary, subs, percentual, 0, 0);
		}

		case TECLEADER: {
			return new TecLeader(name, salary, subs, percentual);
		}

		default:
			return null;
		}

	}
}
