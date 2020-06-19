package Builder;

// director ������ -> ��ǻ�͸� ������� 
public class ComputerFactory {
	
	private BluePrint blueprint;
	
	/* ��ǻ�͸� ����� �ֱ� ���� �޼��� , �پ��� ���赵 �������־���� : �μ� blueprint */
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
