package exam24_예외처리;

import java.util.Random;

class MyRandom{
	
	public int int_random() throws Exception{
		Random rand = new Random();
		int n = rand.nextInt(3); // 0~2
		System.out.println("n:" + n);
		// 0이 나오면 예외라고 가정하자.
//		if(n==0) throw new RuntimeException("0 이 나와서 예외발생"); // compile unchecked 계열
		if(n==0) throw new Exception("0 이 나와서 예외발생");  // compile checked 계열. 반드시 try~catch 또는 throws 필요
		return n;
	}
}
public class ExceptionTest5_명시적예외발생_throw {
	public static void main(String[] args) {
		MyRandom m = new MyRandom();
		try {
			int num = m.int_random();
		} catch (Exception e) {
			System.out.println(e.getMessage());  // 
		}
		System.out.println("프로그램 정상종료");
	}
}
