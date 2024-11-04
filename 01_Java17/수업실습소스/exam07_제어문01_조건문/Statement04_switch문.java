package exam07_제어문01_조건문;

import java.util.Scanner;

public class Statement04_switch문 {

	public static void main(String[] args) {
		
		// switch 문 : 다중 if문 처럼 조건이 여러 개인 경우 사용됨. 
		//            내부적으로 == 사용하기 때문에 동등비교 경우에만 사용한다.
		//  case에 지정하는 값의 데이터 타입은 6개만 가능하고 유일해야 된다.
        //	( byte, short, int, char, String, enum )
		
		int num = 10;
		
		switch(num) {
			case 5: System.out.println("5"); break;
			case 10: System.out.println("10"); break;
			case 15: System.out.println("15"); break;
			default: System.out.println("default1");
		}
		
		char c = 'A';
		switch (c) {
			case 'a':System.out.println("a"); break;
			case 'b':System.out.println("b"); break;
			default:System.out.println("default2"); 
		}
		
		String s = "Mon";
		switch (s) {
			case "Mon":System.out.println("Mon"); break;
			case "Tue":System.out.println("Tue"); break;
			default:System.out.println("default3"); 
		}
		
	
		System.out.println("END");
		
	}
}
