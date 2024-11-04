package exam07_제어문01_조건문;

import java.util.Scanner;

public class Statement02_if_else문2_실습 {

	public static void main(String[] args) {
		
		// if~else문 : 조건식(true/false) 결과에 따라서 실행되는 문장이 달라지는 경우.
		
		// 문제1: 키보드로 정수값을 입력받고 입력값과 짝수 인지 홀수인지 출력하시오.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수값을 입력하시오");
		int n = scan.nextInt();
		
		if(n%2 == 0) {
//			System.out.println("입력값:"+n+" 짝수입니다.");
			System.out.printf("입력값: %d 짝수입니다.\n", n);
		}else {
			System.out.println("입력값:"+n+" 홀수입니다.");
		}
		System.out.println("프로그램 종료");
	}
}
