package javabasics;

class Employee{
	int empid;
	String empname;
	int empsalary;
	void display() {
		System.out.println("Employee ID : "+empid);
		System.out.println("Employee Name : "+empname);
		System.out.println("Employee Salary : "+empsalary);
	}
}

class Department extends Employee{
	int a;
	int b;
	void sum() {
		System.out.println("Sum of a,b : "+a+b);	
	}
	
}

public class Inhertiance {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.empid=121;
		emp.empname="Avinash";
		emp.empsalary=120000;
		emp.display();
		
		Department dep = new Department();
		dep.empid = 125;
		dep.empname = "TechSravi";
		dep.empsalary = 150000;
		dep.display();
	}
}
