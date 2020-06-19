package FactoryMethod;

public class ShapeFactory {
	
	// 팩토리 메소드 
	public Shape getShape(String str) throws Exception{
		if (str == null) {
			System.out.println("도형을 그릴수 없습니다.");
			return null;
		} 
		if (str.equals("원")) {
			return new Circle();
		} else if (str.equals("정사각형")) {
			return new Square();
		} else if (str.equals("직사각형")) {
			return new Rectangle();
		}
		
		return null;
//		Shape s = null;
//		
//		if (str.equals("원")) {
//			s = new Circle();
//			s.draw();
//		} else if (str.equals("정사각형")) {
//			s = new Square();
//			s.draw();
//		} else if (str.equals("직사각형")) {
//			s = new Rectangle();
//			s.draw();
//		} else {
//			System.out.println("도형을 그릴수 없습니다.");
//		}
//		
//		return s;
	}
}
