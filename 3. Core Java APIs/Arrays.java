class Arrays {
	
	/*
	
	primitives
	Objects
	sorting (java.util.Arrays.sort(numbers)) voor alphanumeriek geldt: cijfers, Uppercase, lowercase
	searching (java.util.Arrays.binarySearch(numbers, 100)); wanneer niet gevonden dan (-1 * verwachtte positie) - 1
	varargs
	anonymous array
	symetrisch multidimensional array
	asymetrisch multidimensional array
	java.lang.ArrayStoreException
	
	*/
	
	
	public static void main(String args[]) {
		
		
		// 3 verschillende declaraties / initializaties voor het object type
		int[] numbers1 = new int[3];  // default waarde voor int is 0
		int[] numbers2 = new int[] { 100, 200, 300 };  // declaratie met default waardes
		int[] numbers3 = { 100, 200, 300 };  // ookwel anonymous array genoemd (heeft geen type en grootte)
		
		
		// hieronder de 4 variaties van de reference type
		int[] ar1;
		int       [] ar2;  // met spaties
		int ar3[];
		int ar4 [];	 // met spaties
		
		
		// nu met meerdere declaraties
		int[] ids1, types1;		// twee arrays
		int ids2[], types2;		// een array en een int
		int[] id3[], types3;	// een multidimensional array en een normaal array
		
		
		// declaratie en initializatie van een anonymous multidimensional array
		int[][] numbers = { {1,2,3}, {4,5,6}, {7,8,9} };
		
		
		// declaratie van een assymetrisch array
		int[][] getallen1 = { {1,2}, {3}, {4,5,6,7,8,9} };

		int[][] getallen2 = new int[3][];
		getallen2[0] = new int[2];
		getallen2[1] = new int[1];
		getallen2[2] = new int[6];
	
	
		// normaal String array
		String woordjes[] = new String[3];
		woordjes[0] = "aap";
		woordjes[1] = "noot";
		woordjes[2] = "mies";
	
	
		// Arrays implementeerd geen equals! dus equals vergelijkt nu of de reference type naar hetzelfde object wijst!
		String bugs1[] = { "mug", "mier", "spin" };
		String bugs2[] = bugs1;
		String bugs3[] = { "mug", "mier", "spin" };
		System.out.println(bugs1.equals(bugs2));  // true, wijzen naar hetzelfde object
		System.out.println(bugs1.equals(bugs3));  // false
		
		/*
		// normal for loop
		String autos[] = new String[10];
		for(int i=0; i<autos.length; i++){
			System.out.println(i);
		}
		*/
		
		// het sorteren van een array met primitives
		// let op Objecten moeten de interface Comparable implementeren of kan adhv een Comparator
		int getalletjes1[] = { 9, 3, 6, 12 };
		java.util.Arrays.sort(getalletjes1);
		for (int i : getalletjes1)
			System.out.print(i + "\t");  // 3, 6, 9, 12
		System.out.println();
		
		
		String getalletjes2[] = { "100", "10", "90" };
		java.util.Arrays.sort(getalletjes2);
		for (String s : getalletjes2)
			System.out.print(s + "\t");  // 10, 100, 90  <- let op nu worden er String gesorteerd, sorteer volgorde voor alphanumeriek is: cijfers, Uppercase, lowercase
		System.out.println();
		
		
		// zoeken in een array
		System.out.println(java.util.Arrays.binarySearch(getalletjes1, 1));  // -1
		System.out.println(java.util.Arrays.binarySearch(getalletjes1, 3));  // 0  <- gevonden op de eerste positie
		System.out.println(java.util.Arrays.binarySearch(getalletjes1, 4));  // -2  <- (-1 * verwachtte positie) - 1 
		System.out.println(java.util.Arrays.binarySearch(getalletjes1, 100));  // -5  <- (-1 * 4) - 1
		
		
		// compiled maar gooit een RunTimeException!!!
		// reference type vs object type
		// blz 123
		String strings[] = { "abc" };
		Object objects[] = strings;
		objects[0] = new StringBuilder("def");  // <- RunTimeException (java.lang.ArrayStoreException) het reference type is van het type Object, maar het object type is van het type String!!!
	};
	
	
	
	
}