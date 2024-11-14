package exam20_인터페이스;

interface A{
	// 상수
	int NUM=20;  // public static final int NUM =20; 동일
	public static final int SIZE =20;
	
	// 추상메서드
	void a();  // public abstract void a(); 동일
	public abstract void a2();
	
	// default 메서드
	public default void b() {}
	
	//static 메서드
	public static void c() {}
	
}//end interface
interface A2{
	public abstract void x();
}
// 인터페이스간에는 다중상속
interface A3 extends A, A2{
	
}

class B implements A, A2{ // 다중구현
	@Override
	public void a() {}
	@Override
	public void a2() {}
	
	@Override
	public void x() {}
	
}//end class

public class TestMain {
	public static void main(String[] args) {
		//new 불가
		//A a = new A();
		//상수 접근: 인터페이스명.상수명
		System.out.println(A.NUM);
		System.out.println(A.SIZE);
		
		// static 메서드 접근: 인터페이스명.static메서드
		A.c();
		
		// 추상 메서드와 default 메서드 접근: 객체생성후 접근
		B b = new B();
		b.a();
		b.a2();
		b.b();  // default 메서드
		
		A x = new B(); // 다형성
		x.a();
		x.a2();
		x.b();
	}
}
