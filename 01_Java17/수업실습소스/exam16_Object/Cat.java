package exam16_Object;

public class Cat{
	
	String name;
	int age;
	
	@Override
	public String toString() {
		return name+"\t"+age;
	}
	// 한꺼번에 데이터 반환
	public String getCat() {
		return name+"\t"+age;
	}
	public Cat() {
		super();
	}
	public Cat(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}//end Cat






