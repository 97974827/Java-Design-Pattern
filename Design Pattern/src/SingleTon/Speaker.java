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
			System.out.println("���λ���");
		} else {
			System.out.println("�̹̻���");
		}
		return speaker;
	}
		
}
