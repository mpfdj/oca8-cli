/*

covariant exception type

let op een RuntimeException mag je altijd declaren bij een override omdat deze immers niet afgehandeld hoeft te worden!

*/

class Miel {
	void hello() throws Exception {  // let op dit is een CHECKED EXCEPTION!!!
		System.out.println("Hello Miel");
	}
	
	void bye() {
		System.out.println("Bye Miel");
	}
	
}

class Kim extends Miel {
	void hello() {  // override zonder exception
		{ System.out.println("Hello Kim"); }
	}
	
	void bye() throws RuntimeException {  // let op deze override mag omdat een Runtime exception NIET afgehandeld te worden
		System.out.println("Bye Kim");
	}
	
}

class OverridingMethodsWithExceptions {
	
	public static void main(String args[]) throws Exception {
		Miel m = new Kim();
		m.hello();  // Hello Kim
		m.bye();	// Bye Kim
	}
	
}