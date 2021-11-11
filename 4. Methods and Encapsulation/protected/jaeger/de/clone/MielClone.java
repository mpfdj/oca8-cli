package jaeger.de.clone;
import jaeger.de.miel.Miel;

public class MielClone extends Miel {
	
	public void playTune(){
		System.out.println("Playing: Eric Prydz - Proper Education");
	}
	
	//public void mixIt() {
	//	System.out.println("Mixing The bells with Night of the jaguar");
	//}
	
	public void cloning() {
		// via inheritance
		System.out.println("Selecting track: " + tune);
		//playTune();
		
		// via reference variable ook NIET toegestaan
		Miel m = new Miel();
		// m.playTune();	// has protected access
		// m.test();		// has protected access
	}
	
}