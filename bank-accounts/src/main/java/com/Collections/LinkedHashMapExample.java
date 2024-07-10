package com.Collections;

	import java.util.LinkedHashMap;
	import java.util.Map;

	public class LinkedHashMapExample {
	    public static void main(String[] args) {
	        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();

	        linkedHashMap.put(1, "One");
	        linkedHashMap.put(2, "Two");
	        linkedHashMap.put(3, "Three");
	        linkedHashMap.put(4, "Four");

	        for (Map.Entry<Integer, String> entry : linkedHashMap.entrySet()) {
	            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
	        }

	        String value = linkedHashMap.get(2);
	        System.out.println("Value for key 2: " + value);
	        System.out.println("Value for key 3: " + linkedHashMap.get(3));

	        linkedHashMap.remove(2);

	        System.out.println("Updated LinkedHashMap:");
	        for (Map.Entry<Integer, String> entry : linkedHashMap.entrySet()) {
	            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
	        }
	    }
	}


