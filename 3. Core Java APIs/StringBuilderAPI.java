class StringBuilderAPI {
	
	/*
	3 constructors
	
	charAt(3)
	indexOf("mals")
	length()
	append(true)  // heeft een heleboel overloaded implementaties
	insert(0, "abc")
	delete(3, 5)
	deleteCharAt(3)
	
	// onderstaande methodes geven een String terug ipv de StringBuffer
	substring(3, 7)  // leest 4 characters
	toString()
	
	*/
	
	public static void main(String args[]) {
		
		// animals
		// 0123456
		
		// 3 constructors
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder("animals");
		StringBuilder sb3 = new StringBuilder(5);  // Het getal is de capaciteit van de StringBuilder, er wordt GEEN exception gegooid wanneer je over de capaciteit heen gaat!
												   // SB heeft een capaciteit en lengte (length())
		
		
		System.out.println(sb3.length());  	// 0 ondanks dat de capaciteit 5 is
		sb3.append("HelloWorld");			// er wordt hier geen exception gegooid, ondanks dat de capaciteit 5 is
		System.out.println(sb3.length());	// 10
		
		
		// substring blijft lastig, maar werkt gelukkig hetzelfde als bij String
		// aantal character = startat - endat
		System.out.println(sb3.substring(0, 4));  // Hello, let op substring geeft een String terug, de StringBuilder blijft hier ongewijzigd!!!!!!!
		System.out.println(sb3.substring(0));	  // HelloWorld, eind index is optioneel, StringBuilder leest default door tot het einde
		System.out.println(sb3);				  // HelloWorld
		
		
		// equals werkt alleen bij substring(x, y) en toString()!!!
		System.out.println("HelloWorld".equals(sb3));  // false
		System.out.println("HelloWorld".equals(sb3.toString()));  // true, let op toString geeft een String terug

		
		String sub = sb2.substring(sb2.indexOf("a"), sb2.indexOf("mals"));  // LET OP OOK HIER BLIJFT STRINGBUILDER WEER ONGEWIJZIGD!
		int len = sb2.length();  // 7
		char c = sb2.charAt(6);  // s
		// char c2 = sb2.charAt(7);  // StringIndexOutOfBoundsException
		System.out.println(sub + len + c);  // ani7s
		
		
		// append(xxx) heeft veel overloaded implementaties
		// maakt niet uit welk data type je meegeeft
		sb1.append(1).append(2.0).append(true).append(" int, doubles, booleans maakt allemaal niet uit");
		System.out.println(sb1);
		
		
		// tot slot nog delete en deleteCharAt();
		// abcdefg
		// 0123456
		StringBuilder sb4 = new StringBuilder("abcdefg");
		System.out.println(sb4.delete(6, 7));  // abcdef  <- laatste character is verwijdert
		System.out.println(sb4.deleteCharAt(0));  // bcdef <- alles vanaf d is verwijdert
		
		
		// StringBuffer implementeerd geen equals! dus equals vergelijkt nu of de reference type naar hetzelfde object wijst!
		StringBuilder zinnetje1 = new StringBuilder("aap noot mies");
		StringBuilder zinnetje2 = zinnetje1;
		System.out.println(zinnetje1.equals(zinnetje2));  // true
	}
	
	
}