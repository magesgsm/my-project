package org.differ;

import java.util.*;

public class ArrayDivision {
	public static void main(String[] args) {
		 int [] array= {1, 2, 3, 4, 5, 6, 7, 8, 9,7,7, 10};
	        List<int[]> as = Arrays.asList(array);
	        
	        Set<int[]> li=new LinkedHashSet<>();
	        
	        li.addAll(as);
	        
	        for (int[] x : li) {
				
	        	for (int i : x) {
					System.out.println(i);
				}
			}
}
}

