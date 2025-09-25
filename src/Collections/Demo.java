package Collections;

import java.util.ArrayList;
import java.util.List;

public class Demo {
	
	public static void main(String[] args) {
		
		//Collections = group of entities or elements of datatype
		//Arrays = storing elements
		//hierrarchy of collections
		
		//TODO -
		// List, Set and Map [Types]-
		//ways to insert and iterate elements
		//java 8 = lambda function [1 session = 4-5 hours]
		
		
		
		
		//Prerequisite
		//oops = inheritance and abstraction
		
		
		//List = ArrayList and LinkedList - 
		//Parent p = new Child();
		//<> = diamond braces = generics = determines which type of elements to 
		//be added in a collection
		
		List<String> l = new ArrayList();
		l.add("shripad");
		l.add("rajeshwar");
		l.add("boral");
		System.out.println(l.toString());
		
		//convert every elements in list 'l' to upper case
		//to achieve this we need to take out every element one by one
		//for loop ->>>>>> iteration -> take out an element from collection
		
		
		//for -each loop
		
		for(String a : l ) {
			System.out.println(a.toUpperCase());
		}
		
		
		
		
		List la = new ArrayList();
		la.add("Hello");
		la.add(1234);
		la.add(false);
		System.out.println(la.toString());
		
		
	
		
		
		
		
	}

}
