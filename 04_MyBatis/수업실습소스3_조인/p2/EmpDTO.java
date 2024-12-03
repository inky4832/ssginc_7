package p2;


// emp 테이블의 레코드 저장
public class EmpDTO {

	private int empno;
	private String username; // 컬럼명은 ename
	private String job;
	private int mgr;
	private String hiredate;  // 날짜데이터 가공할려면 LocalDate 타입으로 지정한다.
	private int salary;      // 컬럼명은 sal
	private int commission;  // 컬럼명은 commission
	//private int deptno;
	
	// 1:1 관계
	DeptDTO dept;
	
	public EmpDTO() {}

	public EmpDTO(int empno, String username, String job, int mgr, String hiredate, int salary, int commission,
			DeptDTO dept) {
		this.empno = empno;
		this.username = username;
		this.job = job;
		this.mgr = mgr;
		this.hiredate = hiredate;
		this.salary = salary;
		this.commission = commission;
		this.dept = dept;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getMgr() {
		return mgr;
	}

	public void setMgr(int mgr) {
		this.mgr = mgr;
	}

	public String getHiredate() {
		return hiredate;
	}

	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getCommission() {
		return commission;
	}

	public void setCommission(int commission) {
		this.commission = commission;
	}

	public DeptDTO getDept() {
		return dept;
	}

	public void setDept(DeptDTO dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "EmpDTO [empno=" + empno + ", username=" + username + ", job=" + job + ", mgr=" + mgr + ", hiredate="
				+ hiredate + ", salary=" + salary + ", commission=" + commission + ", dept=" + dept + "]";
	}

	
}
