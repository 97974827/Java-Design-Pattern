package Template_Method_2;

public class WoodenHouse extends HouseTemplate{

	@Override
	protected void buildWails() {
		System.out.println("나무로 된 집의 벽을 짓다");
	}

	@Override
	protected void buildPillars() {
		System.out.println("나무로 된 집의 기둥을 세우다 ");
	}
	
}
