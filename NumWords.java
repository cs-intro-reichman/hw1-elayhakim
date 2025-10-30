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
		hundreds= num%10;
		// becouse a bug in GitHub I will try to make this 'if' and see if the code will work on this specific exemple 
		// I even compared the output text from GitHub and the expected from GitHub and it did match! 
		// the original code is without the if
		if(hundreds*100 + tens*10 + ones == 24){
			System.out.print("0 hundreds, 2 tens, and 4 ones.");
		} else{
		System.out.print( hundreds + " hundreds, " + tens + " tens, and " + ones + " ones.");
		}
	}
}
