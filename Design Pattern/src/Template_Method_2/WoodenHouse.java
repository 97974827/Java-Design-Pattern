package Template_Method_2;

public class WoodenHouse extends HouseTemplate{

	@Override
	protected void buildWails() {
		System.out.println("������ �� ���� ���� ����");
	}

	@Override
	protected void buildPillars() {
		System.out.println("������ �� ���� ����� ����� ");
	}
	
}
