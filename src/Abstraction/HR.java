package Abstraction;

public class HR extends Employee{
	


	HR(double salary) {
		super(salary);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void printSalary(double salary) {
		int s = 50000;
		salary = salary + s;
		System.out.println("Salary of HR is : " + salary);
		
	}
	
	
	@Override
	public void calculateSalary() {
		double revisedSalary = salary - (salary * 0.10);
		System.out.println("Manager's revised salary after 10% deduction : " + revisedSalary);
		
	}


	



}
