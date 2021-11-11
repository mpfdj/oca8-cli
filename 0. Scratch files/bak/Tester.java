import java.time.*;

class Tester {

	public static void test(int i) {System.out.println("int"); }
	public static void test(int... i) {System.out.println("vargs"); }
	
	public static void main(String args[]) {
		
		test();
		
		int i = 1;
		System.out.println(++i + i);
		
		
		
		String s = "1";
		StringBuilder sb = new StringBuilder("1");
		Integer j = new Integer(1);
		double d = 1.1;
		//System.out.println(s == sb);
		System.out.println(j == d);
		
		
		//LocalDate date = LocalDate.of(2016, Month.JUNE, 32);
		//System.out.println(date);
		
		String zinnetje = "";
		//zinnetje = 1 + 1;
		System.out.println(zinnetje);
		
		byte b = 1;
		//byte b2 = 999999999999999999999999999999999999;
		
		String t = null;
		//t = t.concat("a");
		System.out.println();
		
		
		
		
		Integer getal1 = new Integer(1);
		Long getal2 = new Long(1);
		System.out.println(getal1 == 1);
		System.out.println(getal1.equals(getal2));
	}
	

	
}