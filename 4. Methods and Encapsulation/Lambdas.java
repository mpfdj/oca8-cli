/*
ArrayList heeft een filter methode welke een Predicate als invoer param heeft  <- removeIf(Predicate<? super E> filter)
java.util.function.Predicate 

een predicaat is een Object je kan een predicaat aan een REFERENCE VARIABLE assignen
een functie is idempotent
f(x) -> x^2

public interface Predicate<T>
boolean test(T t)

v -> true
(Vinyl v) -> true
v -> { return true; }
v -> { int i=0; return true; }  // je kan LOKALE variablen defineeren

*/

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Vinyl {
	private String name;
	private String label;
	private int released;
	private String style;
	
	Vinyl(String name, String label, int released, String style) {
		this.name = name;
		this.label = label;
		this.released = released;
		this.style = style;
	}
	
	String getLabel() { return label; }
	int getReleased() { return released; }
	String getStyle() { return style; }
	public String toString() { return name; }
}

interface Filter {
	boolean test(Vinyl v);
	// boolean dummy();  // compiler error: Filter is not a functional interface <- een functionele interface heeft 1 method!
}

class Lambdas {
	
	public static void main(String args[]) {
		List<Vinyl> records = new ArrayList<>();
		records.add(new Vinyl("Eric Prydz vs. Floyd ‎– Proper Education", "Vendetta Records", 2007, "Progressive House, House, Electro"));
		records.add(new Vinyl("Jeff Mills ‎– Kat Moda EP", "Purpose Maker", 1997, "Tribal, Techno"));
		records.add(new Vinyl("Sasha ‎– Xpander EP", "Deconstruction", 1999, "Progressive House, Progressive Trance"));
		
		filter(records, v -> v.getReleased() > 2000);  // alle platen die na 2000 zijn gereleased
		
		System.out.println();
		filter(records, v -> v.getStyle().toLowerCase().contains("progressive"));  // alle platen met als stijl progressive

		System.out.println();
		filterUsingPredicate(records, v -> v.getReleased() <= 2000);  // alle platen die voor 2000 zijn gereleased
		
		System.out.println();
		Predicate<Vinyl> p = v -> v.getStyle().toLowerCase().contains("progressive");  // een predicaat is een Object je kan een predicaat aan een REFERENCE VARIABLE assignen
		records.removeIf(p);
		//records.removeIf(v -> v.getStyle().toLowerCase().contains("progressive"));
		System.out.println(records);
		
		Predicate<Vinyl> p2 = (Vinyl v) -> true;
	}
	

	// gebruikt de zelf gedefinieerde functionele interface
	static void filter(List<Vinyl> records, Filter filter) {
		for(Vinyl v: records) {
			if (filter.test(v)) System.out.println(v);
		}
	}
	
	
	// gebruikt de functionele interface Predicate
	static void filterUsingPredicate(List<Vinyl> records, Predicate<Vinyl> p) {
		for(Vinyl v: records) {
			if (p.test(v)) System.out.println(v);
		}
	}
	
}