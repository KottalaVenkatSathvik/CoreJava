package com.vs.learning.collections.list.vector;

import java.util.Collection;
import java.util.List;
import java.util.Vector;

public class VectorCopyOperations {

	public static void main(String[] args) {
		System.out.println("----Copy Operations on Vector");
		List<String> vProgLang=new Vector<String>();		
		vProgLang.add("Java");
		vProgLang.add(1,"Python");
		Collection<String> vNewProgList= List.of("Java Script","Node JS","PHP","Rust","GoLang","Ruby");
		System.out.println(vProgLang);
		//Copy elements of one collection to the vector using addAll(Collection c)
		vProgLang.addAll(vNewProgList);
		System.out.println("Using addAll(Collection c) method =>"+vProgLang);
		//Copy elements of one collection to the vector using addAll(int index,Collection c)
		Collection<String> vFrameworks=List.of("Spring","Spring Boot","Hibernate","React JS");
		System.out.println("Using addAll(int a,Collection c) method =>"+vProgLang);
		vProgLang.addAll(0, vFrameworks);
		System.out.println("Using Constructor => "+vProgLang);
		Vector<String> v=new Vector<String>(vFrameworks);
		System.out.println(v);
		System.out.println("----**----");

	}

}
