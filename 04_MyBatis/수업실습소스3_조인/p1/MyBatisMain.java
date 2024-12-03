package p1;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

public class MyBatisMain {

	public static void main(String[] args) {

		SqlSession session = MySqlSessionFactory.getSession();
		List<EmpDTO> list = session.selectList("com.config.EmpMapper.findAll2");
		for (EmpDTO empDTO : list) {
			System.out.println(empDTO);
		}
	}
}
