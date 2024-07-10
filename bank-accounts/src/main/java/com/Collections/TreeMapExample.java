package com.Collections;
	import java.util.*;

	public class TreeMapExample {
	    public static void main(String[] args) {
	        TreeMap<String, Integer> treeMap = new TreeMap<>();

	        treeMap.put("Alice", 25);
	        treeMap.put("Bob", 30);
	        treeMap.put("Charlie", 28);
	        treeMap.put("David", 35);
	        treeMap.put("Eve", 22);
	        System.out.println("Key: " + treeMap.lastKey() );
	        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
	            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
	        }

	        int age = treeMap.get("Bob");
	        System.out.println("Bob's Age: " + age);

	        boolean exists = treeMap.containsKey("Bob");
	        System.out.println("Does Bob exist in the TreeMap " + exists);

	        treeMap.remove("Charlie");
	        treeMap.remove("Bob");
	        treeMap.remove("Alice");
	        
	        treeMap.put("David",30);

	        System.out.println("Updated TreeMap:");
	        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
	            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
	        }
	    }
	}


