class Initialization2 {
	
	static { System.out.println("static initializer"); }
	{ System.out.println("instance initializer"); }
	Initialization2() { System.out.println("constructor"); }
	
	public static void main(String args[]) { 
		System.out.println("main");
		// static initializer
		// main
	}
	
}