import java.util.List;
import java.util.ArrayList;

// Java is call by value but passes References!
// Elke methode heeft zijn eigen stack (er wordt een lokale kopie van de method params gemaakt)

class CallByValue {
	
	int i = 1;
	
	void addByOne(int i) {
		i = i + i;				// gebruik this.i om de instance variable aan te passen
		System.out.println(i);
	}
	
	void changeString(String name) {
		name = "Kim";			// gebruik this.name om de instance variable aan te passen EN String is IMMUTABLE!!!
	}
	
	void changeArrayList(List<String> l) { 
		l.add("three"); 		// let op List is MUTTABLE en l wordt NIET ge-assigned
	}
	
	public static void main(String args[]) {
		
		CallByValue cbv = new CallByValue();
		
		
		cbv.addByOne(2);  // 4 return value is NIET ge-assigned.
		System.out.println(cbv.i);  // 1
		
		String s = "Miel";
		cbv.changeString(s);	   		// let op return value wordt NIET ge-assigned!
		System.out.println(s);  		// Miel
		
		
		List<String> l = new ArrayList<>();
		l.add("one");
		l.add("two");
		cbv.changeArrayList(l);
		System.out.println(l);			// [one, two, three]
		
		
	}
	
}