package org.differ;

import java.util.ArrayList;
import java.util.List;

public class Ques5d {
	public static void main(String[] args) {
		 List<Integer> a=new ArrayList<Integer>();
		 a.add(10);
		 a.add(20);
		 a.add(30);
		 a.add(90);
		 a.add(10);
		 a.add(10);
		 a.add(40);
		 a.add(50);
		 
		 System.out.println(a);
		 int s = a.indexOf(90);
		 System.out.println(s);
	}
	}