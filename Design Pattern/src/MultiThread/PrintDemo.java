package MultiThread;

public class PrintDemo {
	
	public void printCount() {
		try {
			for(int i=0; i<15; i++) {
				System.out.println("Counter   ---  " + i);
			}
		} catch(Exception e) {
			System.out.println("Thread  interrupted");
		}
	}
}
