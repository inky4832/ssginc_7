package exam02;

import java.util.Scanner;

public class DeptMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("1. select");
			System.out.println("2. insert");
			System.out.println("3. update");
			System.out.println("4. delete");
			System.out.println("0. 종료");
			System.out.println("----------------");
			
			String input_num = scan.next();
			if("1".equals(input_num)) {
				// 1. select 작업
				System.out.println("select 작업");
			}else if("2".equals(input_num)) {
				// 2. insert
				System.out.println("insert 작업");
			}else if("3".equals(input_num)) {
				// 3. update
				System.out.println("update 작업");
			}else if("4".equals(input_num)) {
				// 4. delete
				System.out.println("delete 작업");
			}else {
			    // 0. 종료
				System.out.println("프로그램 종료");
				System.exit(0);  // 프로그램 종료
			}
		}
		
		
		
		

	}

}
