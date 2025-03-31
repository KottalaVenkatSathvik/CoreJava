package com.vs.learning.collections.list.arrayList;
import java.util.*;
import com.vs.learning.utils.*;
public class ArrayListRemoveOperations {

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
		customers.stream().forEach(System.out::println);
		List<Customer> newCustomers=List.of(new Customer("Chameera","R", 10006, 41, "FEMALE"));
		System.out.println("Add New customers to customer list:: "+newCustomers);		
		customers.addAll(newCustomers);
		//Remove customer at index 5 which is not available
		//customers.remove(5); // Throws Runtime exception "IndexOutOfBoundException"
		
		//Remove all elements of the collection form current list
		System.out.println("Remove all new customers from customers :: "+customers.removeAll(newCustomers));
		//Remove customer at index 4 which is available in the list.. remove(int index) returns removed Element 
		Customer removedE=customers.remove(4);
		System.out.println("The Id and Name of the removed Customer :: "+removedE.customerId()+", "+removedE.firstName());
		// remove(Object o).. ie. remove(customer)-> returns true or false 
		System.out.println("Remove customer (id 10005 and name Beckie) ::"+customers.remove(removedE));
		//remove first customer from the list.. removeFirst()-> return Customer 
		System.out.println("Remove first customer from the list :: " +customers.removeFirst());
		//remove last customer/element from the list.. removeLast() -> returns  
		System.out.println("Remove Last Element from the list ::"+customers.removeLast());
		customers.removeIf(c-> c.age()>30);
		System.out.println("Customers age below 30 ::"+customers);
		System.out.println("Clear /remove all elements from the customers =>");
		customers.clear();
		System.out.println(customers);
		

	}

}

