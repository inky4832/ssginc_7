package exam02;

// dept 테이블의 하나의 레코드 저장용도이고
// 이러한 방식으로 하나의 레코드 저장한다. 이것이 DTO(Data Transfer Object) 패턴이라고 부른다.
// 일반적으로 테이블 당 하나씩 작성된다.
public class DeptDTO {

	private int deptno;
	private String dname;
	private String loc;
	
	public DeptDTO() {}

	public DeptDTO(int deptno, String dname, String loc) {
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	@Override
	public String toString() {
		return "DeptDTO [deptno=" + deptno + ", dname=" + dname + ", loc=" + loc + "]";
	}
	
}
