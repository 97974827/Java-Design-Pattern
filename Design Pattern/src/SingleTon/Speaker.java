package SingleTon;

public class Speaker {
	
	private static Speaker speaker = null;
	
	private int volume = 5; 
	
	private Speaker() {
		this.volume = volume;
	}
	
	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public static Speaker getSpeaker(){
		
		if (speaker == null) {
			speaker = new Speaker();
			System.out.println("货肺积己");
		} else {
			System.out.println("捞固积己");
		}
		return speaker;
	}
		
}
