package com.qa.main;

import java.util.HashMap;// import HashMap
import java.util.Map;
import java.util.Map.Entry;// import Map

import javax.swing.plaf.synth.SynthOptionPaneUI;


//HashMaps are a type of collection in Java.
//Different collections in Java, such as Arrays, Lists, and ArrayLists - all of which contain data which is accessed by an index.
//HashMaps work differently because they allow you to map information from an index (key) to the data you want (value).


public class Main {

	public static void main(String[] args) { //set up main class
		
		
		HashMap<String, String> capitalCities = new HashMap<>(); //created a HashMap object called capialCities
		//HashMap<String, String> : 1st String = key, 2nd String = value
		
		capitalCities.put("England", "London");// "England" = key, "London" = value
		capitalCities.put("Germany", "Berlin");
		capitalCities.put("USA", "Washington DC");
		
		
		System.out.println(capitalCities);
		// print the content of capitalCities HashMap
							
		//HashMap has lots of build in methods to use like
		// get() to access a value
		capitalCities.get("England");
		System.out.println(capitalCities.get("England")); // print value for key "England"
		
		//put() to add an item inside the HashMap
		capitalCities.put("Romania","Bucuresti");
		
		//size() to find out how many items there are
		System.out.println(capitalCities.size());
		
		//remove() to remove an item using the key 
		capitalCities.remove("England");
		System.out.println(capitalCities);//print capitalCities
		
		//clear() to remove all items
		//capitalCities.clear();
		//System.out.println(capitalCities);//print empty {}

		
		
		System.out.println("=========");
		//Loop Through a HashMap
		
		//Can use Use the 
		//keySet() method if you only want the keys, or 
		//values() method if you only want the values, or
		//entrySet() method 
		
		
		// Using keySet()
		for (String i : capitalCities.keySet()) {
			System.out.println(i);
		};
		// for ( each String inside capitalCities set of Keys() )
		// {print each Each String inside those keys}
		
		
		//Using values()
		for (String i : capitalCities.values()) {
			System.out.println("Values are: " + i );
		};

		
		//Print keys and values
		for (String i : capitalCities.keySet()) {
			System.out.println("Key: " + i + " Value: " + capitalCities.get(i));
		// for each key inside capitalCities
		// print text + the key + text + the value of each key using get() method			
		};
		
		System.out.println("");
		System.out.println("======Print using entrySet()====");
		//Print using entrySet() method
		for (Entry<String, String> i : capitalCities.entrySet()) {
			System.out.println(i);
		// declare an Entry collection Entry<String,String> as i 
		// print key=value , e.g. USA=WashingtonDC
		};
		
		
		
		
		
		//Other Types 
		System.out.println("");
		System.out.println("======== Other Types =======");
		
		//HashMap<String, Integer> : key = type String, value = type Integer
		
		
		HashMap<String, Integer> localTemp = new HashMap<>();
		// created another HashMap object called localTemp 
		// where String = key, Integer = value
		
		localTemp.put("Madrid", 32);
		localTemp.put("Kiev", 14);
		localTemp.put("Barcelona", 28);
		
		System.out.println("String, Integer:  " + localTemp);
		// print the content of localTemp HashMap
		
		
		//HashMaps <String Boolean> : key = type String, value : type boolean
		HashMap<String, Boolean> hasSnow = new HashMap<>();
		hasSnow.put("Rubgy",false );
		hasSnow.put("Glasgow",true );
		hasSnow.put("Inverness",true );
		
		System.out.println("String, Boolean:  " + hasSnow );
		
		
		
		
		
		
	}
	
}
