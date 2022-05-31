package javabasics;

public class Variables {
/*
 * Variables are containers to store values while the java program is excuted
 * Variables are assigned with data types
 * we have three types of variables
 * local - inside the method
 * global/instance variable - outside the method - inside the class
 * static - out side the method inside the class with static keyword
 * static keywords we can access without creating instance
 */
	boolean b = false; //global variable
	static int a =20; // static variable
	String name ="Java";//global variable
	
	public void add() {
		int x= 10; //local variable
		
	}
	
	/*
	 * Data types specify with different sizes and values that can be stored in the variables  
	 * there are two types of data types primitive and non primitive
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		Variables v=new Variables(); //created instance for access non static global variables
		System.out.println(a);
		System.out.println(v.name);
	}
}
