package org.map;


import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Ques1 {
	public static void main(String[] args) {
		Set<Integer> a=new TreeSet<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(90);
		a.add(10);
		a.add(10);
		a.add(40);
		a.add(50);
       
			System.out.println(a);
			
			Set<Integer> s=new TreeSet<Integer>();
		
			s.add(30);
			s.add(40);
			s.add(50);
			s.add(60);
			s.add(80);
			s.add(30);
	
			System.out.println(s);
			 s.removeAll(a);
			
			 System.out.println(s);
			 
	}

}
