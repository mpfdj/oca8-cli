interface HelloWorld {
	default void test() { System.out.println("HelloWorld"); }
	static void hello() { System.out.println("HelloWorld"); }
}

interface Hello extends HelloWorld {
	//default void test() { System.out.println("Hello"); }
	void test();
	static void hello() { System.out.println("Hello"); }
}

class Miel implements Hello {
	
	public void test() { System.out.println("Miel"); }
	public static void hello() { System.out.println("Miel"); }
	
	public static void main(String args[]) {
		Hello m = new Miel();
		m.test();
		m.hello();
	}
	
}