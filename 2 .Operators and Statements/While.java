class While {
	
	public static void main(String args[]) {
		
		// the do clause always runs at least once!!!
		// eventhough the condition is met right away!
		// counter needs to be defined outside the loop
		int i=0;
		do {
			System.out.println("Iteration: " + i);
			i++;
		} while (false);
		
		
		/*
		doesn't compile
		do {
			j++;
		} while (int j<5);
		*/
		
		
		// normal for loop
		int j=0;
		while(j<10) {
			System.out.println(j);
			j++;
		}
				
		
		// this is a really tricky example of a nested do while loop
		// pls note that the do clause is executed also when the condition of the inner while is not met! (see page 87)
		int x=20;
		while (x>0) {
			do {
				x -= 2;
			} while (x>5);
			x--;
			System.out.print(x + "\t");
		}
		
		// 3 	0
	}
	
}