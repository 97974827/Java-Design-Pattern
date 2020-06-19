package Builder;

public class MainBuilder {
	
	public static void main(String[] args) {
		
		ComputerFactory factory = new ComputerFactory(); // 컴퓨터 공장
		
		// 공장에서 LG gram의 설계도를 생성 후 만든다 
		factory.setBluePrint(new LgGramBluePrint());  
		factory.make(); 
		
		Computer computer = factory.getComputer(); // 공장에서 컴퓨터를 가져온다 
		
//		Computer computer = new Computer("i7", "16G", "256G ssd");
		
		System.out.println(computer.toString());
	}
}
