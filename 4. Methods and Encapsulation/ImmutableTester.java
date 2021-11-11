/*
encapsulation refers to preventing callers from changing instance variables at all

maak variable private en final
geen setters
initializatie via constructor
maak een defensive copy bij de constructor en getter
*/
class NotImmutable {
	private StringBuilder builder;
	NotImmutable(StringBuilder builder) { this.builder = builder; }
	StringBuilder getBuilder() { return builder; }
}

class Immutable {
	private StringBuilder builder;
	Immutable(StringBuilder builder) { this.builder = new StringBuilder(builder); }  // defensive copy
	StringBuilder getBuilder() { return new StringBuilder(builder); }  // defensive copy
}



class ImmutableTester {
	
	public static void main(String args[]) {
		
		StringBuilder sb1 = new StringBuilder("aaa");
		NotImmutable notImmutable = new NotImmutable(sb1);
		StringBuilder gotBuilder = notImmutable.getBuilder();
		gotBuilder.append("bbb");
		System.out.println(notImmutable.getBuilder());
		
		StringBuilder sb2 = new StringBuilder("aaa");
		Immutable immutable = new Immutable(sb2);
		StringBuilder gotBuilder2 = immutable.getBuilder();
		gotBuilder2.append("bbb");
		System.out.println(immutable.getBuilder());
		
	}
}