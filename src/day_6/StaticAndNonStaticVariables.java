package day_6;

public class StaticAndNonStaticVariables {
	int number; // instance variable what is its default value?
	static int number2; // instance variable it is shared and you can 
	// call static variables with className
/*
	Iki tane instance int variable olusturunuz ve biri static digeri non-static olsun
	sonra bu class tan iki farkli object olusturunuz
	*/
	
	public static void main(String[] args) {

	StaticAndNonStaticVariables obj1 = new StaticAndNonStaticVariables();
	obj1.number =15;// Assign values to int variables
	obj1.number2 =15;//
/*
	System.out.println(obj1.number);
	System.out.println(obj1.number2);
	
*/	StaticAndNonStaticVariables obj2 = new StaticAndNonStaticVariables();
	
	obj2.number += 15;
	obj2.number2 += 15;
	
	
	System.out.println(obj2.number);
	System.out.println(obj2.number2);
	
	
	
	
	/*
	StaticVariable obj2 = new StaticVariable();

	obj2.number += 15;
	obj2.number2 += 15;
	System.out.println(obj2.number);
	System.out.println(obj2.number2);
	*/

}}
