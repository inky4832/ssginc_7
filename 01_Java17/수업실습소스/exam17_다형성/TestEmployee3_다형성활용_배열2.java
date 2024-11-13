package exam17_다형성;

public class TestEmployee3_다형성활용_배열2 {

	public static void main(String[] args) {

		// 다형성 활용1- 배열 ( 단 하나의 부모 타입으로 모든 자식들을 저장 가능)
	    Employee [] employee = { new Manager("이순신1", 4000, "개발"),
	    		                 new Engineer("유관순1", 2500, "자바"),
	                             new Manager("이순신2", 4000, "개발"),
	                             new Manager("이순신3", 4000, "개발"),
	                             new Engineer("유관순2", 2500, "자바")
	                };
	    
	    // 모든 데이터 출력 코드
	    for (Employee emp : employee) {
			System.out.println(emp);  // emp.toString() 자동호출, 동적타이핑이 발생됨.
		}
        System.out.println("##########################################################");
	    // Manager 만 출력하는 코드
	    for (Employee emp : employee) {
			//  문법:  변수 instanceof 클래스명
	    	if( emp instanceof Manager) {
	    		System.out.println(emp);  // emp.toString() 자동호출, 동적타이핑이 발생됨.
	    	}
		}
	    System.out.println("##########################################################");
	    
	    // Manager 의 정보중에서 name과 depart 만 출력하는 코드( toString() 사용안됨 )
	    for (Employee emp : employee) {
	    	if( emp instanceof Manager) {
	    		// 자식인 Manager에서만 추가된 변수/메서드 접근하기 위해서 명시적인 형변환 필요
	    		Manager m = (Manager)emp;
	    		System.out.println(m.getName() + "\t" + m.getDepart());  
	    	}
		}
	    
	    // Object 배열로 확장
	       Object [] obj = { new Manager("이순신1", 4000, "개발"),
				  			 new Engineer("유관순1", 2500, "자바"),
				  			 "hello",
				  			 100,
				  			 3.14,
				  			 true
	  			 			};
	    
	    
	}

}
