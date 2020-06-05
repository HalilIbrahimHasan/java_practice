package day_3;

import java.util.Scanner;

public class StringManipulations2 {

	
	public static void main(String[] args) {
		/*
		ask user to enter 2 words if the first word has even numbers, then  insert the second word in the middle 
		e.g: 
		mehmet ==>   mehahmetmet
		ahmet 
		*/
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Please type 2 names");
		      //013
		      //kahr aman    name1.length()/2;
		String name1 =scan.next();
		String name2 = scan.next();
		boolean isTrue = name1.length() % 2 == 0;
		
		String halfOfFirstName = name1.substring(0,name1.length()/2);
		String secondHalfOfTheName = name1.substring(name1.length()/2);
		
		
		if(isTrue) {
		System.out.println(halfOfFirstName.concat(name2).concat(secondHalfOfTheName));
		}
		
		
		

	}
	
}
