package org.prac;

public class ReverseString {
	public static void main(String[] args) {
		String s="mageswaran";
		String rev=" ";
		for(int i=9 ; i>=0; i--) {
			char c=s.charAt(i);
		rev=rev+c;
		
	}
		System.out.println(rev);

}
}