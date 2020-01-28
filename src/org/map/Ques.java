package org.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Ques {
	 public static void main(String[] args) {
	  	   Map<String,String> m=new TreeMap<String,String>();
	  	   m.put("hello", "sele");
	  	   m.put("hai", "sql");
	  	   m.put("rjesheree", "html");
	  	   m.put("vinoth", "c");
	  	   m.put("vinoth", "c++");
	  	   System.out.println(m);
	  	 Set<Entry<String,String>>m1=m.entrySet();
    	 for(Entry<String,String>m2:m1) {
    		 System.out.println(m2.getKey());
    		 System.out.println(m2.getValue());
    	 }
    	 
    	 
	
}
}
