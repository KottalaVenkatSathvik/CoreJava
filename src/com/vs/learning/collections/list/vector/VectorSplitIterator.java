package com.vs.learning.collections.list.vector;
import java.util.*;

public class VectorSplitIterator {

	public static void main(String[] args) {
		
		List<String> vProgLang=new Vector<String>();		
		vProgLang.add("Java");
		vProgLang.add(1,"Python");
		vProgLang.addAll(List.of("Java Script","Node JS","PHP","Rust","GoLang","Ruby"));
		System.out.println(vProgLang);
		
		//Create SpliIterator 
		Spliterator<String> si=vProgLang.spliterator();
		Spliterator<String> SIT=si.trySplit();
		
		si.forEachRemaining(t-> System.out.println("T1 ==>"+t));
		SIT.forEachRemaining(t ->System.out.println("T2 ==>" +t));
	}
}
