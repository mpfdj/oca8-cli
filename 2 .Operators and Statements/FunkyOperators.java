class FunkyOperators {
	
	public static void main(String args[]) {
		
		// dit is een voorbeeld van een genested ternary
		System.out.println(9 < 10 ? 8 < 10 ? 1 : 11 : 12);  // 1
		
		// nu met haakjes :-)
		System.out.println(9 < 10 ? (8 < 10 ? 1 : 11) : 12);  // 1

		
		int i;
		
		i = 1;
		i += 10 / 5;
		System.out.println(i);
		
		// nu met haakjes
		i = 1;
		i = i + (10 / 5);
		System.out.println(i);
		
		
		// dit is een hele vieze 
		i = 0;
		i = i++;
		System.out.println(i);  // 0
		
		/*
		i = 1  		-> let op i wordt eerst verhoogd
		return 0  	-> DAARNA volgt de return value
		i = 0
		*/
		
		
		// alle primitives kunnen mbv == worden vergeleken behalve boolean
		byte b = 1;
		long l = 1L;
		double d = 1.0;
		char c = 'a';
		System.out.println(b == l);  // byte wordt ge-upcast naar een long
		System.out.println(b == d);  // idem maar dan naar double
		System.out.println(b == c);  // false maar geen compiler error
		//System.out.println(b == true);  // error: incomparable types: byte and boolean
	}
	
}