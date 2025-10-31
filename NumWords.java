// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
		int num = Integer.parseInt(args[0]);
		int hundreds = 0;
		int tens = 0;
		int ones = 0;
		ones= num%10;
		num= num/10;
		tens= num%10;
		num= num/10;
		hundreds= num;
		System.out.print( hundreds + " hundreds, " + tens + " tens, and " + ones + " ones.");

	}
}
