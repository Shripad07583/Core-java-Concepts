package Abstraction;

public abstract class Employee {

	double salary;
	
	Employee(double salary){
		this.salary = salary;
	}
	
	public abstract void printSalary(double salary);
	
	
	public abstract void calculateSalary();
	
	
	
	
	//Task -1
	//Pass salary of Manager of HR from Demo class 
	//using constructor
	// for manager deduct - 10 % and print salary
	// for HR deduct 20% and print salary
	//inputs should be provided by scanner 
	// scanner should give options -> HR salary or manager salary
	//Enter salary
	//print revised salary after deduction
	
	


}
