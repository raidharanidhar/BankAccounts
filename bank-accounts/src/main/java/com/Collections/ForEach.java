package com.Collections;
import java.util.*;

public class ForEach {
	int price;
	int qty;
	String type;
	
		public ForEach(int price, int qty, String type) {
		super();
		this.price = price;
		this.qty = qty;
		this.type = type;
	}

		public static void main(String[] args) {
		LinkedList<ForEach> lst = new LinkedList<ForEach>();
		ForEach p1=new ForEach(1200, 1, "waterbottle");
		ForEach p2=new ForEach(1400, 3, "Shampoo");
		ForEach p3=new ForEach(5000, 1, "Mobile");
		lst.add(p1);
		lst.add(p2);
		lst.add(p3);
		for(ForEach p:lst) {
		System.out.println(p.qty+" "+p.type+" "+p.price);
		}
		}
		}
