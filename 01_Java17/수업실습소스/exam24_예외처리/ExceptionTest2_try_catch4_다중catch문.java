package exam24_예외처리;

public class ExceptionTest2_try_catch4_다중catch문 {

	public static void main(String[] args) {
	
		System.out.println("프로그램 시작");
	
		 try {
			// ArithmeticException 발생가능한 코드
			int n = 10;
			int n2 = 2;		
			int result = n / n2;
			System.out.println("실행결과:" + result);
			
			// NullPointerException 발생 가능한 코드
			String name=null;
			System.out.println("name길이: " + name.length());
			
		 }catch(ArithmeticException e) {
			//예외발생시 처리하는 코드
			 System.out.println("0으로 나누어서 예외발생됨");
		 }catch(NullPointerException e) {
			//예외발생시 처리하는 코드
			 System.out.println("name 값이 null이기 때문에 예외발생됨");
		 }catch(Exception e) {
			//예외발생시 처리하는 코드
			 System.out.println("나머지 예외는 이곳에서 처리됨");
		 }
		 
		System.out.println("프로그램 종료 (정상종료)");
	}

}
