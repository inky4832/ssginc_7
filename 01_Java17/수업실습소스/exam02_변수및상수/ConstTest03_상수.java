package exam02_변수및상수;

public class ConstTest03_상수 {

	// 다음과 같이 public static final 지정하는 방법이 권장함.
	public static final int NUM2 = 20;
	
	public static void main(String[] args) {
	
		// 상수
		final int NUM = 10;
	   
//		NUM = 20;  // 상수는 값 변경 불가
	
		System.out.println(NUM);
		
	}//end main 메서드

}
