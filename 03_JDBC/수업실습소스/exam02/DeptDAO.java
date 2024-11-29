package exam02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DeptDAO {

	public List<DeptDTO> selectList(Connection con) { // Service로부터 전달받음.
		  // DTO 를 누적할 컬렉션
		  List<DeptDTO> list = new ArrayList<DeptDTO>();
		  
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
				     // 하나의 레코드를 DTO 저장
				     DeptDTO dto = new DeptDTO(deptno, dname, loc);
				     // 누적
				     list.add(dto);
				  }//end while
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
	     return list; // 누적된 리스트를 Service로 리턴해줌.
	}//end selectList
	
	public int addDept(Connection con, DeptDTO dto) {
		int n = 0;
		 PreparedStatement pstmt = null;
	      try {
	    	  String sql = "insert into dept (deptno, dname, loc ) values ( ?, ?, ? )";
	    	  pstmt = con.prepareStatement(sql);
	    	  pstmt.setInt(1, dto.getDeptno());
	    	  pstmt.setString(2, dto.getDname());
	    	  pstmt.setString(3, dto.getLoc());
	    	  n = pstmt.executeUpdate();
	      }catch(SQLException e) {
	    	  e.printStackTrace();
	      }finally {
	    	    try {
					if(pstmt!=null)pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		  }//end finally
		return n;
	}//end addDept
	public int delDept(Connection con, int deptno) {
	
		int n = 0;
		 PreparedStatement pstmt = null;
	      try {
	    	  String sql = "delete from dept where deptno = ?";
	    	  pstmt = con.prepareStatement(sql);
	    	  pstmt.setInt(1, deptno);
	    	  n = pstmt.executeUpdate();
	      }catch(SQLException e) {
	    	  e.printStackTrace();
	      }finally {
	    	    try {
					if(pstmt!=null)pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		  }//end finally
		return n;
	}
}
