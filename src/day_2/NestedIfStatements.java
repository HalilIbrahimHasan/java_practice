package day_2;

import java.util.Scanner;

public class NestedIfStatements {

	public static void main(String[] args) {
		/*
		 * ask user to enter 2 birth dates as year, month and day then find the older
		 * person using Nested if statements and respecting camelCase find all possible
		 * conditions int birthYearOfYusuf, birthYearOfMehmet, birthMonthOfYusuf,
		 * birthMonthOfMehmet, birthDayOfYusuf, birthDayOfMehmet;
		 */
		/*
		 * Test data: 5 / 8 / 2000 2 / 5 / 1990 then test it with 3 / 8 / 2000 3 / 5 /
		 * 2000 then test it with 3 / 5 / 2000 3 / 5 / 2000
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Please type the birth year of Yusuf");
		int birthYearOfYusuf = scan.nextInt();

		System.out.println("now type the birth year of Mehmet");
		int birthYearOfMehmet = scan.nextInt();

		System.out.println("now type birth month of Yusuf");
		int birthMonthOfYusuf = scan.nextInt();

		System.out.println("now type birth month of Mehmet");
		int birthMonthOfMehmet = scan.nextInt();

		System.out.println("now type birth day of Yusuf");
		int birthDayOfYusuf = scan.nextInt();

		System.out.println("now type birth day of Mehmet");
		int birthDayOfMehmet = scan.nextInt();

		if (birthYearOfYusuf <= birthYearOfMehmet) {
//			System.out.println("Yusuf is older than Mehmet");
			if (birthMonthOfYusuf <= birthMonthOfMehmet) {

				if (birthDayOfYusuf < birthDayOfMehmet) {
					System.out.println("Yusuf is older than Mehmet");
				}else if(birthDayOfYusuf > birthDayOfMehmet) {
					System.out.println("Mehmet is older than Yusuf");
				}else {
					System.out.println("Yusuf is as older as Mehmet");
				}
			}else {
				System.out.println("Mehmet is older than Yusuf");
			}
		}else {
			System.out.println("Mehmet is older than Yusuf");
		}

		/*
		 * System.out.println("Please type the birth year of Yusuf"); int
		 * birthYearOfYusuf = scan.nextInt();
		 * 
		 * System.out.println("now type the birth year of Mehmet"); int
		 * birthYearOfMehmet = scan.nextInt();
		 * 
		 * System.out.println("now type birth month of Yusuf"); int birthMonthOfYusuf =
		 * scan.nextInt();
		 * 
		 * System.out.println("now type birth month of Mehmet"); int birthMonthOfMehmet
		 * = scan.nextInt();
		 * 
		 * System.out.println("now type birth day of Yusuf"); int birthDayOfYusuf =
		 * scan.nextInt();
		 * 
		 * System.out.println("now type birth day of Mehmet"); int birthDayOfMehmet =
		 * scan.nextInt();
		 * 
		 * 
		 * if(birthYearOfYusuf <= birthYearOfMehmet) { if(birthMonthOfYusuf <=
		 * birthMonthOfMehmet) { if(birthDayOfYusuf < birthDayOfMehmet) {
		 * System.out.println("Yusuf is older than Mehmet"); } else if(birthDayOfYusuf >
		 * birthDayOfMehmet) { System.out.println("Mehmet is older than Yusuf"); }else {
		 * System.out.println("Yusuf is as older as Mehmet");
		 * 
		 * } }else{ System.out.println("Mehmet is older than Yusuf"); } }else {
		 * System.out.println("Mehmet is older than Yusuf"); }
		 */

	}
}
