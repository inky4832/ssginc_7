package exam02;

import java.util.List;
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
				 
				DeptService service = new DeptServiceImpl();
				service.setDeptDAO(new DeptDAO());
				List<DeptDTO> list = service.selectList();
				System.out.println("부서번호 \t\t 부서명 \t\t  부서위치");
				System.out.println("--------------------------------");
				for (DeptDTO dept : list) {
					System.out.printf("%d   %s    %s \n", dept.getDeptno(), dept.getDname(), dept.getLoc());
				}
				System.out.println("--------------------------------");
				System.out.println("--------------------------------");
				
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
				scan.close();
				System.out.println("프로그램 종료");
				System.exit(0);  // 프로그램 종료
			}
		}
	}
}
