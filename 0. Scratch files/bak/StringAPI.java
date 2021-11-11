class StringAPI {
	
	public static void main(String args[]) {
		char c[] = {'a', 'b', 'c'};
		String s = "";
		
		s += c[0];
		
		System.out.println(s);
		
		s = "abc";
		//System.out.println(s == c);  // incomparable types: String and char[]
		System.out.println(s.equals(c));
		//System.out.println("abc" == c);  // incomparable types: String and char[]
		
		String s2 = null;
		s2 += "a";
		System.out.println(s2);
	}
	
	
}