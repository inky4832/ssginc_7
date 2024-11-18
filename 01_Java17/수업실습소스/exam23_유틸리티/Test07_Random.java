package exam23_유틸리티;

import java.util.Random;

public class Test07_Random {

	public static void main(String[] args) throws Exception {
		
		Random ran = new Random();
		
		System.out.println("정수값:" + ran.nextInt());
		System.out.println("정수값(범위):" + ran.nextInt(3));  // 0~2
		
		System.out.println("실수값:" + ran.nextFloat());
		System.out.println("논리값:" + ran.nextBoolean());
		  
		Random ran2 = new Random(1234);  // seed 값을 고정하면 항상 고정된 랜덤값이 반환됨. 
		System.out.println("고정된 정수값:" + ran2.nextInt());
	}
}
