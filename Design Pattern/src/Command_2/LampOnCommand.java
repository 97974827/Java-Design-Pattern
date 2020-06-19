package Command_2;

public class LampOnCommand implements Command{
	
	private Lamp lamp;
	
	public LampOnCommand(Lamp lamp) {
		this.lamp = lamp;
	}
	
	@Override
	public void run() {
		System.out.println("������ Ʋ���");
		lamp.powerOn();
	}
}
