import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * Demonstrates the formatting of decimal values using the DecimalFormat class.
 *
 * @author Java Foundations, amit
 */
public class CircleStatsDecimalFormat
{
	/**
	 * Calculates the area and circumference of a circle given its
	 * radius.
	 */
	public static void main(String[] args)
	{
		int radius;
		double area, circumference;

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the circle's radius: ");
		radius = scan.nextInt();

		area = Math.PI * Math.pow(radius, 2);
		circumference = 2 * Math.PI * radius;

		// Round the output to three decimal places
		DecimalFormat fmt = new DecimalFormat("$00000.000000");

		// I changed it to the result above and it has three more zeroes in front of 12.566371. //

		// I changed this code to a dollar sign and the code came out to have a dollar sign. I guess with this code it just changes the sign of the number or sign of the result. // 
		// The result earlier was just a regular number, now it changed to a dollar sign. //

		System.out.println("The circle's area: " + fmt.format(area));
		System.out.println("The circle's circumference: " + fmt.format(circumference));

		scan.close();

		System.out.printf("The circle's area using printf(): %.4f\n", area);
		System.out.printf("The circle's circumference using printf(): %10.3f\n", circumference);
		

		// I put 2 pi as the circle's radius and the circle's area is 12.566. //
		// This came out to be the result because of the math equation that has been set on this code or java. //

	



	}
}
