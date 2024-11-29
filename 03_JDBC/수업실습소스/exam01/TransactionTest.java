package exam01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TransactionTest {

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
con.setAutoCommit(false);	    	  
	    	  // insert 문
	    	  String sql = "insert into dept (deptno, dname, loc ) values ( ?, ?, ? )";
	    	  pstmt = con.prepareStatement(sql);
	    	  pstmt.setInt(1, 44);
	    	  pstmt.setString(2, "인사");
	    	  pstmt.setString(3, "서울");
	    	  int n = pstmt.executeUpdate();
	    	  System.out.println(n + "개의 레코드가 생성됨.");
	    	  // update 문
	    	  String sql2 = "update dept set dname=?, loc=? where deptno = ? ";
	    	  pstmt = con.prepareStatement(sql2);
	    	  pstmt.setInt( 3, 41);
	    	  pstmt.setString(1, "개발");
	    	  pstmt.setString(2, "부산");
	    	  int n2 = pstmt.executeUpdate();
	    	  System.out.println(n2 + "개의 레코드가 수정됨.");
con.commit(); // insert 문와 update 문이 모두 성공했을 경우에 실행	    	  
	      }catch(SQLException e) {
	    	  try {
				con.rollback(); // insert 문와 update 문중 하나라도 실패하면 모두 취소	  
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
	    	  System.out.println("에러발생:" + e.getMessage());
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
