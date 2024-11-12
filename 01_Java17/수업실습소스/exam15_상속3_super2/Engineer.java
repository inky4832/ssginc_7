package exam15_상속3_super2;

public class Engineer extends Employee {

	String skill;
	
	public Engineer() {
		super();
		System.out.println("Engineer() 생성자"); 
	}
	public Engineer(String name, int salary, String skill) {
		super(name, salary); // name과 salary 는 부모인 Employee에서 초기화.
		System.out.println("Engineer(String name, int salary, String skill) 생성자"); 		
//		this.name = name;
//		this.salary = salary;
		this.skill = skill;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
}
