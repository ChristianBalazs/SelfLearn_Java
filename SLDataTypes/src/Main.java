
public class Main {

	public static void main(String[] args) {
		
		
		// When we declare a variable in Java
		// we specify the type of variable 
		
		
		int myNum = 32;             // 32 bit
		float myFloatNum = 3.6f;   // 32 bit
		char myLetter = 'A';       // Unicode
		boolean myBool = true;     // True or False : 0 or 1
		byte myByte = 8;           // 8 bit
		short myShortNum = 16;     // 16 bit
		long myLongNum = 64L;      // 64 bit 
		String myText = "text here ";
		
		
		
		//Running methods from DataTypes class:		
		
		//Run noReturn() method from DataTypes class
		DataTypes.noReturn();
		
		//Run withStringReturn() method from DataTypes class
		DataTypes.withStringReturn();
		
		//Run noReturn() method from DataTypes class inside syso println command
		System.out.println(DataTypes.withStringReturn());
		
		System.out.println("=========");
		
		System.out.println(DataTypes.withIntReturn());
		
		System.out.println(DataTypes.withBooleanReturn());
		
		System.out.println(DataTypes.withFloatReturn());
				
			
				

	}

}
