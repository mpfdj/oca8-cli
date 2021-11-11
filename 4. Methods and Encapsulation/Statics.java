import java.util.ArrayList;
import java.util.List;
import static java.lang.Math.PI;  // static import
import static java.util.Arrays.asList;

/*

initializatie:
super
static variables
static initializers
instance variables
instance initializers
constructor

*/

class Miel {
	static int counter;  				// default value is 0
	static final String NAME = "Miel";
	static final List<String> COLLECTION;  // COLLECTION kan niet worden ge-reassigned! Er kunnen wel methodes op de reference variable worden aangeroepen
	String hobby = "dj-en";				// let op dit is een INSTANCE variable
	
	static {
		COLLECTION = new ArrayList<>();
		COLLECTION.add("Jeff Mils");
		COLLECTION.add("DJ Rolando");

	}
	
	public Miel() { counter++; } // telt het aantal instanties is namelijk gedefineerd in de constructor
}

class Statics {
		
	static void asList(String... items) {
		System.out.println("overloads static import!");
		System.out.println("number of items: " + items.length);
	}
		
	public static void main(String args[]) {
		Miel m1 = new Miel();
		Miel m2 = new Miel();
		Miel m3 = new Miel();
		System.out.println(Miel.counter);  // 3
		
		m1 = null;
		System.out.println(m1.counter);  // 3 let op dit werkt wordt namelijk aangeroepen op de reference type

		// System.out.println(Miel.hobby);  // een static method mag geen instance member aanroepen. Andersom wel!
											// compiler error: non-static variable name cannot be referenced from a static contexts
											
		System.out.println(Miel.NAME);
		// Miel.NAME = "Kim";  // cannot assign a value to final variable NAME
		
		Miel.COLLECTION.add("Da Hool");  // <- methodes mogen wel worden aangeroepen
		System.out.println(Miel.COLLECTION);
		
		System.out.println(PI);

		asList("a", "b", "c");
		
	}
	
}