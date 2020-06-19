package Template_Method_2;

public abstract class HouseTemplate {
	
	protected abstract void buildWails();
	protected abstract void buildPillars();
	
	// ���� Ŭ���� - �⺻���� �޼ҵ� ���� 
	private void buildWindows() {
		System.out.println("â���� �����");
	}
	
	private void buildFoundation() {
		System.out.println("�Ѹ��� ����");
	}
	
	// ���ø� �޼ҵ� --> public 
	public void buildHouse() {
		System.out.println("\n���ø� �޼ҵ� ����");
		buildFoundation();
		buildWindows();
		buildWails();
		buildPillars();
	}
	
	
	
}
