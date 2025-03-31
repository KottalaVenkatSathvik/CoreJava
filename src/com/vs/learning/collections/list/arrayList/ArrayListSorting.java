package com.vs.learning.collections.list.arrayList;

import java.util.ArrayList;

import com.vs.learning.utils.Customer;

import java.util.*;

public class ArrayListSorting {

	public static void main(String[] args) {
		
		List<Customer> customerList=new ArrayList<>();
		
		//Create an  list of Customers		
		Customer c2=new Customer("Raja","Reddy", 0002, 55, "MALE");
		Customer c3=new Customer("Sridevi","Koratla", 0003, 88, "FEMALE");
		Customer c4=new Customer("RAGHU","RAM", 0004, 30, "MALE");
		Customer c5=new Customer("Sita","Devi", 0005, 41, "FEMALE");
		
		//Adding customers to the list		
		customerList.add(new Customer("Venkat","Swamy", 0001, 28, "MALE"));
		customerList.add(1, c2);
		customerList.add(c3);
		customerList.add(c4);
		customerList.add(c5);	
		
		customerList.sort(new Comparator<Customer>() {
			public int compare(Customer c1, Customer c2) {
			 return c1.customerId() >c2.customerId() ? 1: c1.customerId() <c2.customerId() ?-1:0;				
			};
		});
		customerList.stream().forEach(System.out::print);
		System.out.println("Reverse customer list => ");
		customerList.reversed().forEach(System.out::print);
	}

}
