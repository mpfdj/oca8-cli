package jaeger.de.kim;
import jaeger.de.miel.Miel;

public class MielClone extends Miel {
	
	// Hier is een public wrapper om de default members heen gezet
	// De class members van Miel zijn hier NIET te benaderen omdat ze NIET in dezelfde package zitten!
	public void cloneMe() {
		// via inheritance
		//System.out.println("Selecting track: " + tune);
		//playTune();
		
		// via reference variable
		Miel m = new Miel();
		m.playTune();
	}
	
}