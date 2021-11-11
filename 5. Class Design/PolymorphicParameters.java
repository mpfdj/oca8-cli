

class Reptile {
	String getName() { return "Reptile"; }
}

class Alligator extends Reptile {
	String getName() { return "Alligator"; }
}

class Crocodile extends Reptile {
	String getName() { return "Crocodile"; }
}

class ZooWorker {
	void feed(Reptile reptile) {
		System.out.println("Feeding " + reptile.getName());  // hier wordt METHOD OVERRIDING in combinatie met POLYMORPHISME toegepast
	}
}

class PolymorphicParameters {

	public static void main(String args[]) {
		ZooWorker z = new ZooWorker();
		z.feed(new Reptile());		// Feeding Reptile
		z.feed(new Alligator());	// Feeding Alligator
		z.feed(new Crocodile());	// Feeding Crocodile
		//z.feed(new Object());  	// compiler error UNRELATED HIERARCY!!!
		
	}
	
}