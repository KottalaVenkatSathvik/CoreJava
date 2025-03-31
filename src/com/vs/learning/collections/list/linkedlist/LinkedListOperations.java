package com.vs.learning.collections.list.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class LinkedListOperations {

	public static void main(String[] args) {
		LinkedList<String> customerName=new LinkedList<String>();
		customerName.add("Venkat"); // add Element 
		customerName.add("Sathvik");
		customerName.add(1,"Swamy"); // inserts the element at specific index
		customerName.addAll(customerName.size(), List.of("Sagar","Dwaraka","Krishna")); // inserts the group of elements at specific index		
		customerName.addFirst("Pandey Manish"); // inserts the element at first position
		customerName.addLast("Amit Jain"); // inserts the element at last position
		System.out.println(customerName.size()+" => "+customerName); // O/P : [Pandey Manish, Venkat, Swamy, Sathvik, Sagar, Dwaraka, Krishna, Amit Jain]
		customerName.addAll(List.of("Sachin T","M S Dhoni","Dravid"));
		System.out.println(customerName); // O/P : [Pandey Manish, Venkat, Swamy, Sathvik, Sagar, Dwaraka, Krishna, Amit Jain, Sachin T, M S Dhoni, Dravid]
		
		//Retrive Operations
		System.out.println("Retrive element at index 1 =>"+customerName.get(1));
		System.out.println("Retrive element index of 'Amit Jain' =>"+customerName.indexOf("Amit Jain"));
		System.out.println("Retrive First element from ll  =>"+customerName.getFirst());
		System.out.println("Retrive Last element from ll  =>"+customerName.getLast());
		
		//Search Element exist or not in ll
		System.out.println("is 'Dwaraka avaialble in the ll =>"+customerName.contains("Dwaraka"));
		System.out.println("are 'Dwarka', 'Dravid','Sachin T' are available in the list =>" +customerName.containsAll(List.of("Dwaraka", "Dravid","Sachin T")));
		
		//Update element using set method
		System.out.println("Update element at index 4 with 'Rama' =>" +customerName.set(4, "Rama"));
		System.out.println("Now Element at index 4 => "+customerName.get(4));
		
		//Linked List Specific Methods
		
		System.out.println("Get  first element with peek() method :: "+customerName.peek());
		System.out.println("Get  first element with peek() method :: "+customerName.peek());
		System.out.println("Get  first element with peekFirst() method :: "+customerName.peekFirst());
		System.out.println("Get  last element with peekLast() method :: "+customerName.peekLast());		
		System.out.println("peek() methid does not removed element");		
		System.out.println("Get element first element with element() method :: "+customerName.element());
		System.out.println(customerName.size()+" => "+customerName); // O/P : 11 => [Pandey Manish, Venkat, Swamy, Sathvik, Rama, Dwaraka, Krishna, Amit Jain, Sachin T, M S Dhoni, Dravid]

		//poll method
		System.out.println("Get  first element  & remove with poll() method :: "+customerName.poll());
		System.out.println("Get  first element with peek() method :: "+customerName.peek());
		System.out.println("Get  first element  & remove with poll() method :: "+customerName.poll());
		System.out.println("Get  first element with peek() method :: "+customerName.peek());
		System.out.println("Get  last element  & remove with pollLast() method :: "+customerName.pollLast());
		
		//offer methods
		customerName.offer("VCG");
		customerName.offerFirst("Durga");
		customerName.offerLast("Prasad");
		System.out.println(customerName.size()+" => "+customerName); // O/P : 9 => [Swamy, Sathvik, Rama, Dwaraka, Krishna, Amit Jain, Sachin T, M S Dhoni, VCG]
		
		//Pop method
		System.out.println("Remove fiirst element form ll =>"+customerName.pop());
		//remove operations
		System.out.println("Remove first element with remove() :: "+customerName.remove());
		System.out.println("Remove first element with removeFirst() :: "+customerName.removeFirst());
		System.out.println("Remove last element with removeLast() :: "+customerName.removeLast());
		System.out.println("Remove element at remove(index) :: "+customerName.remove(4));
		customerName.removeFirstOccurrence("Swamy a");
		customerName.removeLastOccurrence("Swamy a");
		customerName.listIterator().forEachRemaining(System.out::println);
		System.out.print("\ndescending order\n");
		customerName.descendingIterator().forEachRemaining(System.out::println);
		
	}

}
