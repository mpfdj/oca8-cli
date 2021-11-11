import miel.Miel;


class Bella extends Miel {
	//protected void test() { System.out.println("Bella"); }
	Miel m = new Miel();
	
	void test1() { test(); }
	void test2() { Bella b = new Bella(); b.test(); }
	
}

public class Kim extends Miel {
	
	public static void main(String args[]) {
		Bella b = new Bella();
		//b.test();
		b.test1();
		b.test2();
		
		//Kim k = new Kim();
		//k.test();
	}
	
}