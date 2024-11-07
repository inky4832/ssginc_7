package exam13_method3;

public class TestCat {

	public static void main(String[] args) {

	
		Cat c = new Cat("나비", 2);
		
		//Cat 정보 출력1- 변수에 저장하고 출력
		// 데이터를 호출해서 얻는 기능: getter 메서드 라고 부른다.
		String name = c.getName();
		int age = c.getAge();
		
		System.out.printf("고양이 이름:%s, 나이:%d \n", name, age );

		//Cat 정보 출력2- 메서드 직접 호출후 출력
		System.out.printf("고양이 이름:%s, 나이:%d \n", c.getName(), c.getAge() );
		
		// Cat 정보 수정
		// 데이터를 수정(설정)하는 기능: setter 메서드라고 부른다.
		// "나비"--> "망치",  2-->3
		c.setName("망치");
		c.setAge(3);
		System.out.printf("데이터 수정후 고양이 이름:%s, 나이:%d \n"
				     , c.getName(), c.getAge() );
		
		
		
	}
}
