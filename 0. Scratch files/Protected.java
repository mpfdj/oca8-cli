
class Miel {
	protected void miel() { System.out.println("Miel"); }
}

class Protected extends Miel {
	public static void main(String args[]) {
		Protected p = new Protected();
		p.miel();
	}
}