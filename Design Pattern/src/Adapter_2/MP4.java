package Adapter_2;

public class MP4 implements MediaPackage{
	
	@Override
	public void playFile(String filename) {
		System.out.println("MP4 ���� ���� : " + filename);
	}
}
