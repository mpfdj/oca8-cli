interface Miel {
	public static final String name = "Miel";
	public abstract void test();
	public static void testStatic() { System.out.println("Static Miel"); }
	public default void testDefault() { System.out.println("Default Miel"); }
}

interface Kim {
	public static final String name = "Kim";
	public abstract void test();
	public static void testStatic() { System.out.println("Static Kim"); }
	public default void testDefault() { System.out.println("Default Kim"); }
}


public class Interfaces implements Miel, Kim {
	
		public void test() { System.out.println("Test"); }
		public void testStatic() { System.out.println("Static"); }
		public void testDefault() { System.out.println("Default"); }
		
	public static void main(String args[]) {
		System.out.println(Miel.name);
		System.out.println(Kim.name);
	
		Interfaces i = new Interfaces();
		i.test();
		i.testStatic();
		i.testDefault();
		Miel.testStatic();
		Kim.testStatic();
		
		A a = null;
		a.test();
	}

}

abstract class A implements Miel, Kim {
	public void testDefault() { System.out.println("Default"); }
}