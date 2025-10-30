// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int currrentValue = Integer.parseInt(args[0]);
		double rate = Double.parseDouble(args[1]);
		int years = Integer.parseInt(args[2]);
		rate = rate/100;
		double futureValue = currrentValue;
		futureValue = futureValue * (Math.pow(1 + rate, years));
		rate = rate*100;
		System.out.println("After " + years + " years, $" + currrentValue + " saved at " + rate + "% will yield $" + (int) futureValue );
	}
}