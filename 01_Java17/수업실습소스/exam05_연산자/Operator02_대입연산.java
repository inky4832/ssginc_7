package exam05_연산자;

public class Operator02_대입연산 {

	public static void main(String[] args) {
		
		// 대입연산자
		
		int n = 10;
		int n2 = 3;
	
		n += n2;  // n=n+n2;
		System.out.println(n +" " + n2); // 13 3
		n -= n2;  // n=n-n2;
		System.out.println(n +" " + n2); // 10 3
		n *= n2;  // n=n*n2;
		System.out.println(n +" " + n2); // 30 3
		n /= n2;  // n=n/n2;
		System.out.println(n +" " + n2); // 10 3
		n %= n2;  // n=n%n2;
		System.out.println(n +" " + n2); // 1 3
	}

}
