import java.time.*;
import java.time.format.*;

class Today {
	
	public static void main(String args[]) {
		
		LocalDate d = LocalDate.now();
		DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MMMM-yyyy");
		Period p = Period.of(100, 0, 0);
		
		
		// Default
		if (args.length == 0 || args[0].equals("US")) {
			System.out.println(d);
		} else if (args[0].equals("NL")) {
			System.out.println(d.format(f));
		} else if (args[0].equals("FWD")) {
			System.out.println(d.plus(p));
		} else if (args[0].equals("BWD")) {
			System.out.println(d.minus(p));
		} else {
			System.out.println("Invalid argument.");
		}
		
		
		
	}
	
}