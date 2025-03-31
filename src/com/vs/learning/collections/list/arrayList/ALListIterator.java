package com.vs.learning.collections.list.arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import com.vs.learning.utils.Customer;

public class ALListIterator {

	public static void main(String[] args) {		
		//Declare  ArrayList with Customer type
		List<Customer> customers=null;		
		//Create an  list of Customers		
		Customer c1=new Customer("Chris","Gayle", 10001, 55, "MALE");
		Customer c2=new Customer("Tims","David", 10002, 30, "MALE");
		Customer c3=new Customer("Samantha","A", 10003, 88, "FEMALE");
		Customer c4=new Customer("Andrew","NG", 10004, 30, "MALE");
		Customer c5=new Customer("Beckie","Desouza", 10005, 41, "FEMALE");		
		customers=new ArrayList<>(List.of(c1,c2,c3,c4,c5));		
		ListIterator<Customer> litr=customers.listIterator();
		System.out.println("print customer using listiterator ::");
		while(litr.hasNext()) {
			Customer c=litr.next();
			if(c.customerId() == 10003) {
				litr.add(c2);
			}else if(c.customerId() == 10002){
				litr.remove();
			}else {
				litr.set(c5);
			}
		}		
		customers.forEach(System.out::println);
	}

}
