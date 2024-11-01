package exam02_변수및상수;

public class VariableTest02_변수종류2_초기화 {

// 인스턴스 변수
	int x;
	char c;
	boolean b;
	float f;
	
	String s;
	
	public static void main(String[] args) {
		//로컬 변수
		int m=0;
		System.out.println(m);
		// 인스턴스 변수 자동 초기화
		VariableTest02_변수종류2_초기화 t = new VariableTest02_변수종류2_초기화();
		System.out.println(t.x);  // 0
		System.out.println(t.c);  // \u0000 (빈문자)
		System.out.println(t.b);  // false
		System.out.println(t.f);  // 0.0
		System.out.println(t.s);  // null
		
	}//end main 메서드

}
