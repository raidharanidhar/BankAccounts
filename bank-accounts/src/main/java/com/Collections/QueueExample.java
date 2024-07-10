package com.Collections;


	import java.util.LinkedList;
	import java.util.Queue;

	public class QueueExample {
	    public static void main(String[] args) {
	        Queue<String> queue = new LinkedList<>();

	        queue.offer("Alice");
	        queue.offer("Bob");
	        queue.offer("Charlie");

	        String frontElement = queue.peek();
	        System.out.println("Front Element: " + frontElement);

	        String removedElement = queue.poll();
	        System.out.println("Removed Element: " + removedElement); 

	        frontElement = queue.peek();
	        System.out.println("Front Element after Dequeue: " + frontElement); 

	        boolean isEmpty = queue.isEmpty();
	        System.out.println("Is the Queue Empty? " + isEmpty); 
	        queue.poll();
	       
	        System.out.println("Size of the Queue: " + queue.size()); 

	        while (!queue.isEmpty()) {
	            System.out.println("Dequeued: " + queue.poll());
	        }

	        isEmpty = queue.isEmpty();
	        System.out.println("Is the Queue Empty? " + isEmpty);
	    }
	}


