package Builder;

// director 관리자 -> 컴퓨터를 만들어줌 
public class ComputerFactory {
	
	private BluePrint blueprint;
	
	/* 컴퓨터를 만들어 주기 위한 메서드 , 다양한 설계도 가지고있어야함 : 인수 blueprint */
	public void setBluePrint(BluePrint bluePrint) {
		this.blueprint = bluePrint;
	}
	
	public void make() {
		blueprint.setCpu();
		blueprint.setRam();
		blueprint.setStorage();
	}
	
	public Computer getComputer() {
		return blueprint.getComputer();
	}
}
