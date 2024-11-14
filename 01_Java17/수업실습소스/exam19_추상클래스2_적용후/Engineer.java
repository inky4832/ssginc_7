package exam19_추상클래스2_적용후;

public class Engineer extends Employee {
	
	String skill;
	public Engineer() {
		super();
	}
	public Engineer(String name, int salary, String skill) {
		super(name, salary);
		this.skill = skill;
	}
	//모든 데이터 반환
//	public String getEngineer() {
//		return name+"\t"+salary+"\t"+skill;
//	}
	
	@Override
	public String getEmployee() {
		return name+"\t"+salary+"\t"+skill;
	}
}
