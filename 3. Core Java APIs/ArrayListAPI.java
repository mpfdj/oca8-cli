import java.util.ArrayList;
import java.util.List;
//import java.util.Collections;
import java.util.function.Predicate;

/*
add("aap")
add(1, "mies")
remove(new Integer(1))  // removes the FIRST MATCH
remove(1)
set(1, new Integer(1))
isEmpty()
size()
clear()
contains("mies")  		// roept de equals() method wordt voor alle elementen aan!!! bij de primitives worden dus de Wrapper classes gebruikt
						// bij een zelf gedefineerd object moet je dus de equals methode implementeren (override vanuit Object)
						
Wrapper classes  		// elke primitive heeft een Wapper class
Byte.parseByte("1")		// geeft een primtive terug en heeft een STRING als argument
Byte.valueOf("1")		// geeft een Wrapper class terug en heeft een STRING als argument
new Byte((byte) 1)		// geeft een Wrapper class terug en heeft een PRIMITIVE als argument dus let op DOWNCAST is verplicht

Autoboxing
boxing    <- van primitive naar Wrappper class
unboxing  <- van Wrapper class naar primitive

list.toArray()  	  // converteer een List naar een Array
java.util.Arrays.asList(array)  // converteer een Array naar een List, let op geen ArrayList maar een FIXED SIZE List ondersteund door het Array (backed)

java.util.Collections.sort(list)

ArrayList implementeerd toString() voor primitives of een Object moet toString implementeren (Array niet!!!)
ArrayList implementeerd equals() 2 ArrayList-en zijn gelijk als ze ook gelijk zijn wat volgorde betreft! (Array niet!!!)

*/


class ArrayListAPI {
	
	public static void main(String args[]) {
		
		// 3 constructors Java5 syntax zonder generics
		ArrayList list1 = new ArrayList();
		ArrayList list2 = new ArrayList(10);  // capaciteit is 10
		ArrayList list3 = new ArrayList(list1);
		
		// 2 constructors met generics
		ArrayList<String> list4 = new ArrayList<String>();
		ArrayList<String> list5 = new ArrayList<>();
		
		
		list4.add("aap");
		list4.add(0, "noot");
		//list4.add(10, "mies");  					// IndexOutOfBoundsException is a RUNTIMEEXCEPTION
		System.out.println(list4);  				// [noot, aap]
		
		list4.set(1, "mies");  
		System.out.println(list4);  				// [noot, mies]
		System.out.println(list4.contains("mies")); // true
		
		list4.add(0, "mies");
		System.out.println(list4);  				// [mies, noot, mies]
		
		list4.remove("mies");  						// verwijdert eerste occurrence
		System.out.println(list4);  				// [noot, mies]
		
		java.util.Collections.sort(list4);
		System.out.println(list4); 					// [mies, noot]
		
		
		// een tricky voorbeeldje
		List<Integer> getallen = new ArrayList<>();
		getallen.add(1);  // Autoboxing
		getallen.add(2);
		getallen.add(3);
		getallen.add(4);
		getallen.add(4);
		
		getallen.remove(1);						// INDEX 1 is verwijdert
		System.out.println(getallen); 			// [1, 3, 4, 4]
		getallen.remove(Integer.valueOf("1"));	// om het GETAL 1 te verwijderen moet je de Wrapper class gebruiken
		System.out.println(getallen); 			// [3, 4, 4]
		getallen.remove(new Integer(4));		// let op de EERSTE OCCURRENCE wordt verwijdert
		System.out.println(getallen); 			// [3, 4]
		
		getallen.add(0, null);					// null mag worden toegevoegd
		// int getal = getallen.get(0);			// NullPointerException !!!
	
	
		List<Integer> getallen2 = new ArrayList<>();
		getallen2.add(3);
		getallen2.add(4);
		System.out.println(getallen.equals(getallen2));  // true  <- WAARDES en VOLGORDE zijn gelijk, let op Array implementeerd equals niet!
		
		
		// Wrapper classes
		Integer i1 = new Integer(1);
		Integer i2 = Integer.valueOf("1");		// String als argument
		int i3 = Integer.parseInt("1");			// String als argument
		//int i4 = Integer.parseInt("1.0");  	// NumberFormatException is a RUNTIMEEXCEPTION 1.0 is een double ipv int!
		
		Byte b = new Byte((byte) 1);  			// primitive als argument let op downcast is verplicht
		
		
		// toString() en equals() worden niet geimplementeerd door Array!
		String zinnetjes1[] = { "aap", "noot", "mies" };
		String zinnetjes2[] = { "aap", "noot", "mies" };
		String zinnetjes3[] = zinnetjes1;
		System.out.println(zinnetjes1.toString());  		// [Ljava.lang.String;@2a139a55
		System.out.println(zinnetjes1.equals(zinnetjes2));	// false
		System.out.println(zinnetjes1.equals(zinnetjes3));	// true, let op ze wijzen nu naar hetzelfde object!
		
		
		// van Array naar List
		// This method acts as bridge between array-based and collection-based APIs
		String dieren2[] = { "geit", "varken", "kip" };
		List<String> lijstMetDieren = java.util.Arrays.asList(dieren2);
		//ArrayList<String> lijstMetDieren2 = Arrays.asList(dieren2);  // let op geen ArrayList maar een List met een FIXED SIZE!!!
		
		dieren2[0] = "poes";
		lijstMetDieren.set(1, "hond");
		System.out.println(lijstMetDieren);  // [poes, hond, kip]
		System.out.println(dieren2[1]);		 // hond
		// lijstMetDieren.remove(0);		 // UnsupportedOperationException  <- LET OP!!! FIXED SIZE wijzigen van bestaande element mag wel
		
		
		// van List naar Array
		List<String> dieren = new ArrayList<>();
		dieren.add("geit");
		dieren.add("varken");
		dieren.add("kip");
		
		Object[] objects = dieren.toArray();  				// geeft default een array met Objecten terug!
		// String[] arDieren = dieren.toArray();  			// incompatible types: Object[] cannot be converted to String[]
		String[] arDieren = dieren.toArray(new String[0]);	// geef een String array mee als argument!
		System.out.println(arDieren.length);				// 3
		
		// een andere manier om een List te initializeren! 
		// let op is van het type List geen ArrayList!
		// asList heeft oa met methode met een vargs 
		List<String> musicCollection = java.util.Arrays.asList("Jeff Mills", "DJ Rolando", "Da Hool");
		System.out.println(musicCollection);
		//musicCollection.add("Eric Prydz");  // java.lang.UnsupportedOperationException (fixed list backed by array)
		
		
		// removeIf heeft een predicaat / lambda als param
		List<String> djs = new ArrayList<>();
		djs.add("Jeff Mills");
		djs.add("DJ Rolando");
		djs.add("Da Hool");
		djs.add("DJ Scott Angry Anderson");
		djs.removeIf(dj -> dj.toLowerCase().startsWith("dj"));
		System.out.println(djs);
		
		
		// Een ArrayList met Objecten
		//List lijstje = new ArrayList();
		List lijstje = new ArrayList<String>();
		lijstje.add(true);
		lijstje.add(new Integer(1));
		lijstje.add(new Exception());
		System.out.println(lijstje);
		
		List<Integer> getallen3 = new ArrayList<>();
		getallen3.add(null);
		System.out.println(getallen3);
		
	}
	
}