package javabasics;

class Bank{
	
	int rateofintrest() {
		return 0;
	}
}

class Icici extends Bank{
	
	int rateofintrest() {
		return 10;
	}
	
}
class Hdfc extends Bank{
	int rateofintrest() {
		return (int) 7.5;
	}
}
class Idbi extends Bank{
	int rateofintrest() {
		return (int) 12.5;
	}
	
}

public class Overrriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Icici ic=new Icici();
		System.out.println(ic.rateofintrest());
		
		Hdfc hd=new Hdfc();
		System.out.println(hd.rateofintrest());	
		
		
		Idbi id=new Idbi();
		System.out.println(id.rateofintrest());
	}

}
