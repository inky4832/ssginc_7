package exam05_연산자;

public class Operator03_비교연산 {

	public static void main(String[] args) {
		
		// 비교연산자
		
		int n = 10;
		int n2 = 3;
	
	    System.out.println(n==n2);
	    System.out.println(n!=n2);
	    System.out.println(n>n2);
	    System.out.println(n>=n2);
	    System.out.println(n<n2);
	    System.out.println(n<=n2);
	    
	    // 비교연산자 결과를 재사용?
	    boolean result = n==n2;
	    System.out.println(result);
	    System.out.println(result);
	}

}
