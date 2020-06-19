package Builder_2;

public class MainBuilder2 {
	
	public static void main(String[] args) {
		
		Computer computer = ComputerBuilder
//				.start()
				.startWithCpu("i7")
				.setRam(8)
				.setStorage("256g SSD")
				.build();
				
		System.out.println(computer.toString());
	}
}
