package Builder_2;

public class ComputerBuilder {
	
	private Computer computer;
	
	private ComputerBuilder() {
		computer = new Computer("defalut",0,"defalut");
	}
	
	public static ComputerBuilder start() {
		return new ComputerBuilder();
	}
	
	// 가독성 좋게 만들기 - static 사용 
	public static ComputerBuilder startWithCpu(String cpu) {
		ComputerBuilder builder = start(); //new ComputerBuilder();
		builder.computer.setCpu(cpu);
		return builder;
	}
	
	public ComputerBuilder setCpu(String cpu) {
		computer.setCpu(cpu);
		return this;
	}
	
	public ComputerBuilder setRam(int ram) {
		computer.setRam(ram);
		return this;
	}

	public ComputerBuilder setStorage(String storage) {
		computer.setStorage(storage);
		return this;
	}
	
	public Computer build() {
		return this.computer;
	}
	
	public void setComputer(Computer computer) {
		this.computer = computer;
	}
}
