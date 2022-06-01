package javabasics;

class Employee1{
	int empid;
	String empname;
	int empsalary;
	void display() {
		System.out.println("Employee ID : "+empid);
		System.out.println("Employee Name : "+empname);
		System.out.println("Employee Salary : "+empsalary);
	}
}

class Department1 extends Employee{
	int a;
	int b;
	void sum() {
		System.out.println("Sum of a,b : "+(a+b));	
	}
	
}
class Department2 extends Department1{
	int x;
	int y;
	void substraction() {
		System.out.println("Sum of a,b : "+(x-y));	
	}
	
}

public class MultiLevelInheritance {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.empid=121;
		emp.empname="Avinash";
		emp.empsalary=120000;
		emp.display();
		
		Department1 dep1 = new Department1();
		dep1.empid = 125;
		dep1.empname = "TechSravi";
		dep1.empsalary = 150000;
		dep1.display();
		
		Department2 dep2 = new Department2();
		dep2.a = 50;
		dep2.b = 100;
		dep2.sum();

	}

}
