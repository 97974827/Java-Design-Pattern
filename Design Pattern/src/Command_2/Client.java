package Command_2;

public class Client {
	
	public static void main(String[] args) {
		
		Heater heater = new Heater();
		Lamp lamp = new Lamp();
		
		Command heater_command = new HeaterOnCommand(heater);
		Command lamp_command = new LampOnCommand(lamp);
		
		OKGoogle google = new OKGoogle();
		
		google.setCommand(heater_command);
		google.talk();
		
		google.setCommand(lamp_command);
		google.talk();
	}
}	
