/*
overloaded method 
heeft ANDERE METHOD PARAMS (niet covariant)
return type mag wijzigen
access modifier MAG kleiner zijn

overrided method 
heeft DEZELFDE METHOD PARAMS
covariant return type 
covariant CHECKED exception
access modifier mag NIET kleiner zijn

hidden method is private in de parent class, let op dan gelden de regels van overload en override NIET


redeclare private method
final method
hidden static methods
hidden instance variables (instance variables zijn altijd hidden! maakt niet uit of ze static zijn of niet)

*/
class A {
	
	char letter = 'A';
	
	int getMagicNumber(Number n) { return 1; }
	
	Number getAnotherMagicNumber() { return 1; }
	
	private void getMagicLetter() { return; }  
	
	final char getAnotherMagicLetter() { return 'A'; }
	
	static char getHiddenLetter() { return 'A'; }
	
	char test() { return letter; }
}


class B extends A {
	
	char letter = 'B';
	
	int getMagicNumber(Integer i) { return 2; }  									// overloaded method are also hidden!!!
	
	public Integer getAnotherMagicNumber() throws RuntimeException { return 2; }   	// overridden method
	
	char getMagicLetter() { return 'B'; }											// redeclare a private method!
	
	//char getAnotherMagicLetter() { return 'B'; }  								// compiler error overridden method is final

	static char getHiddenLetter() { return 'B'; }									// hidden method
	
	char test() { return letter; }
}


class InheritingMethods {
	
	public static void main(String args[]) {
		A a = new B();
		
		System.out.println(a.getAnotherMagicNumber());  // 2
		
		System.out.println(a.getMagicNumber(1));  		// 1
		
		System.out.println(a.getHiddenLetter());		// A
		
		System.out.println(a.letter);					// A
		
		B b = (B)a;
		System.out.println(b.letter);					// B
		System.out.println(b.getMagicNumber(1));		// 2
		
		System.out.println(a.test());					// B	let op 2x B omdat test een overridden method is!!!
		System.out.println(b.test());					// B
	}
	
}