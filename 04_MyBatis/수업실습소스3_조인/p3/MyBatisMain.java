package p3;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

public class MyBatisMain {

	public static void main(String[] args) {

		SqlSession session = MySqlSessionFactory.getSession();
		
		List<DeptDTO> list =
				session.selectList("com.config.EmpMapper.empDeptJoin");
		for (DeptDTO empDTO : list) {
			System.out.println(empDTO);
		}
		
		
		
	}
}
