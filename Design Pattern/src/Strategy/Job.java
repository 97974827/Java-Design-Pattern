package Strategy;

public class Job {
	
	// 접근점 -- 무기
	private Weapon weapon;
	
	// 교환 기능 
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	
	public void Attack() {
		if (weapon == null) {
			System.out.println("맨손공격");
		} else {
			// 델리게이트
			weapon.Mow(); // 공격			
		}
		
	}
}
