package FactoryMethod;

public class FactoryPatternTest {
	
	public static void main(String[] args) {
		
//		ShapeFactory fac = new ShapeFactory();
//		fac.getShape("��");
//		fac.getShape("���簢��");
//		fac.getShape("���簢��");
		
		ShapeFactory fac = new ShapeFactory();
		
		try {
			Shape circle = fac.getShape("��");
			circle.draw();
			Shape sq = fac.getShape("���簢��");
			sq.draw();
			Shape rect = fac.getShape("���簢��");
			rect .draw();
			Shape job = fac.getShape("����ȿ");
			job .draw();
		} catch(Exception e) {
			System.out.println("�׸��� ����");
			e.printStackTrace();
		} finally {
			System.out.println("����");
		}
	}
}
