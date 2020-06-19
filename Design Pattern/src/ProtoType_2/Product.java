package ProtoType_2;

import java.util.Map;
import java.util.HashMap;

public interface Product extends Cloneable{
	
	Map<String, String> maps = new HashMap<>();
	
	public abstract String use(String use);
	
	Product createClone();
}
