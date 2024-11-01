package exam02_변수및상수;

public class VariableTest01 {

	public static void main(String[] args) {
		
		// 변수 사용 문법
		
		//1. 변수선언
		int n;
		char c;
		String s;
		
		//2. 변수 초기화
		n = 10;
		c = '남';
		s = "홍길동";
		
		//3. 값변경 및 사용(출력)
		n = 20;
		System.out.println(n);
		System.out.println(c);
		System.out.println(s);

		
		// 변수 선언과 초기화를 한꺼번에
		int num = 10;
		char c2 = '여';
		String s2 ="이순신";
		
		System.out.println(num);
		System.out.println(c2);
		System.out.println(s2);
		
//		int x=1;
//		int x2=2;
//		int x3;
		
//		int x,x2,x3;      // 권장안함
		int x=1,x2=2,x3;  // 권장안함
		
	}

}
