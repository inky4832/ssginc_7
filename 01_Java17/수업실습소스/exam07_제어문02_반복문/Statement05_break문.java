package exam07_제어문02_반복문;

public class Statement05_break문 {

	public static void main(String[] args) {
	
		
	  // break 문: 반복문을 빠져 나올 때 사용
		
		// n이 3일때 반복문을 빠져나와라. ( 반복문을 중지하자)
		for( int n=1 ; n < 6  ; n++) {
			if(n==3)break;
			System.out.println("hello" + n);
		}
		
		System.out.println("END");
	}
}
