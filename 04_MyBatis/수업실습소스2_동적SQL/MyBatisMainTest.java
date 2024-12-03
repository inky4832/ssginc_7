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
//		System.out.println("2. 멀티 delete ####################################");
//		List<Integer> delList = Arrays.asList(1001, 1002);
//		int n2 = session.delete("com.config.EmpMapper.deleteMulti", delList);
//		session.commit();
//		System.out.println(n2 +" 개가 삭제됨");
//		System.out.println("####################################");
		
		//3. 멀티 select
//		System.out.println("3. 멀티 select ####################################");
//		List<Integer> selectList = Arrays.asList(7369, 7499, 7521);
//		List<EmpDTO>  selectMultiList = session.selectList("com.config.EmpMapper.selectMulti", selectList);
//		System.out.println(selectMultiList);
		System.out.println("####################################");
		
		//4. 동적 조건 지정
//		System.out.println("4. 동적 조건 지정1 ( 조건 하나 )####################################");
//		EmpDTO dto = new EmpDTO();
//		//dto.setJob("SALESMAN");
//		List<EmpDTO> selectMultiList2 = session.selectList("com.config.EmpMapper.selectIf", dto);
//		System.out.println(selectMultiList2);
//		System.out.println(selectMultiList2.size());
		
//		System.out.println("4. 동적 조건 지정2 ( 여러개 )####################################");
//		EmpDTO dto2 = new EmpDTO();
////		dto2.setJob("SALESMAN");
////		dto2.setSal(1000);
//		
//		List<EmpDTO> selectMultiList3 = session.selectList("com.config.EmpMapper.selectIf2", dto2);
//		System.out.println(selectMultiList3);
//		System.out.println(selectMultiList3.size());
		
		
		// 5. 동적수정
//		EmpDTO dto3 = new EmpDTO();
////dto3.setSal(5000);
//dto3.setMgr(7369);
//		dto3.setEmpno(1003);
//		int n3 = session.update("com.config.EmpMapper.updateDynamic", dto3);
//		session.commit();
//		System.out.println(n3 +"가 수정됨");
		
		//6. 다중 조건
//		EmpDTO dto4 = new EmpDTO();
//		dto4.setJob("MANAGER");  // CLERK , MANAGER
//		List<EmpDTO> chooseList = session.selectList("com.config.EmpMapper.selectChoose", dto4);
//		for (EmpDTO empDTO : chooseList) {
//		   System.out.println(empDTO);
//	    }

		//7. 단일값
		int cnt = session.selectOne("com.config.EmpMapper.singleValue");
		System.out.println("count(*):" + cnt );
		
		System.out.println("####################################");
//		List<EmpDTO> list = session.selectList("com.config.EmpMapper.findAll");
//		for (EmpDTO empDTO : list) {
//			System.out.println(empDTO);
//		}
		
	
		
	
		session.close();
	}//end main
}//end class
