package jaeger.de.miel;

public class MielClone extends Miel {
	
	// Hier is een public wrapper om de default members heen gezet
	// De class members van Miel zijn hier WEL te benaderen omdat ze in dezelfde package zitten!
	public void cloning() {
		
		// via inheritance
		System.out.println("Selecting track: " + tune);
		playTune();
		
		// via reference variable
		Miel m = new Miel();
		m.playTune();
	}
	
}