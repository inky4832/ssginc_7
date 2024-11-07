package exam13_method;

public class TestCat {

	public static void main(String[] args) {

		System.out.println("프로그램시작");
		
		Cat c = new Cat();

		//c.method1();
		c.method2(10);
//		c.method2("홍길동");
//		c.method2("홍길동",10);
		
		//리턴값이 있는 메서드 호출
//		c.method3();
//		int result = c.method3();
//		System.out.println("리턴값:" + result);
		
		int sum = c.method4(10, 20);
		System.out.println("합계:" + sum);
		
		System.out.println("프로그램종료");
	}
}
