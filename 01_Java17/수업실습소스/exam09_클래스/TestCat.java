package exam09_클래스;

// 핸들링 클래스
public class TestCat {

	public static void main(String[] args) {

		// Cat 클래스 객체 생성
		// 클래스명  변수 = new 클래스명([값,..]);

		// 고양이정보: 나비 2  암컷
		Cat c = new Cat();
		System.out.printf("1 번 고양이 이름:%s, 나이:%d, 성별: %s \n", c.name, c.age,c.gender);

		c.name="나비";
		c.age=2;
		c.gender="암컷";
		
		System.out.printf("1 번 고양이 이름:%s, 나이:%d, 성별: %s \n", c.name, c.age,c.gender);
		
		// 고양이 정보: 망치 1  수컷
		Cat c2 = new Cat();
		c2.name="망치";
		c2.age=1;
		c2.gender="수컷";

		System.out.printf("2 번 고양이 이름:%s, 나이:%d, 성별: %s \n", c2.name, c2.age,c2.gender);
		
		

	}
}
