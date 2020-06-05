package day_3;

import java.util.Scanner;

public class StringManipulations {

	public static void main(String[] args) {
		
		/*
		ask user to enter an e-mail address then if it contains "hotmail"  replace it with "gmail" 
		e.g: mesutyaman@hotmail.com  ==> mesutyaman@gmail.com

		*/

		Scanner scan = new Scanner (System.in);
//		System.out.println("Please type your email address");
		
		/*
		            //  012345678910
		String email = "mesutyaman@hotmail.com";
		
		String updatedEmail = email.replace("hot", "g");
		
		int endPoint = email.indexOf("@")+1;
		int startPoint = email.indexOf(".");
		
//		System.out.println(updatedEmail);
		System.out.println(email.substring(0,endPoint)+"gmail" +email.substring(startPoint));
		
		*/
	}
	
}
