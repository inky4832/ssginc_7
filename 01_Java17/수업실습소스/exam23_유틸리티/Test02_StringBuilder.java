package exam23_유틸리티;

public class Test02_StringBuilder {

	public static void main(String[] args) {
		
		// StringBuilder 만드는 방법
		
		//new 이용
		 StringBuilder builder = new StringBuilder();
		 StringBuilder builder2 = new StringBuilder("hello");
		 
		// 메서드 정리
		 System.out.println("1. 값 추가: " + builder.append("A"));  // A
		 System.out.println("1. 값 추가: " + builder.append(20));    // A20
		 System.out.println("1. 값 추가: " + builder.append(3.14));  // A203.14
		 System.out.println("1. 값 추가: " + builder.append( new char[] {'B','C'})); // A203.14BC
		 
		 
		 System.out.println("2. 값 삽입: " + builder.insert(0, "XXX")); // XXXA203.14BC
		 
		 System.out.println("3. 값 삭제: " + builder.delete(0, 3));  // A203.14BC   end-1 까지
		 
		 // 추가메서드
		 // charAt(index)
		 // indexOf(String str)
		 // length() , replace(), reverse(), substring()
		 // toString()
		 
		 // 원본 출력 : 한번 생성된 문자열이 변경된다. 따라서 문자열 가공이 많이 생기는 작업에 사용할 수 있다.
		 System.out.println("원본 출력: " + builder);  // builder.toString()
		 
		 
		 // StringBuilder -------------> String 변수에 저장해서 사용한다.
		 String s = builder.toString();
		 System.out.println(s);  // A203.14BC
		 

	}

}
