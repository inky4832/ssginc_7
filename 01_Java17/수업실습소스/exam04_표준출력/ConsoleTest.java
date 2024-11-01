package exam04_표준출력;

public class ConsoleTest {

	public static void main(String[] args) {
		// 표준 출력
		
		//1. System.out.println(값)
		System.out.println("hello");
		System.out.println(2);
		
		//만약에 여러 데이터를 출력?  + 이용해서 연결하면 됨.
		System.out.println("hello" + 2);
		System.out.println("hello" + "\t" + 2);
		
		System.out.println();
		
		//2. System.out.print(값)
		System.out.print("hello");
		System.out.print(2);
		System.out.println();
		
		
		// print만 사용해서 다음 줄에 출력?
		System.out.print("world\n");
		System.out.print(2);
		
		System.out.println();
		
		// 3.  System.out.printf("형식문자", 값, 값2, ... );
		String name = "홍길동";
		int age = 20;
		float height = 178.3689F;
		boolean isMarried = true;
		
		// 출력 포맷?  이름: 홍길동 , 나이: 20 , 결혼:true
		System.out.println("이름:" + name +" , 나이:" + age +" , 결혼: " +  isMarried +" 키:"+ height);
		
		System.out.printf("이름:%s, 나이: %d, 결혼: %b, 키: %.2f  \n", name, age, isMarried, height);
		System.out.printf("이름:%s, 나이: %d, 결혼: %b, 키: %.2f", name, age, isMarried, height);
	}

}
