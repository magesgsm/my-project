package org.prac;

public class Single {
	 private void empmail() {
      System.out.println("rajesh");
	}
	
	public static void main(String[] args) {
		Single b=new Single();
		Singleton a = Singleton.add();
		a.empId();
		a.empName();
		b.empmail();
		
		
		
	}

}
