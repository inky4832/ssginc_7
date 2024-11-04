package exam06_표준입력_Scanner;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) { 
	
	
		Scanner scan = new Scanner(System.in); // 표준입력인 키보드에서 데이터 읽기
		
		System.out.println("나이를 입력하세요");
		int n = scan.nextInt();
		
		System.out.println("이름을 입력하세요");
		String s = scan.next();
		
		System.out.println("입력된 나이:" + n);
		System.out.println("입력된 이름:" + s);
		
		scan.close();  // 
	}

}
