//package com.example;
import java.util.LinkedHashSet;
public class LinkedHashSetExample {

	public static void main(String[] args) {
		
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		set.add("B");
		set.add("A");
		set.add("D");
		set.add("C");
		System.out.println(set);
		for(String s:set) {
			System.out.println(s);
		}
		boolean insert=set.add("D");
		System.out.println("insert="+insert);
		System.out.println("Z present="+set.contains("Z"));

	}

}
