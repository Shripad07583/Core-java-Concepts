package Abstraction;

public class Manager extends Employee{

//	Manager(double salary) {
//		super(salary);
//		// TODO Auto-generated constructor stub
//	}
//	
	
	Manager(double salary) {
		super(salary);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void printSalary(double salary) {
		double s = 90000;
		salary = salary + s;
		System.out.println("Salary of Manager is : " + salary);
		
	}
	
	
	@Override
	public void calculateSalary() {
		double revisedSalary = salary - (salary * 0.10);
		System.out.println("Manager's revised salary after 10% deduction : " + revisedSalary);
		
	}


	


}
