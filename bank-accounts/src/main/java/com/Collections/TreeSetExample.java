package com.Collections;

	import java.util.TreeSet;
	import java.util.Iterator;

	public class TreeSetExample {
	    public static void main(String[] args) {
	        TreeSet<String> treeSet = new TreeSet<>();

	        treeSet.add("Apple");
	        treeSet.add("Banana");
	        treeSet.add("Orange");
	        treeSet.add("Grapes");

	        System.out.println("TreeSet elements: " + treeSet);

	        // Iterate over the elements using an Iterator
	        System.out.println("Iterating through the TreeSet using an Iterator:");
	        Iterator<String> iterator = treeSet.iterator();
	        while (iterator.hasNext()) {
	            String fruit = iterator.next();
	            System.out.println(fruit);
	        }

	        String firstElement = treeSet.first();
	        String lastElement = treeSet.last();
	        System.out.println("First Element: " + firstElement);
	        System.out.println("Last Element: " + lastElement);

	        System.out.println("Does the TreeSet contain " + treeSet.contains ("Apple"));

	       treeSet.remove("Orange");

	        int size = treeSet.size();
	        System.out.println("Size of the TreeSet: " + size);

	       treeSet.clear();

	        boolean isEmpty = treeSet.isEmpty();
	        System.out.println("Is the TreeSet empty? " + isEmpty);
	    }
	}


