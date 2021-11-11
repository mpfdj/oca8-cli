public class Tester {
	
	public static void main(String args[]) {
		
		// MielClone heeft een public wrapper
		
		
		// Miel en MielClone zitten in DEZELFDE package
		// Via reference variable en inheritance
		jaeger.de.miel.MielClone c = new jaeger.de.miel.MielClone();
		//c.playTune();  //  playTune() is not public in Miel; cannot be accessed from outside package
		c.cloning();
		
		
		// Miel en MielImmitator zitten in DEZELFDE package
		// Via reference variable geen inheritance
		jaeger.de.miel.MielImmitator i = new jaeger.de.miel.MielImmitator();
		i.immitating();
		
		
		// Miel en MielClone zitten NIET in dezelfde package  <- cannot be accessed from outside package!!!
		//jaeger.de.kim.MielClone c2 = new jaeger.de.kim.MielClone();
		//c2.cloning();
	
	}
	
}