package Adapter;

import java.util.ArrayList;
import java.util.List;

public class WrapperMain {

	public static void main(String[] args) {
//		Integer obj = Integer.valueOf(1000);
//		Integer obj2 = 1000;
//		System.out.println(obj);
//		System.out.println(obj2);
//		Integer obj2 = Integer.valueOf("1000");
//		//--> 이렇게 하기 귀찮기 때문에
//		    
		Integer obj3 = 100; // 컴파일러가 자동박싱 만들어줌 
		int num = 200;
		int sum = num + obj3;
		Integer num2 = num;
		System.out.println(obj3);
		System.out.println(num);
		System.out.println(sum);
		System.out.println(num2);
	}

}
