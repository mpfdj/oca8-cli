class Super {}
class Sub extends Super {}
class Cast {
	
	public static void main(String args[]){
		Super s = new Super();
		Sub sub = new Sub();
		s = (Super)sub;
	}
	
}