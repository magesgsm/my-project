package org.differ;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Ques5e {
	public static void main(String[] args) {
		 List<Integer> a=new LinkedList<Integer>();
		 a.add(10);
		 a.add(20);
		 a.add(30);
		 a.add(40);
		 a.add(50);
		 a.add(60);
		
		 
		 System.out.println(a);
 
    Set<Integer> b=new LinkedHashSet<Integer>();
    
		b.add(10);
		b.add(20);
		b.add(30);
		b.add(40);
		b.add(50);
		
		System.out.println(b);
		b.retainAll(a);
		System.out.println(b);
	}		 
}

