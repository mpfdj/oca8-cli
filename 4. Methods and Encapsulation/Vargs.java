class Vargs {
	
	static void tester1(int i, int... numbers) { 
		System.out.println(i);
		System.out.println(numbers.length);
	}
	
	public static void main(String args[]) {
		tester1(1, 2, 3, 4);  // i = 1  en  numbers.length = 3  LET OP deze manier van parameters meegeven geldt alleen voor varargs
		tester1(1, new int[] {2, 3, 4});  // passing in an array
	}
	
	
}