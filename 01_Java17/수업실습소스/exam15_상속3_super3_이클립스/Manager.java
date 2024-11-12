package exam15_상속3_super3_이클립스;

public class Manager extends Employee {

	String depart; // Manager 에서 추가된 속성

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
	 // 한번에 데이터 리턴
	public String getManager() {
		return name+"\t"+salary+"\t"+depart;
	}   
}
