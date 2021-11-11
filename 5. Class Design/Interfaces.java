/*
constantes 		(public STATIC FINAL)
default methods (public DEFAULT) let op hier wordt het keyword default gebruikt!!! GEEN static, final of abstract
static methods 	(public STATIC) let op een static interface methode wordt NIET overgeerfd!!! je kan hem alleen op de interface aanroepen niet op de instance van de concrete class
methods 		(public abstract)

een class kan meerdere interfaces implementeren (implements)
een interface kan overerven van meerdere interfaces (extends)

een interface en zijn methodes kunnen NIET final zijn

een interface zelf heeft default of public

constantes moeten geinitialiseerd zijn

default methods:
override
redeclare
multiple inheritance issue -> override default methode in the first concrete / abstract class

*/

interface Leesplankje {
	
	String eersteWoordje = "aap";  	// public static final
	//String tweedeWoordje;			// constante moet geinitialiseerd zijn ivm final!
	
	default void leesEersteZinnetjeVoor() { System.out.println("aap noot mies"); }
	default void leesTweedeZinnetjeVoor() { System.out.println("wim zus jet"); }
	
	static void leesDerdeZinnetjeVoor() { System.out.println("teun vuur gijs"); }
}


interface MielsLeesplankje extends Leesplankje {
	default void leesEersteZinnetjeVoor() { System.out.println("aaa bbb ccc"); }  	// OVERRIDE default method
	void leesTweedeZinnetjeVoor();													// REDECLARE default method, public abstract
	
	static void leesDerdeZinnetjeVoor() { System.out.println("ggg hhh iii"); }
}


class Interfaces implements MielsLeesplankje {
	
	//void leesTweedeZinnetjeVoor() { System.out.println("ddd eee fff"); }  // LET OP attempting to assign weaker access privileges; was public
	public void leesTweedeZinnetjeVoor() { System.out.println("ddd eee fff"); }
	
	public static void main(String args[]) {
		
		System.out.println(Leesplankje.eersteWoordje);  // aap
		
		Interfaces i = new Interfaces();
		System.out.println(i.eersteWoordje);  // aap
		i.leesEersteZinnetjeVoor();  // aaa bbb ccc
		i.leesTweedeZinnetjeVoor();	 // ddd eee fff
		
		
		// let op static interface methodes worden NIET overgeerfd, methode kan alleen op de Interface worden aangeroepen
		//i.leesDerdeZinnetjeVoor();  				// compiler error cannot find symbol
		Leesplankje.leesDerdeZinnetjeVoor();		// teun vuur gijs
		MielsLeesplankje.leesDerdeZinnetjeVoor();	// ggg hhh iii
	}
	
}