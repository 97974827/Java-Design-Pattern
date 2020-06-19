package Template_Method_2;

public class GlassHouse extends HouseTemplate{

	@Override
	protected void buildWails() {
		System.out.println("유리로 된 집의 벽을 짓다");
	}

	@Override
	protected void buildPillars() {
		System.out.println("유리로 된 집의 기둥을 세우다 ");
	}
	
}
