package javabasics;

import java.util.HashMap;
import java.util.Map;

public class HashMapProgram {
	public static void main(String[] args) {
		HashMap<String,String> hm = new HashMap<String,String>();
		hm.put("Emp Name", "Avinash");
		hm.put("Native", "Anantapur");
		hm.put("Hobbies", "Reading Books");
		
		//System.out.println(hm);
		
		for(Map.Entry m:hm.entrySet()) {
			System.out.println(m.getKey() + " "+m.getValue());
		}
	}
}
