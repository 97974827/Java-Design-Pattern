package SingleTon_2;

public class MainSingleTon2 {
	
	
	public static void main(String[] args) {
		FakePrinter fake = new FakePrinter();
		UsePrinter use = new UsePrinter();
		use.doSomething(fake);
		fake.getStr();
		
		Printer r = RealPrinter.getPrinter();
		
	}
}
