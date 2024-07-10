package com.Collections;


	import java.util.ArrayList;

	public class ArrayListExample {
	    public static void main(String[] args) {
	        ArrayList<Integer> numbers = new ArrayList<>();

	        numbers.add(5);
	        numbers.add(10);
	        numbers.add(15);
	        numbers.add(20);

	        System.out.println("second Number: " +numbers.get(1));

	        System.out.println("All Numbers:");
	      
	            System.out.println(numbers);
	        

	        boolean containsTen = numbers.contains(12);
	        System.out.println("Contains 10? " + containsTen);

	        numbers.remove(3);
	        
	        numbers.set(1, 50);
	        numbers.set(2, 80);
	        System.out.println(numbers);
	        int size = numbers.size();
	        System.out.println("Size of the ArrayList: " + size);

	        numbers.clear();
	        System.out.println("Is the ArrayList empty? " + numbers.isEmpty());
	    }
	}


