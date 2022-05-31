package javabasics;

public class MethodOverloading {

	int a,b,c;
	
	void sum() {
		a = 20;
		b = 30;
		c = a+b;
		System.out.println("Sum of a+b is" +c);
	}
	void sum(int salary, String name) {
		int empsalary = salary; 
		String empname = name;
		System.out.println("Emp Name" +empname+"Emp Salary :" +empsalary);
	}
	
	void sum(int p, int q, int r) {
		
		System.out.println(p+q+r);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading mo = new MethodOverloading();
		mo.sum();
		mo.sum(15552, "Avinash");
		mo.sum(15, 59, 96);
		
	}

}
