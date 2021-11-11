class Equals {
	
	
	public static void main(String args[]) {
		
		Long l = 1L;
		Double d = 1.0;
		
		Integer i1 = new Integer(1);
		Integer i2 = new Integer(1);
		
		System.out.println(l == 1);  	// true
		//System.out.println(l == d);  	// incomparable types: Long and Double
		System.out.println(i1 == i2);  	// false
		
		System.out.println(i1.equals(i2));	// true
		System.out.println(i1.equals(1));	// true
		System.out.println(i1.equals(l));	// false
	}
	
}