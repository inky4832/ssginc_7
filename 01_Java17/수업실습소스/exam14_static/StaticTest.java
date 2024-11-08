package exam14_static;

// 외부 클래스 작성
class Util{
	       int num=10;  // 인스턴스 변수
	static int num2=20; // static 변수 (클래스 변수)
}

public class StaticTest {
	public static void main(String[] args) {
		// static 변수 접근: 클래스명.static변수
		System.out.println(Util.num2); //20
		// static 변수 증가
		Util.num2++;
		System.out.println(Util.num2); //21
		
		// instance 변수 접근: 객쳉생성후 접근
		Util u = new Util();
		System.out.println(u.num);  //10
		u.num++;                    //11
		Util u2 = new Util();
		System.out.println(u2.num); //10
		
		
		
	}
}
