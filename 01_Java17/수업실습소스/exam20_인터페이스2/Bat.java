package exam20_인터페이스2;

public class Bat extends Pet implements Flyer {
	
	public Bat() {}

	public Bat(String name, int age, String gender) {
		super(name, age, gender);}
	@Override
	public void eat() {}
	@Override
	public void sleep() {}
	// Bat 에 추가된 기능
	@Override
	public void fly() {}
//    public void flyBat() {}

}
