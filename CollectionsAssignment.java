package com.revature.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class CollectionsAssignment {
public static void main(String[] args) {
	
	//List<String> myList=new ArrayList<String>();
	//List<String> myList=new LinkedList<String>();
	Set<String> myList=new HashSet<String>();
	
	myList.add("A");
	myList.add("B");
	myList.add("C");
	myList.add("D");
	myList.add("A");
	
	System.out.println(myList);
	
//	Collections.sort(myList);
//	System.out.println(myList);
//	
//Collections.sort(myList, Collections.reverseOrder()); 
//	System.out.println(myList);
//	
//	Collections.shuffle(myList); 
//	System.out.println(myList); 
//	
//	Collections.replaceAll(myList, "A", "G");
//	System.out.println(myList);
//	
//	Collections.rotate(myList, 2);
//	System.out.println(myList);

	
}
}
