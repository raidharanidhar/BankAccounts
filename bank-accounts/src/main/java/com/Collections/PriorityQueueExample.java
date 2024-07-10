package com.Collections;


	import java.util.PriorityQueue;

	public class PriorityQueueExample {
	    public static void main(String[] args) {
	        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

	        priorityQueue.offer(5);
	        priorityQueue.offer(1);
	        priorityQueue.offer(3);
	        priorityQueue.offer(2);
	        priorityQueue.offer(4);

	        int frontElement = priorityQueue.peek();
	        System.out.println("Front Element: " + frontElement); 
	        

	        while (!priorityQueue.isEmpty()) {
	            int element = priorityQueue.remove();
	            System.out.println("Dequeued: " + element);
	        }
	       
	    }
	}


