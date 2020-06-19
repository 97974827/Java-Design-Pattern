package Strategy;

public class GameMain {
	
	public static void main(String[] args) {
		Knife k = new Knife();
		Sword s = new Sword();
		
		Job job = new Job();
		job.Attack();
		
		job.setWeapon(k);
		job.Attack();
		
		job.setWeapon(s);
		job.Attack();
		
	}
}
