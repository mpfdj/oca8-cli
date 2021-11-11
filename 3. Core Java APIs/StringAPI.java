class StringAPI {
	
	/*
	String is immutable
	method chaining is toegestaan maar String blijft immutable!!!
	werkt alleen als de uitkomst aan een variabele wordt toegekend (assign)
	
	
	substring is de lastigste methode!!!
	.substring(int beginIndex)
	.substring(int beginIndex, int endIndex)
	
	lees START AT en END AT	(aantal characters = endsAt - startsAt)
	
	
	let op indexOf is ook lastig!
	
	
	length()
	charAt(3)
	indexOf("mals")
	substring(0, 1)
	toLowerCase()
	toUpperCase()
	startsWith()	// boolean
	endsWith()		// boolean
	contains()		// boolean
	==> replace("mals", "moux")
	trim()
	
	*/
	
	public static void main(String args[]) {
		
		// equals en ==
		String str1 = "abc";
		String str2 = "abc";
		System.out.println(str1 == str2);  // true using same literal on JVM String pool
		System.out.println(str1.equals(str2));  // true
		
		
		// Concatenatie
		int i = 1;
		System.out.println(i + 1 + "3" + "4");  // 234
		
		
		//animals
		//0123456
		
		String s = "animals";
		s.replace("mals", "moux").replace('a', 'A');  // <- uitkomst wordt niet aan een variabele toegekend en s blijft ongewijzigd!
		System.out.println(s);
		
		String s2 = s.replace("mals", "moux").replace('a', 'A');  // <- nu wel
		System.out.println(s2);
		
		
		System.out.println(s.indexOf('a'));  // 0  <- geeft altijd de EERSTE MATCH terug
		System.out.println(s.indexOf('a', 4));  // 4  <- je kan een fromIndex opgeven
		System.out.println(s.indexOf("mals"));  // 3  <- je kan ook een String opgeven
		System.out.println(s.indexOf("moux"));  // -1  <- niet gevonden
		
		
		System.out.println(s.substring(0));  // animals
		System.out.println(s.substring(0, 0));  // lege string
		System.out.println(s.substring(6, 7));  // s  <- let op lees END AT (niet include)
		//System.out.println(s.substring(7, 8));  // geeft een runtime exception StringIndexOutOfBoundsException String index out of range
		//System.out.println(s.substring(7, 6));  // gooit dezelfde exception 
		
		
		System.out.println("    a n i m a l s    ".trim());  // "a n i m a l s"  <- whitespace aan begin en einde zijn verwijdert
		
		
		// tot slot nog een voorbeeldje met methodChaining
		// let op resultaat wordt opgeslagen
		String result = "ANImals    ".trim().replace("mals", "moux").toLowerCase();
		System.out.println(result);  // animoux
		
		// let op String wordt geinitialiseerd met een lege String!
		String zinnetje = "";
		zinnetje += 1;
		zinnetje += true;
		System.out.println(zinnetje);
	}
	
	
}