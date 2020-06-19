package SingleTon_2;

public class RealPrinter implements Printer{

	private static Printer printer = null;
	
	private RealPrinter() {}
	
	public synchronized static Printer getPrinter() {
		if (printer == null) {
			System.out.println("货肺积己");
			printer = new RealPrinter();
		} else {
			System.out.println("捞固积己");
		}
		return printer;
	}
	
	@Override
	public void print(String input) {
		System.out.println(input);
	}
	
}
