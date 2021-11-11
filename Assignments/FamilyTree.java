class Emiel {
	Emiel() { System.out.println("1947 - Emiel"); }
}

class Miel extends Emiel {
	Miel() { System.out.println("1980 - Miel"); }
}

class Kim extends Miel {
	Kim() { System.out.println("2009 - Kim"); }
}

class Isabella extends Miel {
	Isabella() { System.out.println("2014 - Isabella"); }
}

class FamilyTree {
	
	public static void main(String args[]) {
		new Isabella();
	}
}