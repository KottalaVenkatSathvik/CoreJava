package com.vs.learning.collections.list.vector;

import java.util.List;
import java.util.Vector;

public class VectorSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> vProgLang=new Vector<String>();		
		vProgLang.add("Java");
		vProgLang.add(1,"Python");
		vProgLang.addAll(List.of("Java Script","Node JS","PHP","Rust","GoLang","Ruby"));
		System.out.println(vProgLang);
		vProgLang.sort((a,b)->a.compareToIgnoreCase(b));
		System.out.println(vProgLang);
		
	}

}
