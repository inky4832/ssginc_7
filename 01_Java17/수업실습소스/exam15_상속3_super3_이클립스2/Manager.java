package exam15_상속3_super3_이클립스2;

public class Manager extends Employee{

	String depart;
	
	// 모든 데이터 한번에 리턴하는 메서드
	@Override
	public String getEmployee() {
		return super.getEmployee()+"\t"+depart;
	}
	
	
	public Manager() {
		super();
	}
	public Manager(String name, int salary) {
		super(name, salary);
	}
	public Manager(String name, int salary, String depart) {
		super(name, salary);
		this.depart = depart;
	}
	public String getDepart() {
		return depart;
	}
	public void setDepart(String depart) {
		this.depart = depart;
	}
	
	
}
