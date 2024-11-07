package exam12_this;

public class Cat {

	// 은닉화
	private String name;
	private int age;
	private String gender;
	
	//오버로딩 생성자
	public Cat() {}
	public Cat(String n, int n2) {
		name = n;
		age = n2;
	}
	//권장
	public Cat(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
}
