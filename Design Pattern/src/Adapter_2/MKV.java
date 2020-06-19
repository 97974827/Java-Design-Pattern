package Adapter_2;

public class MKV implements MediaPackage{
	
	@Override
	public void playFile(String filename) {
		System.out.println("MKV 파일 실행 : " + filename);
	}
	
}
