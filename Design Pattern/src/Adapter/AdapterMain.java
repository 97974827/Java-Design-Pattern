package Adapter;

public class AdapterMain {
	
	public static void main(String[] args) {
//		test code 
//		double num = 2.2; 
//		num = Math.twoTime(num);
//		System.out.println(num);
		
		Adapter adapter = new Adapter();
		System.out.println(adapter.twiceOf(100f));
		System.out.println(adapter.halfOf(88f));
		System.out.println(adapter.TwiceOf(100f));
		adapter.logging(100f);
	}
}
