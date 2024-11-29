package exam02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class DeptServiceImpl 
   implements DeptService {

	 String driver ="com.mysql.cj.jdbc.Driver";
     String url="jdbc:mysql://localhost:3306/testdb";
     String userid="root";
     String passwd="1234";
     
     DeptDAO dao;
     // DeptMain에서 DeptDAO 전달.
     public void setDeptDAO(DeptDAO dao) {
    	 this.dao = dao;
     }
     
	public DeptServiceImpl() {
	      try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}//end 기본생성자

	//select 메서드
	@Override
	public List<DeptDTO> selectList() {
		List<DeptDTO> list = null;
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			// DeptDAO 연동
			list = dao.selectList(con);
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(con!=null)con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} //end finally
		return list;
	}//end selectList

	@Override
	public int addDept(DeptDTO dto) throws DuplicatedDeptnoException{
		int n = 0;
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			// DeptDAO 연동
			n = dao.addDept(con, dto);
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(con!=null)con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} //end finally
		return n;
	}

	@Override
	public int delDept(int deptno) throws RecordNotFoundException{
		int n = 0;
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			// DeptDAO 연동
			n = dao.delDept(con, deptno);
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(con!=null)con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} //end finally
		return n;
	}
}//end main
