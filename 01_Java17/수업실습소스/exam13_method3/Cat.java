package exam13_method3;

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
	public Cat(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	// setter/getter 메서드
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
    	
	
	
	
}


















