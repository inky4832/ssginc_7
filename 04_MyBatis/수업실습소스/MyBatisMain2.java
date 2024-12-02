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
		
//		DeptDTO dto = new DeptDTO(60, "홍보", "부산");
//		int n2 = session.insert("addDept2",dto);
//		session.commit();
//		System.out.println(n2);
		
		// update 문
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("deptno", 60);
		map.put("dname", "홍보부");
		map.put("loc", "포항");
		
		int n3 = session.update("updateDept", map);
		session.commit();
		System.out.println(n3);
		System.out.println("#######################");
		// delete 문
		int n4 = session.delete("deleteDept", "관리");
		session.commit();
		System.out.println(n4);
		
		//자원반납
		session.close();
	}
}
