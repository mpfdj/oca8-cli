import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class LuckyNumber {
	
	private final static List<Integer> numbers = new ArrayList<>();
	
	static {
		numbers.add(4);
		numbers.add(9);
		numbers.add(5);
		numbers.add(1);
		numbers.add(8);
	}
	
	public static void main(String args[]) {

		if(args.length != 1) {
			System.out.println("Pick your lucky number choose a number between 1 and 10.");
			System.exit(1);
		}
	
		int luckyNumber = Integer.parseInt(args[0]);
		
		Collections.sort(numbers);
		int result = Collections.binarySearch(numbers, luckyNumber);
		
		if (result >= 0)
			System.out.println("You've found a lucky number!");
		else
			System.out.println("No luck try again.");
		
	}
	
}