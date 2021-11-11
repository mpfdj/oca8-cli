
/*
Eerste statement moet naar een constructor zijn dwz this(...) of super(...)
Wanneer niet gespecificeerd dan super() als default

Let op de constructor is onderdeel van het initializatie proces (de laatste stap). Bijvoorbeeld voor het zetten van een final instance / static variable.

Default no-args constructor (wordt alleen gegeneerd wanneer er geen andere constructors zijn)
No-args constructor
Private constructor (bijvoorbeeld als een class alleen static members heeft)
Constructor chaining

*/

class AnotherConstructor {
	
	AnotherConstructor() {
		System.out.println("AnotherConstructor 1");
	} 
	
	AnotherConstructor(String s) {
		System.out.println("AnotherConstructor 2");
	}  
}


// In onderstaande class wordt constructor chaining gebruikt adhv this(...)
class SomeConstructor extends AnotherConstructor {
		
	SomeConstructor() {
		this("aaa");
		System.out.println("SomeConstructor 1");
	}
	
	SomeConstructor(String s) {
		this(s, "bbb");
		System.out.println("SomeConstructor 2");
	}
	
	SomeConstructor(String s, String t) {
		//super("ddd");  <- LET OP standaard wordt super() aangeroepen dit moet de DEFAULT NO-ARGS CONSTRUCTOR zijn of de NO-ARGS CONSTRUCTOR
		System.out.println("SomeConstructor 3");
	}
	
}


class Constructors {
	public static void main(String args[]) {
		new SomeConstructor();  // AnotherConstructor 1 SomeConstructor 3 SomeConstructor 2 SomeConstructor 1
	}
}