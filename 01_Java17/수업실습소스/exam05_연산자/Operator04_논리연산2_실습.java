package exam05_연산자;

public class Operator04_논리연산2_실습 {

	public static void main(String[] args) {
		
		// 논리연산자 실습
	
		int num = 10;
		int num2 = 20;
		
		// 문제1:  num 값이 15보다 크고(그리고) num2 값이 30 보다 작냐?
		boolean result1 = num > 15;
		boolean result2 = num2 < 30;
		boolean result3 = result1 && result2;
		System.out.println(result3);
		
		
		System.out.println( (num > 15) && (num2 < 30));  // false
		
		// 문제2:  num 값이 15보다 크거나(또는) num2 값이 30 보다 작냐?
		System.out.println( (num > 15) || (num2 < 30));  // true
		
		
		
	}
}
