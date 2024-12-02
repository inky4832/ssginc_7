import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dto.DeptDTO;

public class MyBatisMain2 {

	public static void main(String[] args) {

		SqlSession session = MySqlSessionFactory.getSession();
		
		// insert 문
		//int n = session.insert("addDept");
		//session.commit(); // 반드시 명시적으로 지정필수
		//System.out.println(n);
		
		DeptDTO dto = new DeptDTO(60, "홍보", "부산");
		int n2 = session.insert("addDept2",dto);
		session.commit();
		System.out.println(n2);
	}
}
