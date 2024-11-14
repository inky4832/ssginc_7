package exam19_추상클래스2_적용전;

public class Manager extends Employee {
	
	String depart;
	
	public Manager() {
		super();
	}

	public Manager(String name, int salary, String depart) {
		super(name, salary);
		this.depart = depart;
	}

	//모든 데이터 반환
	public String getManager() {
		return name+"\t"+salary+"\t";
	}

}
