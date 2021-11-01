package com.qa.main;

public class BreakContinue {

	public static void main(String[] args) {
		
		// break - break out of the current code block, 
		// in loops - will skip the rest of the loop and move onto executing the rest of the code.
		
		// continue - break out of the current iteration of a code block, 
		// in loops - will skip the current iteration of the code block and move onto the next.
		
		//return - used in methods to return values according to the methods return type, ending the method.
		
		
		//Example 1:
		
	       for(int i = 0; i < 10; i++) { 
	            if(i == 2) { // if i equals 2 continue to next iteration without executing rest of the code for this iteration
	                continue;
	            }
	            if(i == 7) { // if i equals 7, stop(skip) the loop and execute rest of code
	                break;
	            }
	            System.out.println(i); // print value of i for each iteration
	        }
	        //statement 1: create integer i with value 0
	        //statement 2: i is less than 10
	        // statement 3: increase i by 1
	       
	        // RESULT: print 0,1,3,4,5,6 on separate lines
	        // will not print 2 due to continue KEYWORD
	        // will stop the loop when i = 7, therefore the last full loop was at i =6 
	      
	       
		

	}

}
