package FactoryMethod_2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ItemCreator { // ������ ������(��ü)
	
	private void itemInfo() {
		System.out.println("������ ���̽����� ������ ���� ��û�� �մϴ�");
	}
	
	private void itemLog(String item) {
		SimpleDateFormat simple = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = new Date();
		String time = simple.format(date);
		System.out.println(item + " ������ ���� ���� ����ϴ� (�����ð� : " + time + ")");
	}
	
	// ������ ����
	private Item createItem(String item) {
		if(item == null) {
			return null;
		}
		if (item.equals("hp")) {
			System.out.println("hp ������ ����");
			return new HpItem();
		} else if (item.equals("mp")) {
			System.out.println("mp ������ ����");
			return new MpItem();
		}
		
		return null;
	}
	
	// ���丮 �޼ҵ� - ���ø� �޼ҵ�� ����  
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
