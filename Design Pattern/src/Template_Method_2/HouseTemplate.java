package Template_Method_2;

public abstract class HouseTemplate {
	
	protected abstract void buildWails();
	protected abstract void buildPillars();
	
	// 슈퍼 클래스 - 기본적인 메소드 정의 
	private void buildWindows() {
		System.out.println("창문을 세운다");
	}
	
	private void buildFoundation() {
		System.out.println("뿌리를 짓다");
	}
	
	// 템플릿 메소드 --> public 
	public void buildHouse() {
		System.out.println("\n템플릿 메소드 실행");
		buildFoundation();
		buildWindows();
		buildWails();
		buildPillars();
	}
	
	
	
}
