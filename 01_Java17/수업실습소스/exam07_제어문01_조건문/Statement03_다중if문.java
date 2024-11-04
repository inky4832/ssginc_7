package exam07_제어문01_조건문;

import java.util.Scanner;

public class Statement03_다중if문 {

	public static void main(String[] args) {
		
		// 다중 if문: 여러번 조건식을 이용해서 비교할 때.
		
		// 문제1: 키보드로 정수값을 입력받고 입력받은 등급을 구하시오. 단 입력정수값은 1~100 범위만 입력가능함.
		/*
		 *   90~100: A등급
		 *   80~89: B등급
		 *   70~79: C등급
		 *   나머지(1~69): D등급
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수값을 입력하시오");
		int n = scan.nextInt();
		
		if(n >= 90 ) {
			System.out.println("A 등급");
		}else if( n >= 80 ) {
			System.out.println("B 등급");			
		}else if( n >= 70  ) {
			System.out.println("C 등급");			
		}else {
			System.out.println("D 등급");						
		}
		
//		if(n >= 90 && n <= 100) {
//			System.out.println("A 등급");
//		}else if( n >= 80 && n <= 89 ) {
//			System.out.println("B 등급");			
//		}else if( n >= 70 && n <= 79 ) {
//			System.out.println("C 등급");			
//		}else {
//			System.out.println("D 등급");						
//		}
		
		System.out.println("END");						
	}
}
