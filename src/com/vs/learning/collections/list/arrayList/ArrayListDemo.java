package com.vs.learning.collections.list.arrayList;
import java.util.*;

import com.vs.learning.utils.Customer;

public class ArrayListDemo {
	
	public static void main(String args[]) {	
		
		ArrayList<Customer> listOfEmployee=new ArrayList<Customer>(); // creates an empty array list with default capacity i.e 10		
		System.out.println("is List empty ? ::"+ listOfEmployee.isEmpty()); // checks either list is empty or not.. here list ie empty
		System.out.println("Number of customer avaialble in list ::"+listOfEmployee.size());	// displays size of the array list... i.e 0 here
		
		//Create an  list of Customers		
		Customer c2=new Customer("Raja","Reddy", 0002, 55, "MALE");
		Customer c3=new Customer("Sridevi","Koratla", 0003, 88, "FEMALE");
		Customer c4=new Customer("RAGHU","RAM", 0004, 30, "MALE");
		Customer c5=new Customer("Sita","Devi", 0005, 41, "FEMALE");
		
		//Adding customers to the list		
		listOfEmployee.add(new Customer("Venkat","Swamy", 0001, 28, "MALE"));
		listOfEmployee.add(1, c2);
		listOfEmployee.add(c3);
		listOfEmployee.add(c4);
		listOfEmployee.add(c5);	
		
		//print all customer that are available in listOfCustomer
		System.out.println(listOfEmployee);	//prints all customer from the list
		System.out.println("is List empty ? ::"+ listOfEmployee.isEmpty()); // list is not empty : false
		System.out.println("Number of customer avaialble in list ::"+listOfEmployee.size()); // size of the list 5
		
		//create new list for new employess
		List<Customer> listOfNewEmployees=new ArrayList<>();
		listOfNewEmployees.add(new Customer("Keerthi", "N", 0006, 22, "FEMALE"));
		listOfNewEmployees.add(new Customer("Swathi", "Repala", 0007, 23, "FEMALE"));
		listOfNewEmployees.add(new Customer("Uday", "Ettimsetty", 8, 23, "MALE"));
		
		System.out.println("New employee list ::"+listOfNewEmployees+"\nNumber of new employess joined :: "+listOfNewEmployees.size());
		System.out.println("Adding new employee list to existing employee list ");
		listOfEmployee.addAll(listOfNewEmployees);
		System.out.println("Total number of employees :: "+listOfEmployee.size());
		
		List<Customer> resignedEmployeesList=new ArrayList<>();
		resignedEmployeesList.addFirst(new Customer("RAGHU","RAM", 0004, 30, "MALE"));
		resignedEmployeesList.addLast(new Customer("Keerthi", "N", 0006, 22, "FEMALE"));
		
		System.out.println("Total Number of employee resigned ::"+resignedEmployeesList.size());
		System.out.println("Remove resigned employees from list");			
		listOfEmployee.removeAll(resignedEmployeesList);
		
		System.out.println("Total number of Employees :: "+listOfEmployee.size());		
		System.out.println("Retain  new employees");
		listOfEmployee.retainAll(listOfNewEmployees);		
		System.out.println(listOfEmployee);
		
		System.out.println("Checking employee 0007 is avaiable or not in the list ");
		System.out.println("is employee id 0007 exist in the list :: "+listOfEmployee.contains(new Customer("Swathi", "Repala", 0007, 23, "FEMALE")));
		System.out.println("is all newly joined employess are avaiable in the list ? ::"+listOfEmployee.containsAll(listOfNewEmployees));
		
		System.out.println("the index of customer c3 ? :: "+listOfEmployee.indexOf(c3));
		System.out.println("display customer id in the list using foreach");
		listOfEmployee.forEach(c->System.out.print(c.customerId()+","));
		System.out.println();
		System.out.println("Display customer details at 0");
		System.out.println(listOfEmployee.get(0));
		Iterator<Customer> itr=listOfEmployee.iterator();
		System.out.println("Iterate list of employess using iterator");
		while(itr.hasNext()) {			
			System.out.println(itr.next());			
			System.out.println(itr.next());											
			
		}		
		Object[] customersArray=listOfEmployee.toArray();		
		for (Object object : customersArray) {
			System.out.println(object);
		}		
		listOfEmployee.sort((a,b)-> b.customerId() -a.customerId());
		System.out.println(listOfEmployee);
		List<Object> a = List.of(customersArray);		
		for (Object object : a) {			
			System.out.println(object);			
		}
		List<Customer> copyOfList=List.copyOf(listOfNewEmployees);
		for (Customer customer : copyOfList) {
			System.out.println(customer);			
		}
		listOfNewEmployees.clear();
		listOfEmployee.clear();
		resignedEmployeesList.clear();
		
		System.out.println(listOfEmployee);
		System.out.println(listOfNewEmployees);
		System.out.println(resignedEmployeesList);
	}

}
