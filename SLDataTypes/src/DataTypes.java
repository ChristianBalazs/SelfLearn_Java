
public class DataTypes {
	
	
	//When executing a method, sometimes we need a value to be produced 
	//that value is return type
	// returns are strongly typed
	
	
	//no return method
	public static void noReturn() {
		System.out.println("No value returned");
	}
	
	
	//string type return
	public static String withStringReturn() {
		System.out.println("Value returned");
		return "Hello World";
	}
	
	
	//integer type return
	public static int withIntReturn() {
		return 12;
	}
	
	
	//boolean type return
	public static boolean withBooleanReturn() {
		return true;
	}
	
	//float type return
	public static float withFloatReturn() {
		return 3.2f;
	}
	
}
