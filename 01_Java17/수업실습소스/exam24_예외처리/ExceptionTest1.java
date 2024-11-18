package exam24_예외처리;

public class ExceptionTest1 {

	public static void main(String[] args) {
	
		System.out.println("프로그램 시작");
		
		int n = 10;
		int n2 = 0;		
		int result = n / n2;
		System.out.println("실행결과:" + result);
		
		System.out.println("프로그램 종료 (정상종료)");
	}

}
