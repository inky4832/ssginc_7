package exam05_연산자;

public class Operator06_3항연산 {

	public static void main(String[] args) {
		
		// 3항 연산자
		
		int num = 30;
		
		//문제1: num 값이 5보다 크면 변수에 100 을 저장하고 작으면 200 저장?
		int result = (num>5)?100:200;
		System.out.println(result);
		
		//문제2: 주어진 문자열의 길이가 3보다 크면 "길다" 반환하고 작으면 "짧다" 반환?
		String name = "hello";
		System.out.println("문자열길이:" + name.length());
		
		String result2 = (name.length() > 3)?"길다":"짧다";
		System.out.println(result2);
		
		// 중첩 가능
		int result3 = (num>5)? (num < 10)?100:200 :300;
		System.out.println(result3);
	}

}
