package org.prac;

public class Arraysum {
	public static void main(String[] args) {
		int a[]=new int[3];
		a[0]=20;
		a[1]=30;
		a[2]=20;
		
		for(int i=0; i<a.length; i++) {

		if(a[i]==20) {
			a[i]=100;}
		System.out.println(a[i]);
		}
		
		
		
		/*int b=0;
		 * 
		for(int i=0; i<a.length; i++) {
			b=b+a[i];
			System.out.println(b);
			
	}
		int c=(int)(b/a.length);
		System.out.println(c);*/
	
}}
