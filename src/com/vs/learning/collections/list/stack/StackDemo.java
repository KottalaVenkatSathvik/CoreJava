package com.vs.learning.collections.list.stack;

import java.util.*;

/***
 * Stack is child class of the vector
 * Stack is recommended to use when there is need of Last In First Out operation
 * Stack methods are push(E e),pop(),peek(),empty() and search(E e)
 * A more complete and consistent set of LIFO stack operations is provided by the Deque interface
 * and its implementations, which should be used in preference to this class  
 */
public class StackDemo {

	public static void main(String[] args) {
	Stack<Integer> stackOfNumbers=new Stack<Integer>();
		System.out.println("Size of the stack => "+stackOfNumbers.size());
		stackOfNumbers.add(1);
		stackOfNumbers.push(2);
		stackOfNumbers.add(2, 3);
		System.out.println("Size of the stack => "+stackOfNumbers.size()+"..."+stackOfNumbers);
		stackOfNumbers.addLast(4);		
		stackOfNumbers.push(5); // adds element to the stack at the top
		stackOfNumbers.push(6);
		System.out.println("Top of stack =>"+stackOfNumbers.peek()); // returns the element from top of the stack
		System.out.println("Top of stack =>"+stackOfNumbers.peek());
		System.out.println("Top of stack =>"+stackOfNumbers.peek());
		System.out.println("Top of stack =>"+stackOfNumbers.peek());
		System.out.println("Remove top element =>"+stackOfNumbers.pop()); // delete elements from stack
		System.out.println("Remove element from at position 2=> "+stackOfNumbers.remove(2));
		System.out.println("Remove element from at position 2=> "+stackOfNumbers.remove(2));
		System.out.println("Search element'3'*/ "+stackOfNumbers.search(2));
		stackOfNumbers.iterator().forEachRemaining(System.out::println);
		stackOfNumbers.clear();
		System.out.println("Cleared statck ... Size of the stack => "+stackOfNumbers.size()+"..."+stackOfNumbers.empty());		
	}

}

