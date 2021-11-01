package com.qa.main;

public class ForLoop {

	public static void main(String[] args) {
		
		// for (statement 1; statement 2; statement 3) {code to execute}
		// Statement 1 is executed (one time) before the execution of the code block.
		// Statement 2 defines the condition for executing the code block.
		// Statement 3 is executed (every time) after the code block has been executed.
		
		
		//Example 1:
		
		for(int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		// statement 1 : create integer i with value 0
		// statement 2: condition i is less than 5
		// statement 3: increase i by 1
		
		
		
		//Example 2:
		
		for(int i = 0; i < 10; i = i+2) {
			System.out.println(i);
		}
		//statement 3: increase i by 2

	}

}
