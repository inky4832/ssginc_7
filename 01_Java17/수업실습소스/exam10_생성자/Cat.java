package exam10_생성자;

public class Cat {

	String name;
	int age;
	String gender;
	
	//생성자
	public Cat() {
		System.out.println("Cat 생성자");
	}
	public Cat(int n) {
		System.out.println("Cat 생성자");
	}
	public Cat(String n) {
		System.out.println("Cat 생성자");
	}
	public Cat(String n, int x) {
		System.out.println("Cat 생성자");
	}
	public Cat(int x, String n) {
		System.out.println("Cat 생성자");
	}
}
