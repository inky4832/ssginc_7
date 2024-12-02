import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dto.DeptDTO;

public class MyBatisMain {

	public static void main(String[] args) {

		SqlSession session = MySqlSessionFactory.getSession();
		
		// 단일행
		DeptDTO dto = session.selectOne("com.config.DeptMapper.find10");
		System.out.println(dto);
		System.out.println("##########################");
		
		DeptDTO dto2 = session.selectOne("com.config.DeptMapper.findByDeptno", 40);
		System.out.println(dto2);
		System.out.println("##########################");
		
		DeptDTO searchDTO = new DeptDTO();
		searchDTO.setDeptno(10);
		searchDTO.setDname("ACCOUNTING");
		DeptDTO dto3 = 
				session.selectOne("com.config.DeptMapper.findByDeptnoAndDname",
						searchDTO );
		System.out.println(dto3);
		System.out.println("##########################");
		
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("xxx", 10);
		map.put("yyy", "ACCOUNTING");
		DeptDTO dto4 = 
				session.selectOne("com.config.DeptMapper.findByHashmap", map);
		System.out.println(dto4);
		System.out.println("##########################");
		
		// 복수행
		List<DeptDTO> list = session.selectList("com.config.DeptMapper.findAll");
		System.out.println(list);
		System.out.println("##########################");
		List<DeptDTO> list2 = 
				session.selectList("com.config.DeptMapper.findByDname", "인사");
		System.out.println(list2);
		
		//자원반납
		session.close();
	}
}
