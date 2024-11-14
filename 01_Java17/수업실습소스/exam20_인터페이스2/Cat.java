package exam20_인터페이스2;

public class Cat extends Pet  {

	// Cat에서 추가된 속성
	String color;
	
    @Override
	public void eat() {}
	@Override
	public void sleep() {}
	
//	public void eatCat() {}
//	public void sleepCat() {}
	
	public void runCat() {} // Cat에서 추가된 메서드

	public Cat() {
		super();
	}

	public Cat(String name, int age, String gender) {
		super(name, age, gender);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Cat [color=" + color + ", name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
	
}
