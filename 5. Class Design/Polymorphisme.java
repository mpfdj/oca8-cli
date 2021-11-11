/*
blz 280 - 283

Reference type versus Object type

Reference type bestaat in de stack
Object bestaat op de heap (memory)

Het reference type bepaald tot welke methodes / properties de programmeur toegang heeft

Polymorphisme is de eigenschap dat EEN object op meerdere manier benadert kan worden!
Het object zelf verandert NIET!!!

1. via een reference type dat gelijk is aan het object type
2. via een reference type dat gelijk is aan een interface
3. via een reference type dat gelijk is aan een superclass

voor een upcast is s GEEN type cast nodig
voor een downcast is WEL een type cast nodig
reference types ZONDER gemeenschappelijke hierachy geeft een compiler error
java.lang.ClassCastException als naar een Object wordt gecast dat NIET bestaat

check if in dezelfde hierachy (compiler error)
check if upcast or downcast (type cast or java.lang.ClassCastException)


*/


class Primate {
	boolean hasHair() { return true; }
}

interface HasTail {
	boolean isTailStriped();  // public abstract
}

class Lemur extends Primate implements HasTail {  // Maki
	public int age = 10;
	public boolean isTailStriped() { return false; }  // attempting to assign weaker access privileges; was public
}

class Polymorphisme {
	
	public static void main(String args[]) {
		
		//---------------------
		// Upcast
		//---------------------
		Lemur l = new Lemur();
		System.out.println(l.hasHair());
		
		HasTail t = l;
		System.out.println(t.isTailStriped());
		
		Primate p = l;
		System.out.println(p.hasHair());
		
		Object o = l;
		System.out.println(o.getClass());  // class Lemur
		
		//---------------------
		// Visibility
		//---------------------
		//System.out.println(p.age);  // cannot find symbol
		//System.out.println(t.age);  // cannot find symbol
		System.out.println(l.age);
		
		
		//---------------------
		// Downcast
		//---------------------
		//Lemur l2 = o;			// incompatible types bij een downcast is een type cast verplicht
		Lemur l2 = (Lemur) o;
		
		
		//---------------------
		// java.lang.ClassCastException  -> RuntimeException
		//---------------------
		Primate p2 = new Primate();
		Lemur l3 = (Lemur) p2;  // let op de reference types bevinden zich in DEZELFDE HIERARCHY dus de code compileerd maar gooit een RuntimeException, het Lemur object bestaat immers niet
		
	}
}