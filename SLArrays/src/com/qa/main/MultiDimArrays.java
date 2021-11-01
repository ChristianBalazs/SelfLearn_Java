package com.qa.main;

public class MultiDimArrays {

	
	
	static //MULTI Dimensional Arrays
	// Arrays that store arrays inside them
	// Each of the indexes within a multi dimensional array stores an array within them
	
	//To create multi dimensional array:
	
	//Variant 1:
	int [][] ageArray;
	
	//Variant 2:
	int [][] ageArray2 = {{1,2,3,4}, {12,13,14}}; 
	
	//Variant 3:
	int [][] ageArray3 = new int[3][2];
		
	
	
	//Example of TWO dimensional array
	static int[][]myNumbers = {{1,2,3,4}, {12,13,14}}; 
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
	// Access elements inside multi dimensional array
		// to access element with value 1
		System.out.println((myNumbers[0][0])); 
		// myNumbers[a][b] - 
		// [a] is index position for AN element inside the multi array, which is an ARRAY
		// [b] is index position for AN element inside the ARRAY at position [a]
		
		
		// to access element 14:
		System.out.println(myNumbers[1][2]);
		
		// to access element 4
		System.out.println(myNumbers[0][3]);

		
		
		
		//for loop inside another for loop to get the elements 
		
		int[][] myNumbers2 = { {1, 2, 3, 4}, {5, 6, 7} };
	    for (int i = 0; i < myNumbers2.length; ++i) {
	      for(int j = 0; j < myNumbers2[i].length; ++j) {
	        System.out.println(myNumbers2[i][j]);
	      }
	    }
	    // print 15,16,17,25,26,27,35,36,etc - wrong guess WHY?
	    // Because [i] refers to Array inside array and [j] refers to element inside Array [i]
	    
	    	    
	    

	    
	    
		
		
	}

}
