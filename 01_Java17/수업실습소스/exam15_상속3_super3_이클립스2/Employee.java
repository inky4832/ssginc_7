package exam15_상속3_super3_이클립스2;

// 부모 클래스
public class Employee {

	String name;
	int salary;
	
	// 모든 데이터 한번에 리턴하는 메서드
	public String getEmployee() {
		return name+"\t"+salary;
	}
	
	public Employee() {
		super();
	}

	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
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
	
	
}
