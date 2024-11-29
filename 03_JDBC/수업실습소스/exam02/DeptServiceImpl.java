package exam02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DeptServiceImpl 
   implements DeptService {

	 String driver ="com.mysql.cj.jdbc.Driver";
     String url="jdbc:mysql://localhost:3306/testdb";
     String userid="root";
     String passwd="1234";
     
	public DeptServiceImpl() {
	      try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}//end 기본생성자

	//select 메서드
	@Override
	public void selectList() {
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(con!=null)con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} //end finally
	}//end selectList
}//end main
