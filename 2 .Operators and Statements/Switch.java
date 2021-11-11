import java.time.DayOfWeek;

class Switch {
	
	public static void main(String args[]) {
		
				
		int day;
		
		// let op alle cases incl. de default case worden uitgevoerd!
		day=1;		// Monday
					// Holiday
					// Sunday
		
		//day=2;	// Holiday
					// Sunday
		
		switch (day) {  // case statement using int
			case 1:
				System.out.println("Monday");
			default:								// volgorde van de default case maakt niet uit! code gaat door tot eerste break statement!
				System.out.println("Holiday");
			case 7:
				System.out.println("Sunday");
			break;
		}
		
		
		/* 
		Supported data types (6):
		byte / Byte
		short / Short
		int / Integer
		char
		String
		enum -> use UNQUALIFIED NAME here!
		*/
		
		
		Integer time = new Integer(3);
		final int twee = 2;  // final variabelen mogen ook als waarde worden gebruikt.
		
		switch (time) {  // case statement using Integer
			case 12:
				System.out.println("Twaalf uur.");
				break;
			case 1:
				System.out.println("Een uur.");
				break;
			case twee:
				System.out.println("Twee uur.");
				break;
			default:
				System.out.println("Het is tussen twee en twaalf uur.");
				break;
		}
		
		
		switch (time) { }  // empty case statement compiles
		
		
		switch (time) {  // alleen een default case is toegestaan
			default: 
				System.out.println("Bedtijd");
		}
		
		
		switch (time) {  // alleen een enkele case is toegestaan
			case 3:
				System.out.println("Drie uur");
		}
		
		
		// case statement using Enumeration
		// must use UNQALIFIED NAME here!
		DayOfWeek today = DayOfWeek.SUNDAY;
		switch (today) {
			// case java.time.DayOfWeek.SUNDAY:  // compiler error
			case SUNDAY:
				System.out.println("ZONDAG");
				break;
		}
	}
}