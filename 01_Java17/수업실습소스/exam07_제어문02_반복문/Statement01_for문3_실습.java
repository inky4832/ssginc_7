package exam07_제어문02_반복문;

public class Statement01_for문3_실습 {

	public static void main(String[] args) {
	
		
		
		//문제1: 1~100 반복해서 총합계를 출력하시오
		int sum=0;
		for(int n=1; n<=100; n++) {
			//System.out.println(n);
			//sum = sum + n;
			sum += n;
		}
		System.out.println("총합:" + sum);
		
		//문제2: 1~100 반복해서 짝수값의 총합계를 출력하시오
		int sum2=0;
		for(int n=1; n<=100; n++) {
			//System.out.println(n);
			if(n%2 == 0) {
				sum2 += n;
			}
		}
		System.out.println("짝수 총합:" + sum2);
		
		
		System.out.println("END");
	}
}
