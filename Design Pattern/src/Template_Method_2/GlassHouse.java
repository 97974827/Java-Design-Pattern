package Template_Method_2;

public class GlassHouse extends HouseTemplate{

	@Override
	protected void buildWails() {
		System.out.println("������ �� ���� ���� ����");
	}

	@Override
	protected void buildPillars() {
		System.out.println("������ �� ���� ����� ����� ");
	}
	
}
