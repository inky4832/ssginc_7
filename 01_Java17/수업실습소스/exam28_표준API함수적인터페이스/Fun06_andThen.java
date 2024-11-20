package exam28_표준API함수적인터페이스;

import java.util.function.Function;

public class Fun06_andThen {

	public static void main(String[] args) {
//		3) andThen() 메서드
//    - Function(*) 또는 Consumer 작업들을 연결해서 처리
//
//    예> "hello" 입력해서 글자수를 체크하고 
//        이 글자수에 + 100 하자.
//    
//       1번째 Function <String, Integer> : "hello" 입력해서 글자수 체크
//
//       2번째 Function <Integer, Integer> : 글자수에 + 100

		 Function<String, Integer> xxx = new Function<String, Integer>() {
			@Override
			public Integer apply(String t) {
				return t.length();
			}
		};
		
		Function<Integer, Integer> yyy = new Function<Integer, Integer>() {
			@Override
			public Integer apply(Integer t) {
				return t+100;
			}
		};
		
		Function<String, Integer> f1 = t-> t.length();  // 글자수 체크
		Function<Integer, Integer> f2 = t -> t+100;   //글자수에 + 100
		
		int str_len = f1.apply("hello");
		int result = f2.apply(str_len);
		System.out.println(result);
		
		//andThen() 연결
		Function<String, Integer> f3 = f1.andThen(f2); // f1의 리턴값이 f2의 입력(파라미터)값으로 사용됨.
		int result2 = f3.apply("hello");
		System.out.println(result2);
		
	}

}
