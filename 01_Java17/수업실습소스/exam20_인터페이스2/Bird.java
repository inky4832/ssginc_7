package exam20_인터페이스2;

public class Bird  extends Pet implements Flyer{

	public Bird() {
		super();
	}
	public Bird(String name, int age, String gender) {
		super(name, age, gender);
	}
	@Override
	public void eat() {}
	@Override
	public void sleep() {}
	// Bird 에 추가된 기능
	@Override
	public void fly() {}
//	public void flyBird() {}
}
