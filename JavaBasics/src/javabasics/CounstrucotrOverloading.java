package javabasics;

public class CounstrucotrOverloading {

	int x=0, y=0,z=0;
	String name = "Avinash";
	CounstrucotrOverloading(){
		x=50;
		y=60;
		z=70;
	}
	
	CounstrucotrOverloading(int a, int b, int c){
		x=a;
		y=b;
		z=c;
	}
	
	CounstrucotrOverloading(int a, String empname){
		x=a;
		name=empname;
		
	}
	void display() {
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(name);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CounstrucotrOverloading co = new CounstrucotrOverloading();
		co.display();
	}

}
