package exam07_제어문02_반복문;

public class Statement01_for문2 {

	public static void main(String[] args) {
	
		// 다양한 형태
		for( int n=0 ; n < 5  ; n++) {
			System.out.println("hello: " + n);
		}
		
		for( int n=10 ; n > 5  ; n--) {
			System.out.println("world: " + n);
		}
		
		for( int n=0 ; n < 10  ; n+=2) {
			System.out.println("Happy: " + n);
		}
		
		for( int n=0, m=0 ; n < 10 && m < 6 ; n+=2, m++) {
			System.out.println("Java: " + n);
		}
		
		
		System.out.println("END");
	}
}
