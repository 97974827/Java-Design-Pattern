package FactoryMethod_2;

public class HpItem implements Item{

	@Override
	public void use() {
		System.out.println("Hp가 회복됩니다");
	}
	
}
