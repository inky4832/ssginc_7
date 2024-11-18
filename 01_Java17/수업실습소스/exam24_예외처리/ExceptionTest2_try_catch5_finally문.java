package exam24_예외처리;

public class ExceptionTest2_try_catch5_finally문 {

	public static void main(String[] args) {
	
		System.out.println("프로그램 시작");
	
		 try {
			int n = 10;
			int n2 = 2;		
			int result = n / n2;
			System.out.println("실행결과:" + result);
		 }catch(ArithmeticException e) {
			//예외발생시 처리하는 코드
			 System.out.println("0으로 나누어서 예외발생됨");
		 }finally {
			 System.out.println("반드시 수행되는 문장");			
		 }
		 
		 // try~finally문
		 try {
			 System.out.println(" try 문장");						 
		 }finally {
			 System.out.println(" finally 문장");						 
		 }
		 
		 
		System.out.println("프로그램 종료 (정상종료)");
	}

}
