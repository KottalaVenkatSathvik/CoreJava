package com.vs.learning.collections.set;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetOperations {

	public static void main(String[] args) {
		//Constructors of TreeSet
		TreeSet<Integer> tc1=new TreeSet<Integer>();
		TreeSet<Integer> tc2=new TreeSet<Integer>(List.of(1,4,7,2,4,3,9,8,4,5,41));
		TreeSet<Integer> tc3=new TreeSet<Integer>(new Comparator<Integer>() {
			@Override
			public int compare(Integer i1,Integer i2) {
				return i1-i2;
			}
		});
		TreeSet<Integer> ts=new TreeSet<Integer>(tc2);
		System.out.println(ts);
		
		// Add elements to treeset using add method
		ts.add(6);
//		ts.addFirst(14); // R. E => java.lang.UnsupportedOperationException
//		ts.addLast(145);// R. E => java.lang.UnsupportedOperationException
		System.out.println(ts);		
		System.out.println("Size of the Ts ::"+ts.size()+",, is TreeSet is empty ::"+ts.isEmpty());
		
		// Get elements
		
		System.out.println("Get first element ::"+ts.getFirst());
		System.out.println("Get first element ::"+ts.getLast());
		
		// check number is available or not
		System.out.println("Is number 10 is avaiable in the tree set ::" +ts.contains(10));
		System.out.println("Is number 41 is avaiable in the tree set ::" +ts.contains(41));
		//	Sub set ,Tail and Head Sets		
		Set<Integer> headset=ts.headSet(4);
		System.out.println("Head set whose less than 4 ::"+headset);
		System.out.println("Head set whose less than 4 (;;include) ::"+ts.headSet(4,true));
		System.out.println("Tail set whose value is greater than  "+ts.tailSet(5));
		System.out.println("Tail set whose value is gretaer than or equal to 5  ::"+ts.tailSet(5));
		System.out.println("Subset from 5 to 8 include "+ts.subSet(5,true,8,true));
		
		//LOWER,floor,ceiling, higher 
		System.out.println("leatest element in this set strictly less than the given element 5::"+ts.lower(5));
		System.out.println("greatest element in this set less than or equal to the given element 5 ::"+ts.floor(5));
		System.out.println("least element in this set greater than or equal to the given element 5 ::"+ts.ceiling(5));
		System.out.println("higher than element 5 ::"+ts.higher(5));
		
		//poll operation
		System.out.println("poll first element from set ::"+ts.pollFirst());
		System.out.println("poll last element from set ::"+ts.pollLast());
		
		System.out.println("Descending order set of current set :: "+ts.descendingSet());
		System.out.println("is set empty "+ts.isEmpty());
		System.out.println("Sze of the set "+ts.size());
		System.out.println("-----------clear set-----");
		ts.clear();
		System.out.println("is set empty "+ts.isEmpty());
		System.out.println("Sze of the set "+ts.size());
		ts=null;
		tc1=null;
		tc3=null;
		
	}
	

}

