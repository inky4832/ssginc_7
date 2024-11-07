package exam13_method2;

public class Cat {

	private String name;
	private int age;
	private String gender;
	
	//생성자
	public Cat() {}

	public Cat(String name, int age) {
		this.name = name;
		this.age = age;
	}
	// gender을 리턴하는 메서드
	public String getGender() {
		return gender;
	}
	//name을 리턴하는 메서드
	public String getName() {
		return name;
	}
	//age을 리턴하는 메서드
	public int getAge() {
		return age;
	}
	
	//name을 수정하는 메서드
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
  
	//필요시 다양한 기능을 하는 메서드 추가 가능.
}


















