package javabasic;

import java.util.ArrayList;
import java.util.Iterator;

public class javaCollection {
 public static void main(String[] args) {
	 ArrayList<String> obj = new ArrayList<String>();
	 System.out.println("size of array 1" + obj.size());
	 obj.add("Abhi");
	 obj.add("Abhishek");
	 obj.add("abhimanyu");
	 
	 Iterator<String> i = obj.iterator();
	 System.out.println("iterator" + i);
	 
	 while(i.hasNext()) {
		 System.out.println(i.next());
	 }	
	 
	 System.out.println("===" + obj.contains("Abhis"));
 }
}
