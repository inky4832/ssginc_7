package exam15_상속3_super2;

public class Employee {
	
	String name;
	int salary;
	
	public Employee() {
		//super();
		//this(null,0);
		System.out.println("Employee() 생성자");
	}
	
	public Employee(String name, int salary) {
		System.out.println("Employee(String name, int salary) 생성자");
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
