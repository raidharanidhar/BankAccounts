package com.Collections;


	import java.util.ArrayDeque;
	import java.util.Deque;

	public class DequeExample {
	    public static void main(String[] args) {
	        Deque<String> deque = new ArrayDeque<>();

	        deque.addFirst("Front 1");
	        deque.addLast("Rear 1");
	        deque.addFirst("Front 2");
	        deque.addLast("Rear 2");

	        String frontElement = deque.removeFirst();
	        String rearElement = deque.removeLast();

	        System.out.println("Front Element: " + frontElement);
	        System.out.println("Rear Element: " + rearElement);  

	        String frontPeek = deque.getFirst();
	        String rearPeek = deque.getLast();

	        System.out.println("Front Peek: " + frontPeek); 
	        System.out.println("Rear Peek: " + rearPeek);   
	
	        int size = deque.size();
	        System.out.println("Deque Size: " + size);	    }
	}


