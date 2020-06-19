package FactoryMethod;

public class FactoryPatternTest {
	
	public static void main(String[] args) {
		
//		ShapeFactory fac = new ShapeFactory();
//		fac.getShape("원");
//		fac.getShape("정사각형");
//		fac.getShape("직사각형");
		
		ShapeFactory fac = new ShapeFactory();
		
		try {
			Shape circle = fac.getShape("원");
			circle.draw();
			Shape sq = fac.getShape("정사각형");
			sq.draw();
			Shape rect = fac.getShape("직사각형");
			rect .draw();
			Shape job = fac.getShape("조정효");
			job .draw();
		} catch(Exception e) {
			System.out.println("그리기 실패");
			e.printStackTrace();
		} finally {
			System.out.println("종료");
		}
	}
}
