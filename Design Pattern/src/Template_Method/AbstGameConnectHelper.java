package Template_Method;


public abstract class AbstGameConnectHelper {
	
	// ���� �޼������ �ܺο��� ȣ���ϸ� �ȵǴµ� ����Ŭ�������� ȣ���ؾ��� -> protected
	protected abstract String deSecurity(String string);
	
	protected abstract boolean authentication(String id, String password);
	
	protected abstract int authorization(String userName);
	
	protected abstract String connection(String info);
	
	// ���ø� �޼ҵ�
	public String requestConnection(String encodedInfo) {
		
		// ���Ȱ��� -> ��ȣȭ �� ���ڿ��� ��ȣȭ 
		String decodedInfo = deSecurity(encodedInfo);
		
		// �������� : ��ȯ�� ���� ������ ���̵�, ��ȣ�� �Ҵ��Ѵ�
		String id = "aaa";
		String password = "bbb";
		
		if(!authentication(id, password)) {
			throw new Error("���̵� ��ȣ ����ġ");
		} 
		
		// ���Ѱ���
		String user_name = "userName";
		int i = authorization(user_name);
		
		switch(i) {
		case -1:
			throw new Error("���� �̸� �˴ٿ�");
		case 0:
			System.out.println("���� �Ŵ���");
			break;
		case 1:
			System.out.println("���� ȸ��");
			break;
		case 2:
			System.out.println("���� ȸ��");
			break;
		case 3:
			System.out.println("���� ����");
			break;
		default: // Ȯ�强 
			System.out.println("��Ÿ����");
			break;
		}
		
		// ���Ӱ���
		return connection(decodedInfo);
	}
}
