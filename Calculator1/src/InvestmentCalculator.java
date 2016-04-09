public class InvestmentCalculator {

	public static void main(String[] args) {
		
		int invest = 14000;
		invest=invest+(14000*40/100);
		invest=invest-1500;
		invest=invest+(invest*12/100);
		System.out.println("This is the final value: " +invest);
	}
}
