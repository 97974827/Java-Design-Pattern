package Command_2;

public class HeaterOnCommand implements Command{
	
	private Heater heater;
	
	public HeaterOnCommand(Heater heater) {
		this.heater = heater;
	}
	
	@Override
	public void run() {
		System.out.println("히터를 틀어라");
		heater.powerOn();
	}
}
