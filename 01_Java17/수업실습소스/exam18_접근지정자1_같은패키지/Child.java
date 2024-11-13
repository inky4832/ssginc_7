package exam18_접근지정자1_같은패키지;

public class Child extends Parent{

	public void method() {
		//같은패키지의 다른클래스
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		//System.out.println(n4);
	}
}

//같은패키지의 다른클래스
class Other{

	public void method() {
		Parent p = new Parent();
		System.out.println(p.n1);
		System.out.println(p.n2);
		System.out.println(p.n3);
		//System.out.println(p.n4);
	}
}