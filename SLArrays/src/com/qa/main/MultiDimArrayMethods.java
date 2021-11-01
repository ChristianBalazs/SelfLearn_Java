package com.qa.main;

public class MultiDimArrayMethods {

	public static int[][] ageArrayMD = new int[3][2];
	// create an empty multi dim array with 3 arrays inside and each array with 2 elements
	
	
	public static int twoDArray[][] = {{0, 1, 2}, {1, 2, 3}, {2, 3, 4}};
	
	
	
	public static void main(String[] args) {
		
		//ASSIGN array values:
		
		ageArrayMD[2][1] = 59;
		//will input the value 59 into the array named ageArrayMD at index 2 (so inside the ARRAY at index 2)
		// 59 will be the element at index 1 inside that ARRAY at index 2
		
		ageArrayMD[1][1] = 40;
		
		
		
		System.out.println(ageArrayMD[1][1]); // print 40
		System.out.println(ageArrayMD[2][1]); // print 59
		
		
		// ageArrayMD[3][0]= 80; 
		// Get Error because we want to add a value inside the 4th Array
		// ageArrayMD[3][2] was created with only 3 arrays
		
		System.out.println("=========");
		
		
		//For Loop: -> NEED TO UNDERSTAND BETTER
		for(int i = 0; i < twoDArray.length; i++) {
            for(int j = 0; j < twoDArray[i].length; j++) {
                System.out.print(twoDArray[i][j]);
            }
            System.out.println();        
            //print 012, 123, 234 on each line
		}   
		
		System.out.println("=========");
		
		
		
		//For EAch Loop: -> NEED TO UNDERSTAND BETTER
        for(int[] a : twoDArray) {
            for(int b : a) {
                System.out.print(b);
            }
            System.out.println();
        }// print 012,123,234 on each line
		
		

	}

}
