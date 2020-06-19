package MultiThread;

public class ThreadDemo extends Thread{
	
	private Thread thread;
	private String threadName;
	PrintDemo PD;
	
	public ThreadDemo(String name, PrintDemo pd){
		this.threadName = name;
		this.PD = pd;
	}
	
	@Override
	public void run() {
		synchronized(PD) {
			PD.printCount();
		}
		System.out.println("Thread " + threadName + " Exiting");
	}
	
	@Override
	public void start() {
		System.out.println("Starting " + threadName);
		if (thread == null) {
			System.out.println("스레드생성");
			thread = new Thread(this, threadName);
			thread.start();
		}
	}
}	
