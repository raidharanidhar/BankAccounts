package com.Collections;

public class TerinaryOperator {
   public static void main(String[] args) {
	   int a=10, b=50, c=100, d=60;
	   
	  int max= (a>b)?(a>c)?((a>d)?a:d):((c>d)?c:d):
		  			 (b>c)?((b>d)?b:d):((c>d)?c:d);
	  
	  System.out.println(max);
   }
}
