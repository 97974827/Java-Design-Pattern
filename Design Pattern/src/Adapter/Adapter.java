package Adapter;

public class Adapter implements Operator{
	
	
	@Override
	public Float twiceOf(Float f) {
		return (float) Math.twoTime(f.doubleValue());
	}
	
	@Override
	public Float halfOf(Float f) {
		return (float) Math.halF(f.doubleValue());	
	}
	
	@Override
	public Float TwiceOf(Float f) {
		return (float) Math.twotwoTime(f.doubleValue()); // ��ڽ� 
	}
	
	@Override
	public Float logging(Float f) {
		float ff = (float) Math.halF(f.doubleValue());
		System.out.println("�α� : " + ff);  
		return ff;
	}
}
