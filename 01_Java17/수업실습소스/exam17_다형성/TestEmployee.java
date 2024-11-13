package exam17_다형성;

public class TestEmployee {

	public static void main(String[] args) {
		// 다형성 적용 안한 경우. 
		Employee e = new Employee("홍길동", 2000);
		Manager m = new Manager("이순신", 4000, "개발");
		Engineer eng = new Engineer("유관순", 2500, "자바");
		
		// 정보 출력
		System.out.println(e);  // e.toString() 자동호출됨.
		System.out.println(m);
		System.out.println(eng);

	}

}
