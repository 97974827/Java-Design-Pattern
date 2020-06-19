package Adapter_2;

public class FormatAdapter implements MediaPlayer{	
	
	private MediaPackage m;
	
	public FormatAdapter(MediaPackage mediaPackage) {
		this.m = mediaPackage;
	}
	
	@Override
	public void play(String file_name) {
		System.out.println("FormatAdapter play : " + file_name);
	}
	
	@Override
	public String toString() {
		return "toString : " + m;
				
	}
}
