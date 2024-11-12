package exam15_상속2_적용;

public class Engineer extends Employee {

	String skill; // Engineer 의 기술
	
	public Engineer() {}
	public Engineer(String name, int salary, String skill) {
		this.name = name;
		this.salary = salary;
		this.skill = skill;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	// 한번에 데이터를 반환
	public String getEngineer() {
		return name+"\t"+salary+"\t"+skill;
	}
}
