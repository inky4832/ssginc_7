package exam22_람다표현식;


@FunctionalInterface   // 반드시 단 하나의 추상메서드를 가지도록 강제함.
interface Flyer4{
	// 파라미터 없고 리턴값 있는 형식
	public abstract int fly();
}

public class TestMain3 {
	public static void main(String[] args) {

		//  익명클래스
		 Flyer4 f = new Flyer4() {
			@Override
			public int fly() {
				System.out.println("익명클래스 fly()");
				return 100;
			}
		};
		int result = f.fly();
		System.out.println("결과값: " + result);
			
		//람다표현식
		Flyer4 f2 = ()->{
			System.out.println("익명클래스 fly()");
			return 200;
		};
		int result2 = f2.fly();
		System.out.println("결과값: " + result2);
		
		// 실행문장이 하나인 경우. 즉 return 문만 있는 경우는 {} 와 return 생략가능
		Flyer4 f3 = ()->{return 300;};
		int result3 = f3.fly();
		System.out.println("결과값: " + result3);
		
		Flyer4 f4 = ()-> 400;
		int result4 = f4.fly();
		System.out.println("결과값: " + result4);
		
		
	}//end main
}//end clas
