class BMI {
	
	public static void main(String args[]) {
		
		if (args.length != 2) {
			System.out.println("To calculate your BMI fill in your weigth (Kilograms) and length (Meters).");
			System.exit(1);
		}
		
		double kg = Double.parseDouble(args[0]);
		double m = Double.parseDouble(args[1]);
		double bmi = kg / (m * m);
		
		System.out.printf("Your BMI is: %.2f\n", bmi);
		
	}
	
}