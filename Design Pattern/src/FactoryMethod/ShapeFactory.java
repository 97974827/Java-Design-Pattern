package FactoryMethod;

public class ShapeFactory {
	
	// ���丮 �޼ҵ� 
	public Shape getShape(String str) throws Exception{
		if (str == null) {
			System.out.println("������ �׸��� �����ϴ�.");
			return null;
		} 
		if (str.equals("��")) {
			return new Circle();
		} else if (str.equals("���簢��")) {
			return new Square();
		} else if (str.equals("���簢��")) {
			return new Rectangle();
		}
		
		return null;
//		Shape s = null;
//		
//		if (str.equals("��")) {
//			s = new Circle();
//			s.draw();
//		} else if (str.equals("���簢��")) {
//			s = new Square();
//			s.draw();
//		} else if (str.equals("���簢��")) {
//			s = new Rectangle();
//			s.draw();
//		} else {
//			System.out.println("������ �׸��� �����ϴ�.");
//		}
//		
//		return s;
	}
}
