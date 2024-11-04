package exam05_연산자;

public class Operator01_산술연산 {

	public static void main(String[] args) {
		
		// 산술연산자
		
		int n = 10;
		int n2 = 3;
		float f = 3.0F;
		
		System.out.println(n+n2); // 13
		System.out.println(n-n2); // 7
		System.out.println(n*n2); // 30
		System.out.println(n/n2); // 3 (몫)
		System.out.println(n/f); // 3.3333333
		System.out.println(n%n2); // 1

		// 연산결과값이 계속적으로 필요하다면?
		int result = n + n2;
		System.out.println(result);
		System.out.println(result);

	}

}
