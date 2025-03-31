package com.vs.learning.collections.set;

import java.util.*;


public class LinkedHashOperations {

	public static void main(String[] args) {
		LinkedHashSet<Integer> llsdc=new LinkedHashSet<Integer>();
		HashSet<Integer> llsinitailC=new LinkedHashSet<Integer>(20);
		HashSet<Integer> lls3=new LinkedHashSet<Integer>(10, 0.75F);
		LinkedHashSet<Integer> LS=new LinkedHashSet<Integer>(List.of(12,14,15,16,17,18,10,144,3));
		// add Operation
		LS.add(12);
		System.out.println(LS);
		System.out.println("Add 0 as first element");
		LS.addFirst(0);
		System.out.println(LS);
		System.out.println("Add 100 last element");
		LS.addLast(100);
		System.out.println(LS.size() +" => "+LS);
		System.out.println("Retrive first element from set :: "+LS.getFirst());
		System.out.println("Retrive last element from set :: "+LS.getLast());
		LS.iterator().forEachRemaining((s)->System.out.print(s+","));
		System.out.println("remove first element "+LS.removeFirst());
		System.out.println("remove first element "+LS.removeLast());
		System.out.println(LS);
	}

}

