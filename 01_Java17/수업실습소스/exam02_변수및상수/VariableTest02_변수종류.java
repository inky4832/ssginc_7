package exam02_변수및상수;

public class VariableTest02_변수종류 {

	int x = 10;        // 인스턴스 변수
	static int x2=20;  // 클래스 변수 ( static 변수 )
	
	public static void main(String[] args) {
		
		// 변수선언 위치에 따른 변수 종류 정리
	
		int n =30; // 변수, int 타입의 변수, 정수형 변수, 기본형 변수, 로컬 변수
	
		System.out.println("static 변수:" + x2);
		
		// 객체생성 문법:  클래스명 변수 = new 클래스명();
		VariableTest02_변수종류 t = new VariableTest02_변수종류();
		System.out.println("instance 변수:" + t.x);
		VariableTest02_변수종류 t2 = new VariableTest02_변수종류();
		
		System.out.println("local 변수:" + n);
		
		
		//로컬 변수
		int m=0;
		System.out.println(m);
		
		
		
		
	}//end main 메서드

}
