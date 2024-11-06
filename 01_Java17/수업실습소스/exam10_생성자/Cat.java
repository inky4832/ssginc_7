package exam10_생성자;

public class Cat {

	String name;
	int age;
	String gender;
	
	//생성자
	public Cat() {
		System.out.println("Cat() 생성자");
	}
	public Cat(int x) {
		System.out.println("Cat(int n) 생성자" + x);
	}
	public Cat(String n) {
		System.out.println("Cat(String n) 생성자 " + n);
	}
	public Cat(String n, int x) {
		System.out.println("Cat(String n, int x) 생성자 " + n +" " + x);
	}
	public Cat(int x, String n) {
		System.out.println("Cat(int x, String n) 생성자 "+ x +" " + n);
	}
}
