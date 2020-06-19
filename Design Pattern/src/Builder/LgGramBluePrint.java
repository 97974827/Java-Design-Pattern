package Builder;

// ConcreateBuilder
public class LgGramBluePrint extends BluePrint{

	private Computer computer;
	
	public LgGramBluePrint() {
		computer = new Computer("default",0,"default");
	}
	
	
	/* ConcreteBuilder - ��ü������ �����ϴ� �κ��̴� */
	@Override
	public void setCpu() {
		computer.setCpu("i7");
	}

	@Override
	public void setRam() {
		computer.setRam(16);
	}

	@Override
	public void setStorage() {
		computer.setStorage("500G SSD");
	}
	
	public Computer getComputer() {
		return computer;
//		return new Computer("i7", 16, "500G SSD");
	}

}
