package exam15_상속1_적용전;

public class Manager {
	
	String name;
	int salary;
	String depart; // 관리부서명
	
	public Manager() {}

	public Manager(String name, int salary, String depart) {
		this.name = name;
		this.salary = salary;
		this.depart = depart;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
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
