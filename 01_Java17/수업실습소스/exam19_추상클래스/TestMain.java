package exam19_추상클래스;

//추상클래스
abstract class A{
	int num;  // 인스턴스 변수
	public A() {} // 생성자
	public void aaa() {} // 일반메서드 ( 기능이 정해져 있음 )
	public abstract void bbb();  // 추상메서드 ( 기능이 미정임 )
	public abstract void ccc();  // 추상메서드 ( 기능이 미정임 )
}

class B extends A{
	@Override
	public void bbb() {}
	@Override
	public void ccc() {}
}

public class TestMain {
	public static void main(String[] args) {
		// A a = new A();  // 추상클래스는 객체생성 불가
		// 자식인 B 클래스를 이용해서 추상클래스 A의 멤버(변수,메서드)를 사용할 수 있다.
		B b = new B();
		System.out.println(b.num);
		b.aaa();
		b.bbb();
		b.ccc();
		A x = new B();  // 다형성(polymorphism) 가능하다.
	}
}
