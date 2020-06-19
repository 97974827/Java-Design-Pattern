package Adapter;

public interface Operator {
	
	// 원하는 기능 
	public abstract Float twiceOf(Float f);
	public abstract Float halfOf(Float f);
	
	// 새로운 기능
	public abstract Float TwiceOf(Float f);
	public abstract Float logging(Float f);
}
