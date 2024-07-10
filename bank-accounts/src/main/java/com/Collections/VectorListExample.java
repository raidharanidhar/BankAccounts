package com.Collections;

	import java.util.Vector;

	public class VectorListExample {
	    public static void main(String[] args) {
	        Vector<String> vectorList = new Vector<>();

	        vectorList.add("Apple");
	        vectorList.add("Banana");
	        vectorList.add("Cherry");
	        vectorList.add("Date");

	        System.out.println("Vector Elements:");
	            System.out.println(vectorList);

	        vectorList.remove("Banana");
	        vectorList.remove("Cherry");
	        System.out.println(vectorList.capacity());

	        boolean containsDate = vectorList.contains("Cherry");
	        System.out.println("Does the Vector contain 'Cherry'? " + containsDate);

	        System.out.println("Vector Size: " + vectorList.size());
	    }
	}


