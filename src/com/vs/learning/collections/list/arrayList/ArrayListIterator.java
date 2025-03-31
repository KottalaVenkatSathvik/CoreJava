package com.vs.learning.collections.list.arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.vs.learning.utils.Customer;

public class ArrayListIterator {
	public static void main(String[] args) {
		//Declare array list type Customer
		List<Customer> customers=null;		
		//Create an  list of Customers		
		Customer c1=new Customer("Chris","Gayle", 10001, 55, "MALE");
		Customer c2=new Customer("Tims","David", 10002, 30, "MALE");
		Customer c3=new Customer("Samantha","A", 10003, 88, "FEMALE");
		Customer c4=new Customer("Andrew","NG", 10004, 30, "MALE");
		Customer c5=new Customer("Beckie","Desouza", 10005, 41, "FEMALE");		
		customers=new ArrayList<>(List.of(c1,c2,c3,c4,c5));
		
		Iterator<Customer> itr=customers.iterator();
		System.out.println("Display all customer id from list with iterator =>");
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}		
		System.out.println("Remove customer id 10002 from list");
		itr=customers.iterator();
		while(itr.hasNext()) {			
			if(itr.next().customerId() ==10002) {
				itr.remove();
			}
		}		
		customers.forEach(System.out::println);
}

}
