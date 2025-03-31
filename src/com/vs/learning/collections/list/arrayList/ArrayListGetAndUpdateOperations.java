package com.vs.learning.collections.list.arrayList;

import java.util.ArrayList;
import java.util.List;

import com.vs.learning.utils.Customer;

public class ArrayListGetAndUpdateOperations {
	
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
		customers.forEach(System.out::println);		
		customers.set(0, c5);
		System.out.println("Update customer at index 0 with c5");
		customers.forEach(System.out::println);
		System.out.println(customers.contains("test"));
		System.out.println("Get first customer form list ::"+customers.getFirst());
		System.out.println("Get last customer form list ::"+customers.getLast());
		System.out.println("Get customer at index 2"+customers.get(2));		
	}

}
