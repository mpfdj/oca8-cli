import java.time.LocalDate;

class Miel {
	public void test() {}
}

interface Test {
	public static final String TEST = "Test";
}


class Tester2 implements Test {
	
	public static void test(String s){}
	
	public static void bla(long l) {}
	
	public static void test() {}
	//public void test(){}
	int i;
	
	public static void main(String args[]) {
		
		//int j;
		//System.out.println(j);  // variable j might not have been initialized
		
		int k = 1;
		k += (k =4) * (k+2);
		System.out.println(k);
		
		
		int i = 4;
		int ia[][][] = new int[i][i=3][i];
		System.out.println(ia.length);
		
		String String = "String";
		Number Number = 1;
		
		
		String s = null;
		s += true;
		System.out.println(s);  // nulltrue
		
		s = null;
		s += 1;
		System.out.println(s);  // null1
		
		// s = 1;  // int cannot be converted to String
		s = 1 + 1 + "a";
		System.out.println(s);  //2a
		
		
		//String private = "miel";
		
		int l = 0;
		System.out.println(++l + (l=1));  // 1 + 1 = 2
		
		l = 0;
		System.out.println((l=1) + ++l);  // 1 + 2 = 3
		
		
		Integer getal = new Integer(1);
		// String s = (String) getal;  // incompatible types: Integer cannot be converted to String
		System.out.println(1 == getal);
		System.out.println(getal.equals(1));
		
		Object o = new Object();
		//String s2 = (String) o;  // java.lang.ClassCastException
		
		LocalDate d = LocalDate.of(2015,3,1);
		System.out.println(d);
		
		System.out.println(TEST);
		
		StringBuilder sb1 = new StringBuilder("a");
		StringBuilder sb2 = new StringBuilder("a");
		System.out.println(sb1.equals(sb2));
		
		bla(new Integer(1));
	}
	
}