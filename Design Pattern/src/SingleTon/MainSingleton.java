package SingleTon;

public class MainSingleton {
	
	public static void main(String[] args) {
		
		// 주소값 같음 - 동일한 인스턴스  
		Speaker speaker1 = Speaker.getSpeaker();
		Speaker speaker2 = Speaker.getSpeaker();
		
		// 5, 5
		System.out.println(speaker1.getVolume());
		System.out.println(speaker2.getVolume());
		
		// 11이 나와야함 
		speaker1.setVolume(11);
		System.out.println(speaker1.getVolume());
		System.out.println(speaker2.getVolume());
		
		// 21이 나와야함 
		speaker1.setVolume(21);
		System.out.println(speaker1.getVolume());
		System.out.println(speaker2.getVolume());
	}
}
