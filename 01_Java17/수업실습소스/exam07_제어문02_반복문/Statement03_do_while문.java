package exam07_제어문02_반복문;

public class Statement03_do_while문 {

	public static void main(String[] args) {
	
		// for 문
		for( int n=1 ; n < 6  ; n++) {
			System.out.println("hello");
		}
		
		
		// while 문
		int n=1 ;
		while(n < 6) {
			System.out.println("world");
			 n++;
		}
		
		// do~while문
		int n2=1 ;
		do {
			System.out.println("happy");
			 n2++;
		}while(n2 < 6);
		
		
		
		System.out.println("END");
	}
}
