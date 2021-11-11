/*

Denk vanuit de compiler, hoe kan de compiler onderscheid maken tussen de verschillende methodes.
Bij een overload MOETEN DE PARAMETERS VERSCHILLEND ZIJN!

Volgorde van matching:
exacte match
eerst volgende primitve!
de Wrapper class
Object
vargs

match, primitive, Wrapper class, Object, varargs

*/

class Miel {
	protected void hello() {};
}

class Kim extends Miel {
	private void hello(String s) {};  // method overloading can be MORE restrictive
}


class MethodOverloading {
	
	void test(byte b) { System.out.println("byte"); }
	void test(int i) { System.out.println("int"); }
	//int test(int i) { return -1; }  // compiler error, METHOD IS ALREADY DEFINED
	
	void test2(double d) { System.out.println("double"); }
	void test2(Integer i) { System.out.println("Integer"); }
	
	void test3(Long l) { System.out.println("Long"); }
	
	void test4(Object o) { System.out.println("Object"); }
	void test4(double... d) { System.out.println("vargs"); }
	
	void test5(Object o) { System.out.println("Object"); }
	
	void test6(long l) { System.out.println("long"); }
	void test6(Long i) { System.out.println("Long"); }
	
	
	public static void main(String args[]) {
		
		MethodOverloading m = new MethodOverloading();
		
		
		m.test(1);  // int using exact match
		m.test((byte) 1);  // byte
		
		
		m.test2(1);  // double
		m.test2((byte) 1);  // double
		
		
		// m.test3(1);  // compiler error, incompatible types: int cannot be converted to Long
		
		
		m.test4(1);  // Object  <- SURPRISING :-)  primitive, Wrapper class, Object
		
		
		m.test5(1);  // Object
		
		
		m.test6(new Integer(1));
		
	}
	
	
} 