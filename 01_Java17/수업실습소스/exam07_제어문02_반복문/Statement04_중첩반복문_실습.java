package exam07_제어문02_반복문;

public class Statement04_중첩반복문_실습 {

	public static void main(String[] args) {
	
		
	  //문제1: 2단부터 9단까지 출력하시오
		/*
		 *  2 X 1 = 2
		 *  2 X 2 = 4
		 *  ..
		 *  2 X 9 = 18
		 *  ..
		 *  
		 *  9 X 9  = 81
		 * 
		 */
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.printf("%d X %d = %d \n", i, j , i*j);
			}
		}
		
		System.out.println("######################");
	   //문제2: 2단부터 9단에서 3단과 6단만 출력하시오
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
			  if(i==3 || i==6 ) {
				System.out.printf("%d X %d = %d \n", i, j , i*j);
			  }
			}
		}
		System.out.println("END");
	}
}
