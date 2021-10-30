package com.qa.main;

public class SwitchCase {

	public static void main(String[] args) {
		
		// Switch case statement
		// Use when we have a set number of options - large number of options
		
		
		
		//Format
		
//		switch(variable name) {
//		case option1 : execute this code;
//		break;
//		case option2 : execute this code;
//		break;
//		case option3 : execute this code;
//		break;
//		default:  execute this code;
//		break;		
//		}
		
		
		
		
		//Example
		
		int day = 5;

        switch(day) {
            case 1:
                System.out.println("Monday you can fall apart");
                break;
            case 2:
                System.out.println("Tuesday,");
                break;
            case 3:
                System.out.println("Wednesday break my heart");
                break;
            case 4:
                System.out.println("Oh, Thursday doesn't even start");
                break;
            case 5:
                System.out.println("It's Friday I'm in love");
                break;
            case 6:
                System.out.println("Saturdaaaay wait");
                break;
            case 7:
                System.out.println("Sunday always comes too late");
                break;
            default:
                System.out.println("You need to listen to The Cure");
                break;
        }
		

	}

}
