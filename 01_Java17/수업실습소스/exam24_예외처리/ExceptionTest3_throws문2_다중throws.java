package exam24_예외처리;

class Test3{
	public void a() throws ArithmeticException,NullPointerException {
		b();
	}
	public void b() throws ArithmeticException,NullPointerException {
		// ArithmeticException 발생가능한 코드
		int n = 10;
		int n2 = 2;		
		int result = n / n2;
		System.out.println("실행결과:" + result);
		// NullPointerException 발생 가능한 코드
		String name=null;
		System.out.println("name길이: " + name.length());
	}
}//end Test3
public class ExceptionTest3_throws문2_다중throws {
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
	 try {
		Test3 t3 = new Test3();
		t3.a();
	 }catch(ArithmeticException e) {
		 System.out.println(e.getMessage());
	 }catch(NullPointerException e) {
		 System.out.println(e.getMessage());
	 }catch(Exception e) {
		 System.out.println("나머지 예외는 이곳에서 처리됨");
	 }
		System.out.println("프로그램 종료 (정상종료)");
	}
}
