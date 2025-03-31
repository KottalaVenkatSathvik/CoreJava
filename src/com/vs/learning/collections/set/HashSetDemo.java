package com.vs.learning.collections.set;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {		
		Set<Integer> employeeIds=new HashSet<Integer>();
		Collection<Integer> ids=List.of(10010,10011,10012,10013);
		//Add items of Collections to Set using addAll(Collection c) method
		employeeIds.addAll(ids);
		System.out.println(employeeIds);
		employeeIds.add(null); // RE : java.lang.NullPointerException
		employeeIds.add(10017);
		employeeIds.add(10017);		
		//Add item using add(Element e)
		employeeIds.add(10014);
		employeeIds.add(10015);
		employeeIds.add(10016);
		System.out.println(employeeIds);		
		System.out.println("Number of elements present in the Set => "+employeeIds.size());
		System.out.println("Is Set empty => "+employeeIds.isEmpty());
		System.out.println("is 10010 present in the set => "+employeeIds.contains(10010));		
		System.out.println("Iterate over the list");		
		System.out.println("Create eqvilent array ");
		Integer[] emplAry=employeeIds.toArray(new Integer[0]);		
		for(Object e:emplAry) {
			System.out.print(e+",");
		}
		System.out.print("\n\n");		
		System.out.println("Check 10010,10012,10013 available in set "+employeeIds.containsAll(List.of(10010,10012,10013)));
		System.out.println("Check 20010,10012,10013 available in set "+employeeIds.containsAll(List.of(20010,10012,10013)));
		employeeIds.retainAll(List.of(10010,10012,10013));
		System.out.println("After retainAll 10010,10012,10013 => "+employeeIds);
		employeeIds.removeAll(List.of(1000,10010));
		System.out.println("After removeAll 1000 , 1000 => "+employeeIds);
		Iterator<Integer> itr=employeeIds.iterator();
		while(itr.hasNext()) {
			System.out.print(""+itr.next());
			itr.remove();
			System.out.println(" => "+employeeIds);
		}
		System.out.println("Clear Set");
		employeeIds.clear();
		System.out.println(employeeIds);
		

	}	 

}

