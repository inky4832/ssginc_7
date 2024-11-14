package exam19_추상클래스2_적용전;

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

	//모든 데이터 반환
	public String getEmployee() {
		return name+"\t"+salary;
	}

}
