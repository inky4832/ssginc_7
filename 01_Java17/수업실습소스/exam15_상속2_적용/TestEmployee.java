package exam15_상속2_적용;

public class TestEmployee {

	public static void main(String[] args) {
		
		Manager m = new Manager("홍길동", 200, "개발");
		Engineer eng = new Engineer("유관순", 150, "자바");
		
		System.out.println(m.getManager());
		System.out.println(m.getName()+"\t"+m.getSalary()+"\t"+m.getDepart());
		
		System.out.println(eng.getEngineer());
		System.out.println(eng.getName()+"\t"+eng.getSalary()+"\t"+eng.getSkill());
	}

}
