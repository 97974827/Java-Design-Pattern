package SingleTon;

public class MainSingleton {
	
	public static void main(String[] args) {
		
		// �ּҰ� ���� - ������ �ν��Ͻ�  
		Speaker speaker1 = Speaker.getSpeaker();
		Speaker speaker2 = Speaker.getSpeaker();
		
		// 5, 5
		System.out.println(speaker1.getVolume());
		System.out.println(speaker2.getVolume());
		
		// 11�� ���;��� 
		speaker1.setVolume(11);
		System.out.println(speaker1.getVolume());
		System.out.println(speaker2.getVolume());
		
		// 21�� ���;��� 
		speaker1.setVolume(21);
		System.out.println(speaker1.getVolume());
		System.out.println(speaker2.getVolume());
	}
}
