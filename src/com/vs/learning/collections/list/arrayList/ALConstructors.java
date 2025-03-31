package com.vs.learning.collections.list.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ALConstructors {

	public static void main(String[] args) {
		// No arg constructor 
		ArrayList<Integer> alInt=new ArrayList<Integer>();
		//Initial Capacity
		ArrayList<String> alStr=new ArrayList<String>(10);
		System.out.println(alStr);
		//Initialize array with collection
		ArrayList<String> alStrC=new ArrayList<String>(List.of("LIST","AL"));
		System.out.println(alStrC);
	}

}
