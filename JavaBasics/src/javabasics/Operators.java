package javabasics;

public class Operators {

	/*operator in java called symbol. it is used to perform mathematical operations. ex : +,-,*,*,%,etc...  
	 * there are different types of operators in java
	 * Arithmetic Operators (+,-,*,/,%,++,--)
	 * Relational operators (==,!=,>,<,>=,<=)
	 * Logical Operators(&&,||,!(logic))
	 * Assignment operators(=,+=,-=,*=)
	 * Misc Operators(conditional, )     
	 * 
	 */
	
	
	
	public static void main(String[] args) {
	
		int x=30,y=10;
		int p=5,q=10;
		//Arithmetic Operators (+,-,*,/,%,++,--)
		int a= x+y;
		int b=x-y;
		int c= x*y;
		int d = x/y;
		int e = x%y;
		int r = ++p;
		int s = --q;
		System.out.println("Addition of x,y :"+a);
		System.out.println("Subsraction of x,y :"+b);
		System.out.println("Multiply of x,y :"+c);
		System.out.println("division of x,y :"+d);
		System.out.println("Module of x,y :"+e);
		System.out.println("Increment of x :"+r);
		System.out.println("Decrement of x,y :"+s);
		
		//conditional operators or Ternary operator 
		int t = (x>y)?x:y;
		System.out.println(t);
		
	}
}
