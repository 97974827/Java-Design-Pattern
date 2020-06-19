package Template_Method_2;

public class HousingMain {
	
	public static void main(String[] args) {
		
		HouseTemplate wooden = new WoodenHouse();
		HouseTemplate glass = new GlassHouse();
		
		wooden.buildHouse();
		glass.buildHouse();
	}
}
