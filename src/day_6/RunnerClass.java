package day_6;

import java.util.Scanner;

public class RunnerClass {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);//ask user some imputs
		//you have 4 objects
		School [] allStudents = new School[4];//what is the data type?
		School obj1 = new School();//You just need 1 data type
		
		
		obj1.schoolRunner("Melik ", "Alcicek");
		obj1.schoolRunner("Bahadir", "Okur", "Java_practice", "1234");
		
		
		
		/*
		
		//We are setting the data to school class
		for(int i =0; i<allStudents.length; i++) {
			allStudents[i] = new School();
			System.out.println("Please type your name");
			allStudents[i].name = scan.next();
			System.out.println("Please type your last name");
			allStudents[i].lastName = scan.next();
			System.out.println("Please type your class name");
			allStudents[i].className = scan.next();
			System.out.println("Please enter your school ID");
			allStudents[i].studentID =scan.next();
			
		}
		
		
		for(int i=0; i<allStudents.length;i++) {
			System.out.println("=====================================================");
			System.out.println("Object "+(++i)+" student name is "+allStudents[--i].name);
			System.out.println("Object "+(++i)+" student last name is "+allStudents[--i].lastName);
			System.out.println("Object "+(++i)+" student class name is "+allStudents[--i].className);
			System.out.println("Object "+(++i)+" student's ID is "+allStudents[--i].studentID);
			System.out.println("=====================================================");

		}
		*/
		
		
		
	}
}
