import miel.Miel;

class Kim extends Miel {
	
	protected String firstName = "Kim";
	public String test = "Kim Test";
	
	static { System.out.println("Static Kim"); }
	{ System.out.println("Instance Kim"); }
	public Kim() { System.out.println("Constructor Kim"); }
	
	// protected short test() { return 1; }  // short is not compatible with byte
	
	public void test2() {
		System.out.println(firstName);
	}
	
	void printMiel() {
		System.out.println(super.firstName);
		//System.out.println(lastName);
	}
	
	void printMiel2() {
		Miel m = new Miel();
		// System.out.println(m.firstName);  // has protected access in Miel
	}

	static void printStatic() {
		System.out.println("Static");
	}
}

class Tester {
	
	public static void main(String args[]) {
		Kim kim = new Kim();
		Miel miel = (Miel) kim;
		
		kim.test2();  // Kim
		miel.test2(); // Kim --> let op in beide gevallen Kim
		
		kim.printMiel(); // Miel
		
		System.out.println(kim.test);  // Kim Test
		System.out.println(miel.test); // Miel Test
		
		Object o = kim;  // upcast no explicit cast required
		
		Kim kim2 = null;
		kim2.printStatic();  // static methods can be called on reference variables
		
		Integer i = new Integer(1);
		Integer j = new Integer(1);
		int k = i + j;
		Integer l = 1 + 1;
		System.out.println(i == j); // false
		System.out.println(i == 1); // true
		System.out.println(i.equals(j)); // true
		System.out.println(i.equals(1)); // true
		
		Object p = null;
		//System.out.println(p.toString()); // code compiles but throws a NullPointerException
		
		// byte b = 128;  // incompatible types: possible lossy conversion from int to byte
		byte b = 127;
		byte b2 = (byte) 128;
		System.out.println(b2); // -128 -> overflow
		

	}
	
}