package exam17_다형성;

public class Manager extends Employee{
	
	String depart; // Manager에 추가된 속성
	
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
	@Override
	public String toString() {
		return "Manager [depart=" + depart + ", name=" + name + ", salary=" + salary + "]";
	}

	
	
}
