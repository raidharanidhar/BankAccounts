package com.FunctionalProgrammes;

import java.util.*;

public class Structure {


	    public static void main(String[] args) {
	        List<Integer> numbers = Arrays.asList(12,3,5,67,15,76,12,55);
	        printAllNumbersInListStructured(numbers);
	    }

	    public static void printAllNumbersInListStructured(List<Integer> numbers) {
	        for (int number : numbers) {
	            System.out.println(number);
	        }
	    }
	}


