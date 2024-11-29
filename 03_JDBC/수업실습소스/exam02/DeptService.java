package exam02;

import java.util.List;

public interface DeptService {
  
	public void setDeptDAO(DeptDAO dao);
	public abstract List<DeptDTO> selectList();
	
	public int addDept(DeptDTO dto);
	public int delDept(int deptno)
			throws RecordNotFoundException ;
}
