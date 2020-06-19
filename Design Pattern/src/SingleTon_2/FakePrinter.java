package SingleTon_2;

public class FakePrinter implements Printer{

	private String str;
	
	@Override
	public void print(String str) {
		this.str = str;
	}
	
	public String getStr() {
		System.out.println("FakePrinter.getStr : " + str);
		return str;
	}
}


