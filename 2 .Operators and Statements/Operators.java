class Operators {
	
	public static void main(String args[]) {
		
		int i = 1;
		long l = 2L;
		
		// i = i + l;  // compiler error incompatible data types, downcast required
		i = i + (int)l;
		i = (int)(i + l);
		i += l;  // compound assignment operator doet AUTOMATISCH een DOWNCAST
		
		byte b1 = 1;
		byte b2 = 1;
		
		// byte b3 = b1 + b3;  // compiler error incompatible data types, byte en short worden AUTOMATISCH GE-UPCASTED naar een INT!!!
		
		float f = (float)1.0;  // downcast required, literal is een double
		
		long l2 = (long)1.9;  // floors down to 1 precision is lost
		System.out.println(l2);
		
		// float and double use E notation (scientific notation)
		// 3.30E23 -> 3.30 x 10^23
		
		// when downcasting overflow and underflow can occur -> NO RunTimeException is thrown by Java, needs to be handled by the programmer

		int x = 1;
		System.out.println(1 + x++ + x++);  // unary operators are executed first (from left to right)
											// x=2 return 1
											// x=3 return 2
											// result is 1 + 1 + 2
		System.out.println(x);				// x=3
	
	}
	
}