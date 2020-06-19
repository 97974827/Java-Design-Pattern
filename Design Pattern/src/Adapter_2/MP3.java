package Adapter_2;

public class MP3 implements MediaPlayer{
	
	
	@Override
	public void play(String file_name) {
		System.out.println("MP3 play : " + file_name);
	}
	
}
