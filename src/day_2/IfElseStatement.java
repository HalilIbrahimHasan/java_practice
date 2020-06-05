package day_2;

import java.util.Scanner;

public class IfElseStatement {

	public static void main(String[] args) {
		System.out.println("                <><><><><><>");
		System.out.println("             <>              <>");
		System.out.println("            <>     SDLC       <>");
		System.out.println("             <>              <>");
		System.out.println("                <><><><><><>");
		System.out.println("                               \\\\");
		System.out.println("                                \\\\");
		System.out.println("                                 \\\\");
		System.out.println("                                  \\\\");
		System.out.println("                                   \\\\");
		System.out.println(" \n                                   IS ALWAYS FUN WITH JAVA");
		System.out.println("\n===>   TECHPROED STUDENTS GO BEYOND THEIR IMAGINATION    <===");
	/*
		create a String variable named jobTitle if
		test data:
			qa  then print Qualty analyst
			dev then print developer
			ba  then print Business Analyst
			pm then print Project manager
			investor print stakeholder
	*/
	  
		Scanner scan =new Scanner (System.in);
		System.out.println("Please enter your job title?");
		String jobTitle = scan.next();
		
		String qa = "Qualty analyst";
		String dev = "developer";
		String ba = "Business Analyst";
		String pm = "Project manager";
		String stk = "stakeholder";
		
		if(jobTitle.equalsIgnoreCase("qa")) {
			System.out.println("Your job title is "+qa);
		}else if(jobTitle.equalsIgnoreCase("dev")) {
			System.out.println("Your job title is "+dev);
		}else if(jobTitle.equalsIgnoreCase("ba")) {
			System.out.println("Your job title is "+ba);
		}else if(jobTitle.equalsIgnoreCase("pm")) {
			System.out.println("Your job title is "+pm);
		}else if(jobTitle.equalsIgnoreCase("investor")) {
			System.out.println("Your job title is "+stk);
		}
	
	}
	
}
