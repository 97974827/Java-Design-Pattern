package Prototype;

public class MainProto {
	
	public static void main(String[] args) throws CloneNotSupportedException{
		Circle circle1 = new Circle(1,2,3);
		Circle circle2 = circle1.copy();
		
		System.out.println("X : " + circle1.getX());
		System.out.println("Y : " + circle1.getY());
		System.out.println("R : " + circle1.getR());
		System.out.println();
		System.out.println("X : " + circle2.getX());
		System.out.println("Y : " + circle2.getY());
		System.out.println("R : " + circle2.getR());
		
	}
}
