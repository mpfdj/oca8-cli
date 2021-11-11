import java.time.*;
import java.time.format.*;

class DatesAndTimes {
	
	
	
	// Let op de packages!!!
	// Tijdzones worden NIET ondersteund vandaar LocalDate, Local...
	// Period ondersteund GEEN method chaining en GEEN TIJD (5 constructors)! (lang lopend)
	// Duration geeft een tijdsspanne weer (kort lopend)
	
	
	/*
	LocalDate.of(yyyy, MM, dd);
	LocalDate.now();
	
	LocalTime(hh, mm, ss, nnn);
	LocalTime.now();
	
	LocalDateTime(yyyy, MM, dd, hh, mm, ss, nnn);
	LocalDateTime(date, time);
	LocalDateTime.now();
	
	plusYears(1) / minusYears(1)
	...
	
	5 constructors voor Period (ofYears, ofMonths, ofWeeks, ofDays, of)  <- geen tijd daarvoor Duration gebruiken!
	Period.ofYears(1);
	Period.of(1, 0, 7);  <- jaarlijks elke week (yyyy, MM, dd) let op methode heet of()!!!
	date.plus(period);	 <- periode er bij op tellen (plus)
	date.minus(period);	 <- periode er af halen (minus)
	
	
	Formatter (java.time.format.*)
	Amerikaans format is default MM-dd-yyyy
	formatter.format(date)  <- format kan aangeroepen worden op de formatter
	date.format(formatter)	<- format kan aangeroepen worden op date
	
	3 manieren om een DateTimeFormatter te definieren
	DateTimeFormatter.ISO_LOCAL_DATE
	DateTimeFormatter.ISO_LOCAL_TIME
	DateTimeFormatter.ISO_LOCAL_DATE_TIME
	DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);	// ofLocalizedDateTime()
	DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
	DateTimeFormatter.ofPattern("hh:mm");						// ofPattern()
	
	Month: M = 1, MM = 01, MMM = Jan, MMMM = January
	
	
	Parse date / time String
	LocalDate date = LocalDate.parse("04-07-1980", formatter);	//
	LocalDate date = LocalDate.parse("04-07-1980")				// default formatter MM/dd/yyyy
	
	*/
	
	
	public static void main(String args[]) {
		
		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());  // 2016-05-29T19:55:04.798
		System.out.println("days since epoch: " + LocalDate.now().toEpochDay());
		//System.out.println("seconds since epoch: " + LocalDateTime.now().toEpochTime());
		
		
		//LocalDate date = new LocalDate();  // Deze constructor bestaat niet!
		LocalDate date = LocalDate.of(1980, Month.JULY, 4);
		LocalTime time = LocalTime.of(12, 0, 0, 0);
		LocalDateTime dateTime = LocalDateTime.of(date, time);
		
		
		// LocalDate dateFout = LocalDate.of(2016, Month.MAY, 32);  // RunTimeException Invalid value for DayOfMonth
		
		
		// Manipulatie
		// plusYears / minusYears
		// plusMonths / minusMonths
		// ...
		
		
		date.plusYears(1).minusMonths(1);
		System.out.println(date);  // 1980-07-04 Let op date is IMMUTABLE geeft nu originele waarde terug omdat de waarde niet is toegekend aan een variable (assigned)
		
		date = date.plusYears(1).minusMonths(1).plusDays(6);
		System.out.println(date);  // 1981-06-10
		
		// date.plusHours(1);  // Compiler error je mag plusHours() niet aanroepen op LocalDate etc.
		
		
		// Periode
		// Methodes kunnen niet gechained worden
		Period jaarlijks 	= Period.ofYears(1);
		Period maandelijks 	= Period.ofMonths(1);
		Period weekelijks 	= Period.ofWeeks(1);
		Period dagelijks 	= Period.ofDays(1);
		Period jaarlijksElkeWeek = Period.of(1, 0, 7);   // yyyy, MM, dd  <- Let op methode heet of(...)
		
		Period periode = Period.ofYears(1).ofMonths(1).ofDays(1);  // geeft een periode van 1 DAG terug
		
		LocalDate geboorteDatumKim = LocalDate.of(2009, Month.AUGUST, 23);
		System.out.println(geboorteDatumKim.plus(jaarlijks));  	// 2010-08-23  <- plus(period)
		System.out.println(geboorteDatumKim.minus(periode));  	// 2009-08-22  <- minus(period)
		
		// LocalTime.now().minus(period);  // Compiler error LocalTime ondersteund GEEN Period!
		
		
		// 3 manieren om een formatter te definieren
		// kan aangeroepen worden op de datum of op de formatter zelf
		// kan alleen een RunTime Exception gooien!
		LocalDateTime t = LocalDateTime.of(1999, 12, 31, 23, 55, 00);
		System.out.println(t.format(DateTimeFormatter.ISO_DATE));  									// 1999-12-31
		System.out.println(t.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)));  	// 31-dec-1999 23:55:00
		System.out.println(t.format(DateTimeFormatter.ofPattern("dd MMMM yyyy")));  				// 31 december 1999
		// System.out.println(LocalTime.now().format(DateTimeFormatter.ofPattern("yyyy")));  		// RUNTIMEEXCPETION Unsupported field
		// System.out.println(LocalTime.now().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));  // RUNTIMEEXCPETION Unsupported field
		
		
		// Parse een String naar een date ahdv een formatter of de default formatter
		DateTimeFormatter f = DateTimeFormatter.ofPattern("MM dd yyyy");
		LocalDate d = LocalDate.parse("12 31 1999", f);
		System.out.println(d);  // 1999-12-31 Let op bij het afdrukken wordt er geen formatter gebruikt
		
		LocalTime tijd = LocalTime.parse("11:55");
		System.out.println(tijd);  // gebruikt de default formatter
		
		LocalDate vandaag = LocalDate.now();
		DateTimeFormatter f1 = DateTimeFormatter.ISO_DATE;
		DateTimeFormatter f2 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
		DateTimeFormatter f3 = DateTimeFormatter.ofPattern("yyyy");
		System.out.println(vandaag.format(f1));
		// System.out.println(vandaag.format(f2));
		System.out.println(f3.format(vandaag));
	}
	
}