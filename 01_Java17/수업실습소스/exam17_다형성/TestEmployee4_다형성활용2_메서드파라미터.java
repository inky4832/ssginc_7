package exam17_다형성;

public class TestEmployee4_다형성활용2_메서드파라미터 {

	// 다형성이 적용되지 않은 메서드 ( 오버로딩 메서드 )
	public static void a(int n) {
		System.out.println(n);
	}
	public static void a(String n) {
		System.out.println(n);
	}
	public static void a(double n) {
		System.out.println(n);
	}
	
	// 다형성이 적용된 메서드
	public static void b(Object obj) {
		System.out.println(obj);		
	}
	
	public static void main(String[] args) {
		// 다형성 활용2- 메서드 파라미터
		a(100);
		a("hello");
		a(3.14);
		System.out.println("#################");
		b(100);
		b("hello");
		b(3.14);
        
	}
}
