package exam15_상속3_super3_이클립스;

public class Engineer extends Employee {

	String skill; // Engineer 에서 추가된 속성

	public Engineer() {
		super();
	}

	public Engineer(String name, int salary) {
		super(name, salary);
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

	 // 한번에 데이터 리턴
	public String getEngineer() {
		return name+"\t"+salary+"\t"+skill;
	}   
	
	
}
