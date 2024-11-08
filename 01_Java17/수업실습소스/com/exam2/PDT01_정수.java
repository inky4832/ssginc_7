package com.exam2;

public class PDT01_정수 {

	public static void main(String[] args) {
		// 기본형 데이터: 정수 데이터 정리
		
		//1. 10진수 데이터 표현
		System.out.println(100);
		System.out.println(-100);
		System.out.println(0);

		//2. 2진수 데이터 표현 ( 0|1이용, 0b 표현 )
		System.out.println(0b01);  // 1
		System.out.println(0b10);  // 2
		System.out.println(0b11);  // 3
		System.out.println(0b100); // 4
		System.out.println("#####################");
		//3. 8진수 데이터 표현 ( 0~7 이용, 0 표현 )
		System.out.println(01);  // 1
		System.out.println(02);  // 1
		System.out.println(03);  // 1
		System.out.println(04);  // 1
		System.out.println(05);  // 1
		System.out.println(06);  // 1
		System.out.println(07);  // 1
		System.out.println("#####################");
		//4. 16진수 데이터 표현 ( 0~9,A,B,C,D,E,F 이용, 0x 표현 )
		System.out.println(0x1);  // 1
		System.out.println(0x2);  // 2
		System.out.println(0x9);  // 9
		System.out.println(0xA);  // 10
		System.out.println(0xB);  // 11
		System.out.println(0xC);  // 12
		System.out.println(0xD);  // 13
		System.out.println(0xE);  // 14
		System.out.println(0xF);  // 15
	
		// long타입으로 지정하는 방법
		System.out.println(100L);  // 100L 은 정수형 long 타입으로 처리됨.
	
	}

}
