package Builder;

public class MainBuilder {
	
	public static void main(String[] args) {
		
		ComputerFactory factory = new ComputerFactory(); // ��ǻ�� ����
		
		// ���忡�� LG gram�� ���赵�� ���� �� ����� 
		factory.setBluePrint(new LgGramBluePrint());  
		factory.make(); 
		
		Computer computer = factory.getComputer(); // ���忡�� ��ǻ�͸� �����´� 
		
//		Computer computer = new Computer("i7", "16G", "256G ssd");
		
		System.out.println(computer.toString());
	}
}
