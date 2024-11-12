package exam15_상속3_super3_이클립스2;

public class TestEmployee {

	public static void main(String[] args) {

		Manager m = new Manager("홍길동", 4000, "개발");
		Engineer eng = new Engineer("유관순", 2500, "자바");
		// 모든 클래스의 정보는 getEmployee() 메서드 하나만 알면 된다.
		System.out.println(m.getEmployee());
		System.out.println(eng.getEmployee());
	}

}
