package org.prac;

public class StringRev {
	public static void main(String[] args) {
		String s= "hai mages";
		String r="";
		for(int i=s.length()-1; i>=0; i--) {
			char c = s.charAt(i);
			r=r+c;
			
		}
		System.out.println(r);
		
	}

}
