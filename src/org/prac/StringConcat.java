package org.prac;

public class StringConcat {
	public static void main(String[] args) {
		/*String s1="mages";
		String s2="waran";
		String a = s1.concat(s2);
		System.out.println(a);*/
		
		StringBuffer s1=new StringBuffer("mageswaran");
		
		StringBuffer s2=new StringBuffer("govindasamy");
		s1.append(s2);
		System.out.println(s1);
	
		
		
	}
	
	

}
