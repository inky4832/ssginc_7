package exam10_생성자3_인스턴스변수_초기화;

public class TestCat {

	
	public static void main(String[] args) {
		
		// 인스턴스 변수 초기화 방법-1 ( 직접 접근 )
		Cat c = new Cat();
		c.name="나비";
		c.age=2;
		c.gender="암컷";
		System.out.printf("1 번 고양이 이름:%s, 나이:%d, 성별: %s \n", 
				c.name, c.age,c.gender);
		
		//인스턴스 변수 초기화 방법-2 ( 생성자 이용 )
		// 생성자 이용한 초기화 장점: 위의 직접 접급보다 훨씬 빠른 시점에 초기화 가능
		Cat c2 = new Cat("나비",2,"암컷");
		
		System.out.printf("2 번 고양이 이름:%s, 나이:%d, 성별: %s \n", 
				   c2.name, c2.age,c2.gender);
		
	}

}
