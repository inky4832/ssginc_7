package exam20_인터페이스2;

// Cat과 Dog의 공통적인 속성 및 메서드 추출
public abstract class Pet {

	//공통적인 속성
	String name;
	int age;
	String gender;
	
	//공통적인 메서드
	public abstract void eat();
	public abstract void sleep();
	
	 
	public Pet() {
		super();
	}
	
	public Pet(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Pet [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
}
