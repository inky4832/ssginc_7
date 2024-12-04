import java.util.List;
import java.util.Scanner;

import com.dao.EmpDAO;
import com.dto.EmpDTO;
import com.service.EmpService;
import com.service.EmpServiceImpl;



public class EmpMain {

	public static void main(String[] args) {

		EmpService service = new EmpServiceImpl();
		service.setDao(new EmpDAO());
		
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("----------------");
			System.out.println("1. 사원 목록 보기");
			System.out.println("2. 사원 검색");
			System.out.println("3. 사원 추가");
			System.out.println("4. 사원 수정");
			System.out.println("5. 사원 삭제");
			System.out.println("0. 종료");
			System.out.println("----------------");
			String input_num = scan.next();
			if("1".equals(input_num)) {
				
				List<EmpDTO> list = service.findAll();
				for (EmpDTO empDTO : list) {
					System.out.println(empDTO);
				}
				
			}else if("2".equals(input_num)) {
				System.out.println("검색할 사원명을 입력하시오");
				String ename = scan.next();
				List<EmpDTO> list = service.findByLikeEname(ename);
				for (EmpDTO empDTO : list) {
					System.out.println(empDTO);
				}
				
			}else if("3".equals(input_num)) {
			}else if("4".equals(input_num)) {
			}else if("5".equals(input_num)) {
				System.out.println("삭제할 사원번호를 입력하시오");
				int empno = scan.nextInt();
				int n = service.delete(empno);
				if(n==1) System.out.println(empno + " 사원 삭제 성공");
			}else {
			    // 0. 종료
				scan.close();
				System.out.println("프로그램 종료");
				System.exit(0);  // 프로그램 종료
			}
		}//end while
		
	}//end main
}//end class
