/*
Order of initialization:
super class
static variables
static initializers
instance variables
instance initializer
constructor
*/

class Miel {
	static { System.out.println("static initializer Miel"); }
	{ System.out.println("instance initializer Miel"); }
	Miel() { System.out.println("constructor Miel"); }
}

class Kim extends Miel {
	static { System.out.println("static initializer Kim"); }
	{ System.out.println("instance initializer Kim"); }
	Kim() { System.out.println("constructor Kim"); }
}


class Initialization {
	
	public static void main(String args[]) {
		System.out.println("main");
		new Kim();
		
		/*
		main
		static initializer Miel
		static initializer Kim
		instance initializer Miel
		constructor Miel
		instance initializer Kim
		constructor Kim
		*/
	}
}