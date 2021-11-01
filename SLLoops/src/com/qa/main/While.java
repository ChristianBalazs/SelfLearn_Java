package com.qa.main;

public class While {

	public static void main(String[] args) {
		
		// while (condition ) { execute code}
		
		
		//Example :
		
		int i = 0;  // create integer i and assign value of 0
		while (i < 5) {  // condition : while i is less than 5
		  System.out.println(i);  // first execution : print value of i
		  i++;                    // next execution  : increase i by 1
		}
		
		
		
		//Another example
		
		int catCount = 0;  // set up integer catCount with value 0
        boolean notEnoughCats = true;  // set up boolean notEnoughCats with value true

        while(notEnoughCats) { //condition : while notEnoughCats is true
            System.out.println("Another cat");  //first execution: print text "Another cat"
            catCount++;							// next execution: increase catCount by 1
            if(catCount > 20) { 		// next execution: if condition inside the loop : if catCount is greater than 20
                notEnoughCats = false;	// notEnoughCats has value of false
            }
        }

        System.out.println("Too many cats what do I do"); // outside while loop : print text 
        
    	
	
	}

}
