public class Tester {
	
	public static void main(String args[]) {
		
		jaeger.de.clone.MielClone c = new jaeger.de.clone.MielClone();
		c.playTune();  					// overriden in MielClone
		// System.out.println(c.tune);  // has protected access in Miel!!!
		c.cloning();
		//c.test();						// has protected access in Miel!!!
		c.mixIt();  					// public
		
		jaeger.de.miel.Miel m = new jaeger.de.clone.MielClone();
		// m.playTune();  			   	// has protected access in Miel!!!
		// System.out.println(m.tune); 	// has protected access in Miel!!!
		m.mixIt();
		
		jaeger.de.miel.Miel miel = new jaeger.de.miel.Miel();
		//miel.playTune();				// has protected access in Miel!!!
		//System.out.println(miel.tune); 	// has protected access in Miel!!!
		
	}
	
}