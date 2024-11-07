package exam12_this;

public class Dog {

	private String name;
	private int age;
	private String gender;
	
	
	// 이클립스가 제공한 생성자 작성 실습
	public Dog() {
		
		
	}
	public Dog(String name, int age) {
		this(name,age,null);
//		this.name = name;
//		this.age = age;
	}
	public Dog(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
    	
}
