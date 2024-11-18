package exam24_예외처리;

public class ExceptionTest2_try_catch {

	public static void main(String[] args) {
	
		System.out.println("프로그램 시작");
	
		 try {
			int n = 10;
			int n2 = 0;		
			int result = n / n2;
			System.out.println("실행결과:" + result);
		 }catch(ArithmeticException e) {
			//예외발생시 처리하는 코드
			 System.out.println("0으로 나누어서 예외발생됨");
		 }
		 
		System.out.println("프로그램 종료 (정상종료)");
	}

}
