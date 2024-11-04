package exam05_연산자;

public class Operator04_논리연산 {

	public static void main(String[] args) {
		
		// 논리연산자
		
	    // 1. and 연산자
		System.out.println(true && true);   // true
		System.out.println(true && false);  // false
		System.out.println(false && true);  // false
		System.out.println(false && false); // false
		
		System.out.println();
		
		// 2. or 연산자
		System.out.println(true || true);   //  true
		System.out.println(true || false);  //  true 
		System.out.println(false || true);  //  true
		System.out.println(false || false); //  false
		
	System.out.println();
		
		// 3. not 연산자
	    System.out.println(!true);    // false
	    System.out.println(!false);   // true
	}

}
