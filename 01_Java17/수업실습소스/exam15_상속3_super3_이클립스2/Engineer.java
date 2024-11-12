package exam15_상속3_super3_이클립스2;

public class Engineer extends Employee {

	String skill;

	// 모든 데이터 한번에 리턴하는 메서드
	@Override
	public String getEmployee() {
		return super.getEmployee()+"\t"+skill;
	}
	public Engineer() {
		//super();  // 자동삽입
	}
	public Engineer(String name, int salary) {
		super(name, salary); // 명시적 삽입
	}

	public Engineer(String name, int salary, String skill) {
		super(name, salary);
		this.skill = skill;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	
	
}
