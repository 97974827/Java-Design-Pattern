package ProtoType_2;

import java.util.HashMap;

public class PrototypeService {
	
	private HashMap showcase = new HashMap<>();
	
	public void register(String name, Product proto) {
		showcase.put(name, proto);
	}
	
	public Product create(String proto_name) {
		return ((Product) showcase.get(proto_name)).createClone();
	}
}

