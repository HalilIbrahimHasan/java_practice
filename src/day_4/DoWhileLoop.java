package day_4;

public class DoWhileLoop {

	public static void main(String[] args) {
		/*
		There is a lonely monkey in the island 
		He needs to eat 4 bananas every day
		there are just 165 bananas in that island 
		Create following variables and find how many days 
		monkey can survive.
		Use do while loop, increment and decrement and if statements
		int numberOfBananas =165, survivalDays = 1;
		boolean monkeyAlive = true;
		*/
		int numberOfBananas =165, survivalDays = 1;
		boolean monkeyAlive = true;//true
		
		do {
			
			
			System.out.println("Monkey eats 4 bananas every day");
			numberOfBananas -= 4;
			
			if(numberOfBananas < 4) {
				monkeyAlive = false;
				System.out.println("Today is day "+survivalDays+" and there is no more "
						+ "food for monkey and monkey is dead ");
				
			}else {
				survivalDays++;
				System.out.println("Today is day "+survivalDays+" and Monkey is alive");
			}
			
			
			
			
			
		}while(monkeyAlive);
		
		
		System.out.println("Total days monkey has survived: "+survivalDays);
		
		
		
	}
	
}
