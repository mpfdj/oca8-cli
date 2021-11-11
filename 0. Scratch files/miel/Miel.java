package miel;

public class Miel {
	
	protected String firstName = "Miel";
	String lastName = "De Jaeger";
	public String test = "Miel Test";
	
	static { System.out.println("Static Miel"); }
	{ System.out.println("Instance Miel"); }
	public Miel() { System.out.println("Constructor Miel"); }
	
	protected byte test() { return 1; }
	
	public void test2() {
		System.out.println(firstName);
	}
	
}