/**
 * Demonstrates the use of enumerated types.
 *
 * @author Java Foundations
 */
public class IceCream
{
	public enum Flavor
	{
		VANILLA,
		CHOCOLATE,
		STRAWBERRY,
		FUDGE_RIPPLE,
		COFFEE,
		ROCKY_ROAD,
		MINT_CHOCOLATE_CHIP,
		COOKIE_DOUGH,
		CHOCOLATE_CHIP

	}

	/**
	 * Creates and uses variables of the Flavor type.
	 */
	public static void main(String[] args) {

		Flavor cone1, cone2, cone3;

		cone1 = Flavor.CHOCOLATE_CHIP;
		cone2 = Flavor.VANILLA;

		System.out.println("cone1 value: " + cone1);
		System.out.println("cone1 ordinal: " + cone1.ordinal());
		System.out.println("cone1 name: " + cone1.name());

		System.out.println(); 
		System.out.println("cone2 value: " + cone2); 
		System.out.println("cone2 ordinal: " + cone2.ordinal()); 
		System.out.println("cone2 name: " + cone2.name()); 

		cone3 = cone1; 

		System.out.println(); 
		System.out.println("cone3 value: " + cone3); 
		System.out.println("cone3 ordinal: " + cone3.ordinal()); 
		System.out.println("cone3 name: " + cone3.name()); 
	}
{

boolean result = Flavor.CHOCOLATE_CHIP.ordinal() > Flavor.VANILLA.ordinal();
System.out.printf("\n\n%s is greater than %s: %b\n",Flavor.CHOCOLATE_CHIP, Flavor.CHOCOLATE, result); 

System.out.printf("%n%n%s is greater than %s: %b%n",Flavor.CHOCOLATE_CHIP, Flavor.CHOCOLATE, result); 

// Nothing chnaged . If you use both codes, the same thing happens. Both results are the same.//

// The first results came out to be chocolate chip and then vanilla and then chocolate chip again. Since my all time favorite is chocolate chip, it came out that chocolate would be the result of all these codes. //

}

}