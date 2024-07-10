package com.Collections;


	import java.util.HashMap;

	public class HashMapExample {
	    public static void main(String[] args) {
	        HashMap<String, Integer> hashMap = new HashMap<>();

	        hashMap.put("John", 25);
	        hashMap.put("Alice", 30);
	        hashMap.put("Bob", 22);
	        hashMap.put("Eve", 28);

	        int johnsAge = hashMap.get("John");
	        int alicesAge = hashMap.get("Alice");

	        System.out.println("John's age: " + johnsAge);
	        System.out.println("Alice's age: " + alicesAge);
	        System.out.println("Bob's age: " + hashMap.get("Bob"));

	        String keyToCheck = "Bob";
	        if (hashMap.containsKey(keyToCheck)) {
	            System.out.println(keyToCheck + " is in the hash map.");
	        } else {
	            System.out.println(keyToCheck + " is not in the hash map.");
	        }

	        System.out.println("All key-value pairs in the hash map:");
	        for (String key : hashMap.keySet()) {
	            int value = hashMap.get(key);
	            System.out.println(key + ": " + value);
	        }

	        String keyToRemove1 = "Eve";
	        hashMap.remove(keyToRemove1);
	        System.out.println(keyToRemove1 + " has been removed from the hash map.");
	        
	        String keyToRemove2 = "Bob";
	        hashMap.remove(keyToRemove2);
	        System.out.println(keyToRemove2 + " has been removed from the hash map.");
	        
	        String keyToRemove3 = "Alice";
	        hashMap.remove(keyToRemove3);
	        System.out.println(keyToRemove3 + " has been removed from the hash map.");

	        if (hashMap.isEmpty()) {
	            System.out.println("The hash map is empty.");
	        } else {
	            System.out.println("The hash map is not empty.");
	        }
	    }
	}


