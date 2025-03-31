package com.vs.learning.collections.list.arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import com.vs.learning.utils.Customer;

public class ALStreamOperations {
	public static void main(String[] args) {
		//Declare array list type Customer
		List<Customer> customers=null;		
		//Create an  list of Customers		
		Customer c1=new Customer("Chris","Gayle ", 10001, 55, "MALE");
		Customer c2=new Customer("Tims"," David", 10002, 30, "MALE");
		Customer c3=new Customer("Samantha","A", 10003, 88, "FEMALE");
		Customer c4=new Customer("Andrew","NG", 10004, 30, "MALE");
		Customer c5=new Customer("Beckie","Desouza", 10005, 41, "FEMALE");		
		customers=new ArrayList<>(List.of(c1,c2,c3,c4,c5));
		
		Stream<Customer> cstream = customers.stream();
		System.out.println("Filter customer whos age greater that 30");
		customers.stream().filter(c-> c.age() >30).forEach(c-> System.out.println(c));
		customers.stream().map(c-> {
			c.firstName().trim();
			return c;
			}
		).forEach(c-> System.out.println(c));
		
		customers.stream().mapToInt(c->c.age()+1).forEach(c-> System.out.println(c));
		
		
		
	}

}
