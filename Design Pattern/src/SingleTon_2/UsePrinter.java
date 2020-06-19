package SingleTon_2;

public class UsePrinter{

	public void doSomething(Printer printer) {
		System.out.println("UsePrinter.doSomething : " + printer);
		printer.print("fakeGet");
	}

}
