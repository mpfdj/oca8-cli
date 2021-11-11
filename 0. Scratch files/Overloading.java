class A {
	public void test(long l) { System.out.println("long"); }
	public void test(Integer i) { System.out.println("Integer"); }
	public void test(Object o) { System.out.println("Object"); }
}

public class Overloading {
	
	public static void main(String args[]) {
		A a = new A();
		Integer i = 1;
		a.test(i);
		a.test(new Integer(1));
		a.test(1);
	}

}