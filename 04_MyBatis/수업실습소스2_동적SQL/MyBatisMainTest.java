import java.util.Arrays;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dto.EmpDTO;

public class MyBatisMainTest {

	public static void main(String[] args) {

		SqlSession session = MySqlSessionFactory.getSession();
		
		//1. 멀티 insert 
//		EmpDTO e1 = new EmpDTO(1001, "홍길동1", "SALESMAN", 7698, null, 500, 100, 30);
//		EmpDTO e2 = new EmpDTO(1002, "홍길동2", "SALESMAN", 7698, null, 500, 100, 30);
//		EmpDTO e3 = new EmpDTO(1003, "홍길동3", "SALESMAN", 7698, null, 500, 100, 30);
//		
//		List<EmpDTO> multiList = Arrays.asList(e1, e2, e3); 
//		int n = session.insert("com.config.EmpMapper.insertMulti", multiList);
//		session.commit();
//		System.out.println(n +" 개가 저장됨");
		
		
		//2. 멀티 delete
		List<Integer> delList = Arrays.asList(1001, 1002);
		int n2 = session.delete("com.config.EmpMapper.deleteMulti", delList);
		session.commit();
		System.out.println(n2 +" 개가 삭제됨");
		System.out.println("####################################");
		
		//3. 멀티 select
		List<Integer> selectList = Arrays.asList(7369, 7499, 7521);
		List<EmpDTO>  selectMultiList = session.selectList("com.config.EmpMapper.selectMulti", selectList);
		System.out.println(selectMultiList);
		
		
		System.out.println("####################################");
		List<EmpDTO> list = session.selectList("com.config.EmpMapper.findAll");
		for (EmpDTO empDTO : list) {
			System.out.println(empDTO);
		}
		
	
		
	
		session.close();
	}//end main
}//end class
