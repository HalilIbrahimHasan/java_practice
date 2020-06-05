package day_6;

public class DuplicateOnes {
	 public static void main(String[] args) {
	        int nums[] = {12,12,11,12,21,21,23,54,537,23,2};
	        
//	      for (int i = 0; i<nums.length; i++) {
//	          int count = 0;
//	          
//	          for (int j = 0; j<nums.length; j++) {
//	              
//	              if(i != j && nums[i]==nums[j]) {
//	                  count++;
//	              }
//	              
//	          }if (count == 0) {
//	              System.out.println(nums[i]);
//	          }
//	      }
	        for (int i = 0; i<nums.length; i++) {
	            for (int j = i+1; j<nums.length;  j++) {
	                if (nums[i]==nums[j])
	                    System.out.println("This array has dublicate integer " + nums[i]);
	            }
	        }
	            
	    
	    
	    
	    
	    
	    }

}
