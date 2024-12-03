import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dto.EmpDTO;

public class MyBatisMainTest2_paging {

	public static void main(String[] args) {

		SqlSession session = MySqlSessionFactory.getSession();
	
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("1. 목록보기");
			System.out.println("2. 종료");
			String n = scan.next();
			if("1".equals(n)) {
				System.out.println("페이지 번호를 입력하시오");
				int curPage = scan.nextInt(); // 현재 페이지 번호
				int perPage = 3;              // 페이지당 보여줄 레코드 갯수
				int skip = (curPage-1)*perPage; // skip할 레코드 갯수
				List<EmpDTO> list = 
						session.selectList("com.config.EmpMapper.paging", null , 
								new RowBounds(skip, perPage));
				for (EmpDTO empDTO : list) {
					System.out.println(empDTO);
				}
			}else {
				System.out.println("프로그램 종료");
				System.exit(0);
				session.close();
			}
		}
		
	}//end main
}//end class
