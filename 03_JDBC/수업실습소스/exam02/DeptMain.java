package exam02;

import java.util.List;
import java.util.Scanner;

public class DeptMain {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("1. 부서 목록 보기");
			System.out.println("2. 부서 추가");
			System.out.println("3. 부서 수정");
			System.out.println("4. 부서 삭제");
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
				System.out.println("부서번호를 입력하시오.");
				int deptno = scan.nextInt();
				System.out.println("부서명를 입력하시오.");
				String dname = scan.next();
				System.out.println("부서위치를 입력하시오.");
				String loc = scan.next();
				
				// dto -----------> DeptDAO 까지 전달해야됨.
				DeptDTO dto = new DeptDTO(deptno, dname, loc);
				
				DeptService service = new DeptServiceImpl();
				service.setDeptDAO(new DeptDAO());
				int n = service.addDept(dto);
				System.out.println(n+" 개가 생성됨.");
				
			}else if("3".equals(input_num)) {
				// 3. update
				System.out.println("update 작업");
				
			}else if("4".equals(input_num)) {
				System.out.println("삭제할 부서번호를 입력하시오.");
				int deptno = scan.nextInt();
				
				DeptService service = new DeptServiceImpl();
				service.setDeptDAO(new DeptDAO());
				
				int n = service.delDept(deptno);
				System.out.println(n+" 개가 삭제됨.");
				
			}else {
			    // 0. 종료
				scan.close();
				System.out.println("프로그램 종료");
				System.exit(0);  // 프로그램 종료
			}
		}
	}
}
