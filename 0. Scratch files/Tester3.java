import java.time.*;
import java.time.format.*;

class Tester3 {
	
	public static void main(String args[]) {
		
		Integer i = new Integer(1);
		//String s = (String) i;
		
		Object o = null;
		String s = (String) o;
		
		
		String t = null;
		Object p = t;
		
		LocalDate d = LocalDate.now();
		DateTimeFormatter f = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		System.out.println(d.format(f));
		
		DateTimeFormatter f2 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
		System.out.println(d.format(f2));
	}
	
}