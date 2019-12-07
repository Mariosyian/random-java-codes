package mario.random.find;
/**
 * Purpose of the program is to find when the fathers age will be
 * twice the sons age by incrementing both the ages and then
 * dividing by two and comparing the dads age to the sons age. 
 * 
 * Program accepts EXACTLY two arguments.
 * The first argument is the sons current age and
 * the second argument is the dads current age.
 */
public class FindSonAge
{
	public static void main(String[] args) {
		//Ensure two arguments have been supplied
		if (args.length != 2) {	
			System.out.println("Need EXACTLY two arguments.");
			System.exit(-1);
		}

		int sonAge = 0;
		int dadAge = 0;

		//Convert string arguments to Integers
		try {
			sonAge = Integer.parseInt(args[0]);
			dadAge = Integer.parseInt(args[1]);
		} catch (Exception e) {
			System.err.println("Error: " + e.getMessage());
			System.exit(-1);
		}

		//Ensure both arguments are positive numbers and
		//sons age is not equal or greater than the fathers.
		if (sonAge <= 0 || dadAge <= 0) {	
			System.out.println("Age can NOT be less or equal to zero.");
			System.exit(-1);
		} else if (sonAge >= dadAge) {
			System.out.println("Sons age can NOT be greater or equal to dads age.");
			System.exit(-1);
		}

		int iterations = 0;

		/**
		 * Infinite loop to increment all three numbers and
		 * compare dads age with twice the sons age.
		 */
		while (true) {
			sonAge ++;
			dadAge ++;
			iterations ++;
			if (dadAge == 2 * sonAge) {
				System.out.println("Son age: " + sonAge);
				System.out.println("Dad age: " + dadAge);
				System.out.println("Years Passed: " + iterations);
				System.exit(0);
			}
		}
	}
}
