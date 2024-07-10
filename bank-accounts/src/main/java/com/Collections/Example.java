package com.Collections;

	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.List;
	
		public class Example {
	    public static void main(String[] args) {
	        List<Integer> li = new ArrayList<>();
	        li.add(10);
	        li.add(5);
	        li.add(20);
	        li.add(8);

	        Collections.sort(li, Collections.reverseOrder());

	        for (Integer value : li) {
	            System.out.println(value);
	        }
	    }
	}


