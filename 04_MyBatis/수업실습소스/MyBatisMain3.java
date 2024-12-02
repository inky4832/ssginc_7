import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dto.DeptDTO;

public class MyBatisMain3 {

	public static void main(String[] args) {

		SqlSession session = MySqlSessionFactory.getSession();
		
		
		// 복수행
		List<DeptDTO> list = session.selectList("com.config.DeptMapper.findAll");
		System.out.println(list);
		System.out.println("##########################");
	
		List<DeptDTO> list2 = session.selectList("com.config.DeptMapper2.findAll");
		System.out.println(list2);
		System.out.println("##########################");
		//자원반납
		session.close();
	}
}
