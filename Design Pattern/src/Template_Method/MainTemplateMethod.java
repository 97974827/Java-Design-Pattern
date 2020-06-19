package Template_Method;

public class MainTemplateMethod {
	
	public static void main(String[] args) {
		
		AbstGameConnectHelper helper = new Game();
		
		helper.requestConnection("아이디 암호 등 접속정보");
	}
}
