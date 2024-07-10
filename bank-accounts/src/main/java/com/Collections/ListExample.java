package com.Collections;
import java.util.List;

	import java.util.ArrayList;


	public class ListExample {
	    public static void main(String[] args) {
	        List<String> myList = new ArrayList<>();

	        myList.add("Apple");
	        myList.add("Banana");
	        myList.add("Cherry");
	        myList.add("Date");

	        System.out.println("Element at index 2: " + myList.get(2)); 

	        System.out.println("Elements in the list:");
	        System.out.println(myList);

	        boolean containsBanana = myList.contains("Banana");
	        System.out.println("Contains Banana? " + containsBanana); 
	        myList.remove("Cherry");
	        myList.remove("Apple");


//	        int size=myList.size();
	        System.out.println("Size of the list: " +  myList.size());

//	       myList.clear();
	        System.out.println("Is the list empty? " + myList.isEmpty());
	    }
	}


