package entities;

public class Employee {
	
	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		return grossSalary - tax;
	}
	
	public double increaseSalary(double percentagem) {
		return this.netSalary() + (percentagem/100) * grossSalary; 
	}

}
