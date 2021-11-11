
/*
default no-args constructor
user defined no-args constructor
this() or super() moet het eerste statement zijn
constructor chaining
*/

class Opa {
	Opa() { this(65); System.out.println("Opa"); }
	Opa(int i) { System.out.println("Opa is " + i + " jaar"); }  // eerste statement is super() wordt automatisch toegevoegd door de compiler
}

class Miel extends Opa {
	Miel() { System.out.println("Miel"); }  // dit is de USER-DEFINED no-args constructor
}

class Kim extends Miel {
	// hier wordt de DEFAULT no-args constructor aangemaakt
}

class Constructors {
	
	public static void main(String args[]) {
		new Kim();
		
		// Opa is 65 jaar
		// Opa
		// Miel
		
	}
}