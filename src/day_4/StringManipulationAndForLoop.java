package day_4;

public class StringManipulationAndForLoop {

	public static void main(String[] args) {
		/*
		create a method called numberOfChars and pass 2 parameters 1- char 2- String
		char ch = 'p';
		String str = "population is number of people";
		int count = 0; 
		then find how many times the given char is repeated in the String
		and print it on the console
		use for loop, increment and if statements  
		*/
		char ch = 'p';
		String str = "population is number of people";
		
		int numberOfChars = numberOfChars( ch,str  );
	
		System.out.println("Your "+ch+ " has repeated "+ numberOfChars+" times in "+str);
		
	}
	
	public static int numberOfChars(char ch, String str) {
		int counter = 0;
		
		for(int i=0; i<str.length();i++) {
			if(str.charAt(i) == ch) {
				counter++;
			}
		}
		
		
		
		return counter;
	}
	
	char c = 'a';
	
}
