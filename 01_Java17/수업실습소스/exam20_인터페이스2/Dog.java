package exam20_인터페이스2;

public class Dog extends Pet{

	// Dog에서 추가된 속성
    boolean isDot;

    //기능
    @Override
	public void eat() {}
	@Override
	public void sleep() {}
	
//	public void eatDog() {}
//	public void sleepDog() {}
	
	public void cryDog() {} // Dog에서 추가된 메서드
    
	public Dog() {
		super();
	}
	public Dog(String name, int age, String gender) {
		super(name, age, gender);
	}
	public boolean isDot() {
		return isDot;
	}
	public void setDot(boolean isDot) {
		this.isDot = isDot;
	}
	@Override
	public String toString() {
		return "Dog [isDot=" + isDot + ", name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
    
    
}
