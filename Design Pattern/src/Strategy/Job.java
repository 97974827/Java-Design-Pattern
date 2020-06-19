package Strategy;

public class Job {
	
	// ������ -- ����
	private Weapon weapon;
	
	// ��ȯ ��� 
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	
	public void Attack() {
		if (weapon == null) {
			System.out.println("�Ǽհ���");
		} else {
			// ��������Ʈ
			weapon.Mow(); // ����			
		}
		
	}
}
