package exam08_배열;

public class ArrayTest01_1차원배열 {

	public static void main(String[] args) {

		// 배열 사용 문법
		
		//1 배열 선언 : 데이터형 [] 변수;
		
		int [] num; // num 변수는 참조형, 로컬변수, 메모리: stack
		
		//2. 배열 생성:  변수 = new 데이터형[크기];
		
		num = new int[5];  // 메모리: heap , 자동으로 초기화됨.
		
		//3. 요소 접근
		// 배열초기화
		num[0]=10;
		num[1]=20;
		num[2]=30;
		num[3]=40;
		num[4]=50;
		
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
		System.out.println(num[3]);
		System.out.println(num[4]);
		//System.out.println(num[5]);
		
		System.out.println("##################");
		// 일반 for문
		for(int idx=0; idx < num.length; idx++) {
			System.out.println(num[idx]);
		}
		
		System.out.println("##################");
		// foreach 문 
		for(int n: num) {
			System.out.println(n);
		}
		
		// 배열선언과 배열생성 한꺼번에 
		int [] num2 = new int[3];
		
		// 배열 길이
		System.out.println(num.length); // 5
	}

}
