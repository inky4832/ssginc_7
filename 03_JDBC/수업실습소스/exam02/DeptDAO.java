package exam02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DeptDAO {

	public void selectList(Connection con) { // Service로부터 전달받음.
		  PreparedStatement pstmt = null;
	      ResultSet rs = null;
	      try {
	    	  String sql = "select deptno as no, dname, loc from dept";
				pstmt = con.prepareStatement(sql);
				rs = pstmt.executeQuery();
				  while(rs.next()){
				     int deptno = rs.getInt("no");  // 컬럼헤더 또는 순서(1부터)
				     String dname = rs.getString(2);
				     String loc = rs.getString("loc");
				     System.out.printf("부서번호: %d , 부서명: %s , 부서위치: %s \n", deptno, dname, loc);
				  }
	      }catch(SQLException e) {
	    	  e.printStackTrace();
	      }finally {
				try {
					if(rs!=null)rs.close();
					if(pstmt!=null)pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			} //end finally
	      
	}//end selectList
}
