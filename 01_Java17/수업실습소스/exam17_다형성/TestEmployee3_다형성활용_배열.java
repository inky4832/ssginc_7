package exam17_다형성;

public class TestEmployee3_다형성활용_배열 {

	public static void main(String[] args) {

		// 다형성 활용1- 배열
		
		//  다형성 적용 안한 경우- 변수만 사용한 경우
		Manager m1 = new Manager("이순신1", 4000, "개발");
		Engineer eng1 = new Engineer("유관순1", 2500, "자바");
		Manager m2 = new Manager("이순신2", 4000, "개발");
		Manager m3 = new Manager("이순신3", 4000, "개발");
		Engineer eng2 = new Engineer("유관순2", 2500, "자바");
		
	    //  다형성 적용 안한 경우- 배열 사용한 경우
		Manager [] manager = { new Manager("이순신1", 4000, "개발"),
				               new Manager("이순신2", 4000, "개발"),
				               new Manager("이순신3", 4000, "개발")
				                };
		
		Engineer [] engineer = { new Engineer("유관순1", 2500, "자바"),
				                 new Engineer("유관순2", 2500, "자바")
		                       };
		
		//  다형성 적용 ( 단 하나의 부모 타입으로 모든 자식들을 저장 가능)
	    Employee [] employee = { new Manager("이순신1", 4000, "개발"),
	    		new Engineer("유관순1", 2500, "자바"),
	               new Manager("이순신2", 4000, "개발"),
	               new Manager("이순신3", 4000, "개발"),
	               new Engineer("유관순2", 2500, "자바")
	                };
        
	}

}
