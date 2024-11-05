package exam07_제어문02_반복문;

public class Statement02_while문2 {

	public static void main(String[] args) {
	
		
		// // 다양한 형태
		
		int n=1 ;
		while(n < 3) {
			System.out.println("world" + n);
			 n++;
		}
		
		int n2=10 ;
		while(n2 > 7) {
			System.out.println("hello"+n2);
			 n2--;
		}
		
		int n3=1 ;
		int m=1 ;
		
		while(n3 > 2 && m > 2) {
			System.out.println("happy"+n3+ "\t" + m);
			 n3++;
			 m++;
		}
		
		System.out.println("END");
	}
}
