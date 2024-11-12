package exam15_상속3_super3_이클립스;

public class Employee {

	String name;
	int salary;
	
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
	
    // 한번에 데이터 리턴
	public String getEmployee() {
		return name+"\t"+salary;
	}
	
}
