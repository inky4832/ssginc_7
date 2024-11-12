package exam15_상속2_적용;

public class Manager extends Employee{
	
	String depart; // 관리부서명
	
	public Manager() {}
	public Manager(String name, int salary, String depart) {
		this.name = name;
		this.salary = salary;
		this.depart = depart;
	}
	public String getDepart() {
		return depart;
	}
	public void setDepart(String depart) {
		this.depart = depart;
	}
	// 한번에 데이터를 반환
	public String getManager() {
		return name+"\t"+salary+"\t"+depart;
	}
}
