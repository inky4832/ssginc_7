package exam01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectTest {

	public static void main(String[] args) {

		  String driver ="com.mysql.cj.jdbc.Driver";
	      String url="jdbc:mysql://localhost:3306/testdb";
	      String userid="root";
	      String passwd="1234";
		
	      try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	      Connection con = null;
	      PreparedStatement pstmt = null;
	      ResultSet rs = null;
	      try {
			con = DriverManager.getConnection(url, userid, passwd);
			String sql = "select deptno as no, dname, loc from dept";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			// 행선택
			  while(rs.next()){
			     // 열선택
			     int deptno = rs.getInt("no");  // 컬럼헤더 또는 순서(1부터)
			     String dname = rs.getString(2);
			     String loc = rs.getString("loc");
			     System.out.printf("부서번호: %d , 부서명: %s , 부서위치: %s \n", deptno, dname, loc);
			  }
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(con!=null)con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} 
	      
	      
	}//end main
}//end class
