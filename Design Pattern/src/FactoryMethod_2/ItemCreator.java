package FactoryMethod_2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ItemCreator { // 아이템 생성자(주체)
	
	private void itemInfo() {
		System.out.println("데이터 베이스에서 아이템 정보 요청을 합니다");
	}
	
	private void itemLog(String item) {
		SimpleDateFormat simple = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = new Date();
		String time = simple.format(date);
		System.out.println(item + " 아이템 생성 정보 남김니다 (생성시간 : " + time + ")");
	}
	
	// 아이템 생성
	private Item createItem(String item) {
		if(item == null) {
			return null;
		}
		if (item.equals("hp")) {
			System.out.println("hp 아이템 생성");
			return new HpItem();
		} else if (item.equals("mp")) {
			System.out.println("mp 아이템 생성");
			return new MpItem();
		}
		
		return null;
	}
	
	// 팩토리 메소드 - 템플릿 메소드와 유사  
	public void create() {
		itemInfo();
		Item hp = createItem("hp");
		hp.use();
		itemLog("hp");
		System.out.println();
		
		itemInfo();
		Item mp = createItem("mp");
		mp.use();
		itemLog("mp");
	}
}
