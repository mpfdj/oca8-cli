/*
				java.lang.Object
						|				
				java.lang.Throwable
				  |				|
     java.lang.Exception	java.lang.Error
		   |
java.lang.RuntimeException


RuntimeException DON'T need to be handled or declared -> RuntimeException CAN be handled
Error DON'T need to be handled or declared-> best practise DON'T handle Errors

Volgorde van catch bloks is van belang!


RuntimeExceptions (CAN be handled):
ArithmeticException
ArrayIndexOutOfBoundsException
ClassCastException
IllegalArgumentException -> thrown by the programmer
NullPointerException
NumberFormatException

Exception (MUST be handled):
FileNotFoundException
IOException

Error (SHOULD NOT be handled):
ExceptionInInitializerError
StackOverflowError
NoClassDefFoundError


*/


class Exceptions {
	
	public static void main(String args[]) throws Exception {
		
		test1();
		// catch
		// finally
		// java.lang.Error: Dit is de Error uit het catch blok.
		
		// test2();
		// finally
		// java.lang.RuntimeException: Dit is de RuntimeException uit test2.
		
		// test3();
		
		
		/*
		try {
			throw new RuntimeException("Crash and burn");
		} finally {
			System.out.println("Finally");	// let op finally handelt GEEN exception af!
		}
		System.out.println("Continue");  	//  unreachable statement
		*/
	}
	

	private static void test1() {  // blz 313
		try {
			throw new RuntimeException();
		} 
		catch (RuntimeException e) { 
			System.out.println("catch"); 
			//throw new RuntimeException("Dit is de RuntimeException uit test1."); 
			throw new Error("Dit is de Error uit het catch blok.");  // let op deze Error wordt NIET afgehandeld!!!
			//System.out.println("Print me!");  // unreachable code!
		}
		finally { 
			System.out.println("finally"); 
			//throw new RuntimeException("Deze RuntimeException VERVANGT de voorgaande exception/error!!");
		}
	}
	
	
	private static void test2() {
		try {
			throw new RuntimeException("Dit is de RuntimeException uit test2.");  // let op deze RuntimeException wordt NIET afgehandeld!!!
		} finally {
			System.out.println("finally");
		}
	}
	
	
	private static void test3() {
		try {
			seeAnimal();
		}
		//catch(ExhibitClosed e) {}  //  verkeerde volgorde moet NA ExhibitClosedForLunch
		catch(ExhibitClosedForLunch e) {}  // let op volgorde is van belang!  exception ExhibitClosedForLunch has already been caught (unreachable code)
		catch(ExhibitClosed e) {}
		catch(AnimalsOutForWalk e) {}
	}
	
	private static void seeAnimal() { throw new ExhibitClosedForLunch(); }
	
	
	private static void test4() throws Exception { 
		return;   // let op het is NIET verplicht om exception te gooien ondanks dat deze gedeclareerd is!
	};
	
}


class AnimalsOutForWalk extends RuntimeException {}
class ExhibitClosed extends RuntimeException {}
class ExhibitClosedForLunch extends ExhibitClosed {}

