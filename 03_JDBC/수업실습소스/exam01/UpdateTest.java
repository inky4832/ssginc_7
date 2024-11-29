package exam01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateTest {

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
	      try {
	    	  con = DriverManager.getConnection(url, userid, passwd);
	    	  String sql = "update dept set dname=?, loc=? where deptno = ? ";
	    	  pstmt = con.prepareStatement(sql);
	    	  // ? 에 값을 할당
	    	  pstmt.setInt( 3, 44);
	    	  pstmt.setString(1, "관리");
	    	  pstmt.setString(2, "제주");
	    	  
	    	  int n = pstmt.executeUpdate();
	    	  
	    	  System.out.println(n + "개의 레코드가 수정됨.");
	      }catch(SQLException e) {
	    	  e.printStackTrace();
	      }finally {
	    	    try {
					if(pstmt!=null)pstmt.close();
					if(con!=null)con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		  }//end finally
	}//end main
}//end class
