package exam01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertTest2 {

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
	    	  String sql = "insert into dept (deptno, dname, loc ) values ( ?, ?, ? )";
	    	  pstmt = con.prepareStatement(sql);
	    	  // ? 에 값을 할당
	    	  pstmt.setInt(1, 42);
	    	  pstmt.setString(2, "인사");
	    	  pstmt.setString(3, "서울");
	    	  
	    	  int n = pstmt.executeUpdate();
	    	  
	    	  System.out.println(n + "개의 레코드가 생성됨.");
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
