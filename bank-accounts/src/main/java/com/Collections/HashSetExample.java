package com.Collections;

	import java.util.*;

	public class HashSetExample {
	    public static void main(String[] args) {
	        Set<Integer> numbers = new HashSet<>();

	        numbers.add(5);
	        numbers.add(10);
	        numbers.add(15);
	        numbers.add(20);
	        numbers.add(25);

	        System.out.println("HashSet elements: " + numbers);

	        numbers.remove(15);
	        System.out.println("HashSet elements: " + numbers);

	        boolean contains = numbers.contains(15);
	        System.out.println("Does the HashSet contain 15? " + contains);

	        // Iterate over the elements using an Iterator
	        System.out.println("Iterating through the HashSet using an Iterator:");
	        Iterator<Integer> iterator = numbers.iterator();
	        while (iterator.hasNext()) {
	            int num = iterator.next();
	            System.out.println(num);
	        }

	        numbers.clear();

	        System.out.println("Is the HashSet empty? " + numbers.isEmpty());
	    }
	}


