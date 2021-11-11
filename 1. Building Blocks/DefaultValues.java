class DefaultValues {

	/*
	static en instance variabelen hebben de default value
	local variablen niet!
	*/
	
	// let op van uit een static context moet je een static method of variable aanroepen geen instance!
	static byte b;  		// 0
	static short s;  		// 0
	static int i;  			// 0
	static long l;  		// 0
	static float f;  		// 0.0
	static double d;   		// 0.0
	static char c;  		// NUL '\U0000'
	static boolean check;  	// false
	static String hello;  	// null
			
	public static void main(String args[]) {
		int localNumber = 0;  // local variables need to be initialized!
		System.out.println("byte: " + b);
		System.out.println("short: " + s);
		System.out.println("int: " + i);
		System.out.println("long: " + l);
		System.out.println("float: " + f);
		System.out.println("double: " + d);
		System.out.println("char: " + c);
		System.out.println("boolean: " + check);
		System.out.println("String: " + hello);
		
		// hier worden 2 arrays met default waardes gemaakt
		int numbers[] = new int[5];
		System.out.println(numbers[0]);  
		
		boolean checks[] = new boolean[5];
		System.out.println(checks[0]);  
	}
}