package exam23_유틸리티;

public class StringTest {

	public static void main(String[] args) {
		
		// String 만드는 방법
		
		//1. 리터럴 이용 ( 동일한 문자열인 경우에는 한번 만 생성됨 )
		 String s = "hello";
		 String s2 = "hello";
		
		 System.out.println(s == s2); // 주소값이 같냐 , true
		 System.out.println(s.equals(s2)); // 문자열이 같냐 , true
		 System.out.println("##############################");
		 
		 
		//2. new 이용 ( 동일한 문자열인 경우에도 매번 새롭게 생성됨, heap 메모리에 생성 )
		 String x = new String("hello"); 
		 String x2 = new String("hello"); 
		 System.out.println(x == x2); // 주소값이 같냐, false
		 System.out.println(x.equals(x2)); // 문자열이 같냐 , true
		 
		 

	}

}
