package com.vs.learning.collections.list.vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {		
		Vector<String> vPrmLanguage=new Vector<>(5,5);		
		vPrmLanguage.addFirst("Python");
		vPrmLanguage.add(1,"JavaScript");
		vPrmLanguage.addAll(List.of("Go","Rust","Mojo","C"));
		vPrmLanguage.addLast("Java");
		vPrmLanguage.addElement("Node JS");		
		System.out.println(vPrmLanguage);
		System.out.println("Update element at index 0 with 'Java'");
		vPrmLanguage.set(0, "Java");
		vPrmLanguage.addLast("Python");
		System.out.println(vPrmLanguage);
		
		System.out.println(vPrmLanguage.removeElement("Node JS"));
		System.out.println(vPrmLanguage.remove("Node JS"));		
		System.out.println(vPrmLanguage.capacity());	
		
		System.out.println(vPrmLanguage.capacity());
		System.out.println("Set element at index 2 ");
		vPrmLanguage.setElementAt(null, 2);
		System.out.println(vPrmLanguage);
		System.out.println("Set element at index 9 (not available in the vector ");
		//vPrmLanguage.set(9,"golang"); // throw Run time excpetion 
		System.out.println(vPrmLanguage);
		// contains and containsAll will help to checks if particular element is exist in the list
		System.out.println("is Spring is available in the list ? "+vPrmLanguage.contains("Spring"));
		System.out.println("is Angular and react is available in the list ? "+vPrmLanguage.containsAll(List.of("React js","Angular")));
		System.out.println("Is java is available in the list ? "+vPrmLanguage.contains("Java"));
		System.out.println("Get element at particular index/element");
		System.out.println("Display element at index 0 => "+vPrmLanguage.get(0));
		System.out.println("Display first element :: getFirst() => "+vPrmLanguage.getFirst());
		System.out.println("Display last element  :: getLast() => "+vPrmLanguage.getLast());
		System.out.println("Index of 'Node Js' ::"+vPrmLanguage.indexOf("Node JS"));
		System.out.println("Index of 'Mojo' :: "+vPrmLanguage.indexOf("Mojo"));
		System.out.println("Sublist 0 to 6 => "+vPrmLanguage.subList(0, 6));
		System.out.println("is List empty => "+vPrmLanguage.isEmpty());
		System.out.println(""+vPrmLanguage.remove(5));		
		Enumeration enumeration=vPrmLanguage.elements();
		
		while(enumeration.hasMoreElements()) {
			System.out.print(enumeration.nextElement()+",");			
		}
		Iterator<String> it=vPrmLanguage.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());			
		}
		vPrmLanguage.removeIf(c-> c == null);
		System.out.println(vPrmLanguage);
		
	}


}

