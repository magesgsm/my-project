package org.map;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Qques5 {
  public static void main(String[] args) {
	  Map<Integer,Integer> m=new LinkedHashMap<Integer,Integer>();
	   m.put(20, 10);
	   m.put(20, 100);
	   m.put(30, 30);
	   m.put(40, 40);
	   m.put(50, 50);
	   m.put(60, 60);
	   m.put(10, 70);
	   m.put(50, 80);
	   m.put(40, 90);
	   boolean c = m.containsKey(40);
	   System.out.println(c);
	   System.out.println(m);
	   Set<Integer> m1=m.keySet();
	   System.out.println(m1);
	   Collection<Integer> m2=m.values();
	   System.out.println(m2);
	   

}
}
