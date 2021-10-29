package com.qa.main;

import com.qa.extra.Second;
import com.qa.extra.Third;

public class Main {

	public static void main(String[] args) {
		
		//A package in Java is used to group related classes together.
		//Two categories:
		//Built in packages which come from the Java API.
		//User defined packages which are packages created by us.
		
		
		//Built-in Packages - 
		//The Java API is a library of classes that contain components for input, database programming and more 
		
		//Examples:
		//import java.util.Scanner;
		//import java.sql.*;
		
		
		
		//User Defined Packages
		//We can define our own packages to group relevant classes together, 
		//Java uses a file system directory to store them, just like folders
		
		//Example - this project structure
		// root (SLPackages)
		//	-> package com.qa.main
		//		->Main.java
		//	-> package com.qa.extra
		//		->Second.java
		//		->Third.java
		
		
		
		// Naming convention 
		// package domain.companyname.packagename;
		
		
		//Generally companies use the reverse of their internet domain name.
		//So if we were to create a package for the controller section of a project named "ims" : 		
		//package com.qa.ims.controller;
		
		
		// Run methods from other classes
		
		Second.hello();
		
		Third.hello();

	}

}
