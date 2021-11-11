/*
private abstract methodes zijn NIET toegestaan
private final methods zijn NIET toegestaan

access modifiers default, protected en public zijn toegestaan

voor abstracte methodes gelden de override regels

een intermediate abstract class mag ook methodes implementeren
in de EERSTE CONCRETE CLASS moeten alle abstracte methodes geimplemented zijn

let op een abstracte class mag NIET geinstantieerd worden!!!

*/

abstract class rootCa {
	String getRootCa() { return "Verisign"; }
	abstract String getIdentity();
	abstract String signedBy();
}


abstract class intermediateCa extends rootCa {
	String signedBy() { return "miel & co"; }  // methode is geimplemented door een INTERMEDIATE abstract class
}


class AbstractClass extends intermediateCa {  // FIRST CONCRETE CLASS moet ALLE abstracte methodes implementeren
	
	String getIdentity() { return "miel"; }
	
	public static void main(String args[]) {
		AbstractClass a = new AbstractClass();
		System.out.println(a.getRootCa());  	// Verisign
		System.out.println(a.signedBy());  		// miel & co
		System.out.println(a.getIdentity());  	// miel
	}
	
}