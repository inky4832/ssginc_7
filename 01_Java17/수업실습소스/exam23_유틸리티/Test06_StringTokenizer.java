package exam23_유틸리티;

import java.util.StringTokenizer;

public class Test06_StringTokenizer {

	public static void main(String[] args) throws Exception {
		
		
		 // 공백 구분자
		String s = "홍길동 이순신 유관순";
		
		StringTokenizer stk = new StringTokenizer(s);
		System.out.println(stk.nextToken());
		System.out.println(stk.nextToken());
		System.out.println(stk.nextToken());
		//System.out.println(stk.nextToken());  // java.util.NoSuchElementException 예외 발생됨.
		
		System.out.println("##########################################");
		String s2 = "홍길동/이순신/유관순";
		StringTokenizer st = new StringTokenizer(s2, "/");
		  while (st.hasMoreTokens()) {
		         System.out.println(st.nextToken());
		  }
		  
		  System.out.println("##########################################");
			String s3 = "영조,홍길동/이순신/유관순|강감찬|김홍도,정조";
			StringTokenizer st2 = new StringTokenizer(s3, "|,/"); // 구분자를 여러개 지정 가능
			  while (st2.hasMoreTokens()) {
			         System.out.println(st2.nextToken());
			  }
		  
	}
}
