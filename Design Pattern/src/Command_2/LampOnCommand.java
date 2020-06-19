package Command_2;

public class LampOnCommand implements Command{
	
	private Lamp lamp;
	
	public LampOnCommand(Lamp lamp) {
		this.lamp = lamp;
	}
	
	@Override
	public void run() {
		System.out.println("램프를 틀어라");
		lamp.powerOn();
	}
}
