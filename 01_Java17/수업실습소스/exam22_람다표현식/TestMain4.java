package exam22_람다표현식;


@FunctionalInterface   // 반드시 단 하나의 추상메서드를 가지도록 강제함.
interface Flyer5{
	// 파라미터 있고 리턴값 있는 형식
	public abstract int fly(int n , int n2);
}

public class TestMain4 {
	public static void main(String[] args) {

		// 익명클래스
		Flyer5 f = new Flyer5() {
			@Override
			public int fly(int n, int n2) {
				return n+n2;
			}
		};
		int result = f.fly(10, 20);
		System.out.println("결과값:" + result);
		
		
		// 람다표현식
		Flyer5 f2 = (int n, int n2)->{return n+n2;};
		Flyer5 f3 = (n, n2)->{return n+n2;};
		Flyer5 f4 = (n, n2)->n+n2;
		
		
		
	}//end main
}//end clas
