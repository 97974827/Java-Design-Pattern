package Template_Method;


public abstract class AbstGameConnectHelper {
	
	// 관련 메서드들은 외부에선 호출하면 안되는데 하위클래스에서 호출해야함 -> protected
	protected abstract String deSecurity(String string);
	
	protected abstract boolean authentication(String id, String password);
	
	protected abstract int authorization(String userName);
	
	protected abstract String connection(String info);
	
	// 템플릿 메소드
	public String requestConnection(String encodedInfo) {
		
		// 보안과정 -> 암호화 된 문자열을 복호화 
		String decodedInfo = deSecurity(encodedInfo);
		
		// 인증과정 : 반환된 것을 가지고 아이디, 암호를 할당한다
		String id = "aaa";
		String password = "bbb";
		
		if(!authentication(id, password)) {
			throw new Error("아이디 암호 불일치");
		} 
		
		// 권한과정
		String user_name = "userName";
		int i = authorization(user_name);
		
		switch(i) {
		case -1:
			throw new Error("나이 미만 셧다운");
		case 0:
			System.out.println("게임 매니저");
			break;
		case 1:
			System.out.println("유료 회원");
			break;
		case 2:
			System.out.println("무료 회원");
			break;
		case 3:
			System.out.println("권한 없음");
			break;
		default: // 확장성 
			System.out.println("기타사항");
			break;
		}
		
		// 접속과정
		return connection(decodedInfo);
	}
}
