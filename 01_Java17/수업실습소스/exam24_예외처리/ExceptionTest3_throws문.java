package exam24_예외처리;

class Test2{
	public void a() throws ArithmeticException {
		b();
	}
	public void b() throws ArithmeticException {
		int n = 10;
		int n2 = 0;		
		int result = n / n2;
		System.out.println("실행결과:" + result);
	}
}//end Test2

public class ExceptionTest3_throws문 {
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
	 try {
		Test2 t2 = new Test2();
		t2.a();
	 }catch(ArithmeticException e) {
		 System.out.println(e.getMessage());
	 }
		System.out.println("프로그램 종료 (정상종료)");
	}
}
