package exam17_다형성;

public class TestEmployee2 {

	public static void main(String[] args) {

		// 다형성 적용한 경우. 
		Employee e = new Manager("이순신", 4000, "개발");
		 //e.depart;
		 //e.getDepart(); // 컴파일시 Employee에서 xxx() 찾는다. 해결: 형변환
		// 다음과 같이 형변환해서 자식에서 추가된 메서드 및 변수를 호출할 수 있다.
		Manager m = (Manager)e;
		m.getDepart();
		System.out.println(m.depart);
		
        System.out.println(e); // e.toString() 호출                   
                 e = new Engineer("유관순", 2500, "자바");
        System.out.println(e);
        
	}

}
