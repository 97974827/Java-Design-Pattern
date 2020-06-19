package SingleTon_2;

public class RealPrinter implements Printer{

	private static Printer printer = null;
	
	private RealPrinter() {}
	
	public synchronized static Printer getPrinter() {
		if (printer == null) {
			System.out.println("���λ���");
			printer = new RealPrinter();
		} else {
			System.out.println("�̹̻���");
		}
		return printer;
	}
	
	@Override
	public void print(String input) {
		System.out.println(input);
	}
	
}
