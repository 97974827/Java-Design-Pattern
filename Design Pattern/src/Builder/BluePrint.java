package Builder;

// AbstractBuilder
public abstract class BluePrint { // ��Ű��ó �Ǵ� ���� ���踦 ����ȭ�� ��� ������ ��ȭ�� �����ϰų� ������ ������ ���Ѵ�. 
	
	/* �⺻������ ���赵�� ����� �̷� �κ��� �ʿ��ϴ� �������� - BuildPart */
	public abstract void setCpu();
    public abstract void setRam();
    public abstract void setStorage();
    
    public abstract Computer getComputer();
}
