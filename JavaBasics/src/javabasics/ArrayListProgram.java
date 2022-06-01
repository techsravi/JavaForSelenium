package javabasics;

import java.util.ArrayList;

public class ArrayListProgram {

	public static void main(String[] args) {
		
		/*ArrayList<String> empnames=new ArrayList<String>();		
		
		empnames.add("Jhon");
		empnames.add("Marsh");
		empnames.add("Rose");
		empnames.add("Jack");
		
		System.out.println(empnames.size());
		
		for(String s:empnames) {
			System.out.println(s);
		}*/
		
		ArrayList empnames=new ArrayList();		
		
		empnames.add("Jhon");
		empnames.add(125);
		empnames.add(56.28);
		empnames.add(true);
		
		System.out.println(empnames.size());
		
		for(Object s:empnames) {
			System.out.println(s);
		}
		
		empnames.add(3,"Avinash");
		
		for(Object s:empnames) {
			System.out.println(s);
		}
		
		

	}
}
