package Adapter_2;

public class MKV implements MediaPackage{
	
	@Override
	public void playFile(String filename) {
		System.out.println("MKV ���� ���� : " + filename);
	}
	
}
