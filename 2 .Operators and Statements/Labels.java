class Labels {
	
	public static void main(String args[]) {
		
		/*
		labels
		break
		continue
		*/
		
		// using continue and labels with a nested for loop
		OUTER: for (int a=0; a<5; a++) {
			System.out.print(a);
			INNER: for (char c='a'; c<='c'; c++){
				if (c=='b') continue INNER;  // skip 'b' here
				System.out.print(c);
			}
			System.out.println();
		}
		
		/*
		0ac
		1ac
		2ac
		3ac
		4ac
		*/
		
		
		// using break and labels with a nested for loop
		OUTER: for (int a=0; a<5; a++) {
			System.out.print(a);
			INNER: for (char c='a'; c<='c'; c++){
				if (c=='b') break OUTER;  // skip 'b' here
				System.out.print(c);
			}
			System.out.println();
		}
		
		// 0a
		
	}
	
}