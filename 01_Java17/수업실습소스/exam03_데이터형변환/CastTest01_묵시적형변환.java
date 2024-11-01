package exam03_데이터형변환;

public class CastTest01_묵시적형변환 {

	public static void main(String[] args) {

		//묵시적 형변환
		
		//1. byte > short > int > long > float > double
		// 큰타입 = 작은타입
		byte n = 10;
		short n2 = n;  //  short 타입에 변수 n2에 byte 타입의 n이 저장가능.
		int n3 = n2;
		long n4 = n3;
		float n5 = n4;
		double n6 = n5;
		
		// 작은타입 = 큰타입 형태는 불가능.
		int k = 20;
		//short k2 = k;  // 에러발생.
		
		// float x = 3.14; // 에러발생, 3.14는 기본타입인 double로 처리
		float x2 = 3.14F;
		
		//byte x3 = 129; // byte의 저장 범위는 -128 ~ 127임.
		
		
		//2. char > int
		char c = 'a';  // 'A': 65  'a':97
		int c2 = c;
		System.out.println(c+" "+c2);
		
		char c3 = 'A'+ 1;  // char는 연산이 가능하다.
		System.out.println(c3); // B
		
		//3. int 보다 작은 데이터형의 연산결과는 int로 반환된다.
		short a = 10;
		short b = 20;
		//short result = a + b;  // a+b 의 결과는 int로 반환됨
		
		// 4.작은 데이터와 큰 데이터의 연산결과는 큰데이터형으로 반환된다.
		int num = 10;
		float num2 = 10.4F;
		
		// int num3 = num + num2;  // 에러. num + num2 결과는 실수형으로 반환됨.
		float num3 = num + num2;
		
		// 10을 3으로 나눈 결과값 출력하기
		System.out.println( 10/3 );  // 3
		System.out.println( 10/3.0 );  // 3.3333333333
		
		
		//5. 출력할 때 문자열과 비문자열을 + 하면 문자열로 반환된다. ( 연결되어 문자열로 반환됨 )
		System.out.println("hello"+1+2+3); // hello123
		System.out.println(1+2+3+"hello"); //  6hello
		
		String mesg = "hello"+1+2+3;
		
	}

}
