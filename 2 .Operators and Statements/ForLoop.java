class ForLoop {
	
	public static void main(String args[]) {
		
		/*
		basic for loop (fine grained)
		enhanced for loop (arrays and collections)
		*/
		
		
		// Compiles but is an infinite loop
		// for(;;) {
		//	 System.out.println("Infinit loop!");
		// }
		
		int i=5;  // declare variable outside for loop
		for (i=0; i<10;) {
			System.out.println(i);
			i++;  // increment here
		}
		
		// defining 2 variables here
		for (int x=0, y=0; x<10;) {
			System.out.println("x is: " + x + " y is: " + y);
			x++;
			y++;
		}
		
		// for each can iterate over arrays and collections (or other collections implementing java.lang.Iterable)
		int numbers[] = { 1, 2, 3, 4, 5 };
		for (int n : numbers) {
			System.out.println(n);
		}
		
		// in some cases it's better to use a basic for loop instead of a for each loop
		
		// combining basic for loop with a for each loop
		int magicnumbers[][] = { {1,2,3}, {4,5,6}, {7,8,9} };
		for (int arr[]: magicnumbers) {
			for (int j=0; j<arr.length; j++) {
				System.out.print(arr[j]);
			}
			System.out.println();
		}
		
		
		// nog een voorbeeldje met boxing en unboxing
		java.util.List<Integer> getallen = new java.util.ArrayList<>();
		getallen.add(100);  // <- box int naar Integer
		getallen.add(200);
		getallen.add(300);
		for (int getal : getallen) {  // <- unbox Integer naar int
			System.out.println(getal);
		}
		

		// werkt ook met Arrays!
		Integer groteGetallen[] = new Integer[3];
		groteGetallen[0] = 1_000_000;
		groteGetallen[1] = 2_000_000;
		groteGetallen[2] = 3_000_000;
		for (int getal : groteGetallen) {  // <- unbox Integer naar int
			System.out.println(getal);
		}
	}
	
}