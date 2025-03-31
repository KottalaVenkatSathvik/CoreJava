package com.vs.learning.collections.list.arrayList;

import java.util.ArrayList;
import java.util.List;

import com.vs.learning.utils.Customer;

public class ArrayListAddOperations {

	public static void main(String[] args) {
		//Declare array list type Customer
		List<Customer> customers=new ArrayList<Customer>();		
		//Create an  list of Customers		
		Customer c1=new Customer("Chris","Gayle", 10001, 55, "MALE");
		Customer c2=new Customer("Tims","David", 10002, 30, "MALE");
		Customer c3=new Customer("Samantha","A", 10003, 88, "FEMALE");
		Customer c4=new Customer("Andrew","NG", 10004, 30, "MALE");
		Customer c5=new Customer("Beckie","Desouza", 10005, 41, "FEMALE");
		System.out.println("Is List empty ? "+customers.isEmpty());
		//add customers using addFirst(Element E)
		customers.addFirst(c1);				
		//add customer to customers list
		customers.add(c2);
		//add customer using add(int index, Element E)
		customers.add(2,c3);
		customers.add(3,c4);
		//add customer using addLast(Element E)
		customers.addLast(c5);
		
					
		customers.stream().forEach(System.out::println);
		System.out.println("Number of customers avaiable in customer list :: "+customers.size());
		List<Customer> newCustomers=List.of(new Customer("Chameera","R", 10006, 41, "FEMALE"));
		//add new customer list to Customer List
		System.out.println("Add New customers to customer list:: "+newCustomers);		
		customers.addAll(newCustomers);	
		System.out.println("Number of customers avaiable in customer list after new customers added to the list:: "+customers.size());
		
		

	}

}
