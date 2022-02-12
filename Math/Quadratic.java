import java.util.Scanner;

/**
 *
 * Demonstrates the use of the Math class to perform a calculation
 * based on user input.
 *
 * @author Java Foundations
 */
public class Quadratic
{
	/**
	 * Determines the roots of a quadratic equation.
	 */
	public static void main(String[] args)
	{
		double a, b, c;  // ax^2 + bx + c
		double discriminant, root1, root2;

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the coefficient of x squared: ");
		a = (int) scan.nextDouble();

		System.out.print("Enter the coefficient of x: ");
		b = (int) scan.nextDouble();

		System.out.print("Enter the constant: ");
		c = (int) scan.nextDouble();

		// 2, 16, and 3 results came out to be Root #1 = -0.19211344706804567 and Root #2 = -7.807886552931954 //

		// 2.5, 16.8, and 3.2 results came out to be Root #1 =  -0.19211344706804567, and Root #2 =  -7.807886552931954 //

		// Results came out to be the same because of how the numbers are similar to each other. I also think the reason why the results are the same is because of both codes are still a double instead of being an integer. //

		// I'm not sure what happened after I removed the cast and changed the declaration for a, b, and c. The results came out to be very complicated and I wasn't able to enter numbers anymore. //

		// Use the quadratic formula to compute the roots.
		// Assumes a positive discriminant. (otherwise we need complex numbers)

		discriminant = Math.pow(b, 2) - (4 * a * c);
		root1 = ((-1 * b) + Math.sqrt(discriminant)) / (2 * a);
		root2 = ((-1 * b) - Math.sqrt(discriminant)) / (2 * a);

		System.out.println("Root #1: " + root1);
		System.out.println("Root #2: " + root2);

		scan.close();

	}
}
