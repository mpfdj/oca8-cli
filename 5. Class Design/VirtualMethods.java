/*
blz 284

virtual method is een methode waarvan de IMPLEMENTATIE tijdens RUNTIME bepaald wordt
non-static
non-private
non-final

Bij virtuele methodes wordt polymorphisme met method overriding gecombineerd!!!

*/


class Bird {
	String getName() { return "Unknown"; }
	void displayInformation() { System.out.println("The bird name is: " + getName()); }  // LET OP getName is overriden tijdens runtime!!!!!!
}

class Peacock extends Bird {
	String getName() { return "Peacock"; };  // overriden
}

class VirtualMethods {
	
	public static void main(String args[]) {
		Bird b = new Peacock();		// reference type is BIRD!
		b.displayInformation();		// The bird name is: PEACOCK  -> getName wordt overschreven door Peacock
	}
	
}