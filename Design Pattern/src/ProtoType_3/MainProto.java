package ProtoType_3;

public class MainProto {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Cat navi = new Cat();
		navi.setName("navi");
		navi.setAge(new Age(2013,2,13));
		
//		Cat yo = navi;        // 주소까지 복사 --> 얕은 복사 (결과 : 전부 바뀜)
		Cat yo = navi.copy(); // 주소가 다르다 --> 깉은 복사 (하나씩 올바르게 바뀜)
		yo.setName("yo"); //
		yo.getAge().setYear(2020);
		yo.getAge().setMonth(12);
		yo.getAge().setDay(30);
		
		System.out.println(navi.getName()); 
		System.out.println(navi.getAge().getYear());
		System.out.println(navi.getAge().getMonth());
		System.out.println(navi.getAge().getDay());
		
		System.out.println();
		System.out.println(yo.getName());   
		System.out.println(yo.getAge().getYear());
		System.out.println(yo.getAge().getMonth());
		System.out.println(yo.getAge().getDay());		
	}
}
