package exam11_은닉화;

public class Cat {

	// 은닉화
	private String name;
	private int age;
	private String gender;
	
	//오버로딩 생성자
	public Cat() {}
	public Cat(String n, int n2, String n3) {
		System.out.println("this:"+ this);
		this.name = n;
		this.age = n2;
		gender = n3;  // this. 생략 가능
	}
	
}
