package day_6;

import java.util.Arrays;

public class JavaciMesutAbi {

	public static void main(String[] args) {

		// Can you give me the max value in an array?
		int [] nums = {21,21,21,23,54,537,21,23,2};//the length of array 9

		
		for (int i = 0; i < nums.length; i++) 
			for (int j = 0; j < nums.length -1; j++) {
				if(nums[j]  <   nums[j+1]) {
					int temp =nums[j];
					nums[j]=nums[j+1];
					nums[j+1]=temp;
				}
			}
		
		if(5>7)System.out.println("5");
		else  System.out.println("It is not correct");
		
//		System.out.println(Arrays.toString(nums));
		
		
		
		
		
		
		
		/*
		int num1 = 14;
		int num2 = 25;
		System.out.println(" num1 = "+num1);
		System.out.println(" num2 = "+num2);
		
		int temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println(" num1 = "+num1);
		System.out.println(" num2 = "+num2);
		*/
		
		
		
		
		/*
		
		for (int i = 0; i < nums.length; i++) {
		 //   21,23,54,537       21,21,21,23,54,537,21,23,2
			if(max < nums[i]) {
				max = nums[i];
			}
			
		}
		System.out.println(max);
		*/
		/*int n1 =12;
		int n2 = 15;
		if(n1 > n2) {
			System.out.println("max value is "+n1);
		}else {
			System.out.println("max value is "+n2);
		}*/
		
		
	}
}
