package exam19_추상클래스2_적용후;

public class TestEmployee {

	public static void main(String[] args) {
		
		Manager m = new Manager("홍길동", 4000, "개발");
		Engineer eng = new Engineer("유관순", 2500, "자바");
		
		//  모든 데이터 출력
		// 추상클래스 적용전에는 관리할 메서드가 여러개가 생길 수 있음.
		System.out.println(m.getEmployee());
		System.out.println(eng.getEmployee());

	}

}
