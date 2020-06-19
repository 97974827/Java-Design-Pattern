package ProtoType_3;

public class Cat implements Cloneable{
	
	private String name;
	private Age age;
	

	public Age getAge() {
		return age;
	}

	public void setAge(Age age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Cat copy() throws CloneNotSupportedException {
		// 명시적 복사 해줘야 깊은 복사가 된다  
		Cat cat = (Cat)this.clone();
		cat.setAge(new Age(this.age.getYear(), this.age.getMonth(), this.age.getDay()));
		return cat;
	}
}
