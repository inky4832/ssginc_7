package exam07_제어문02_반복문;

public class Statement06_continue문 {

	public static void main(String[] args) {
	
		
	  // continue 문: 반복처리시 특정 횟차에서 문장을 skip 할때 사용
		
		// n이 3일때는 B와 C를 제외해서 출력하시오 
		for( int n=1 ; n < 6  ; n++) {
			System.out.println("A" + n);
			if(n==3)continue;
			System.out.println("B" + n);
			System.out.println("C" + n);
		}
		
		System.out.println("END");
	}
}
