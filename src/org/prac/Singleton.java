package org.prac;

public class Singleton {

	static Singleton amp;

	/*private Singleton() {

	}
*/
	public static Singleton add() {
		if (amp == null) 
			amp = new Singleton();
			return amp;
		
	}

	public void empId() {
		System.out.println("1234566");

	}
	public void empName() {
  System.out.println("mages");
	}

	public static void main(String[] args) {
		Singleton a=add();
		

	}

}
