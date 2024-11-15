package exam22_람다표현식;


@FunctionalInterface   // 반드시 단 하나의 추상메서드를 가지도록 강제함.
interface Flyer{
	// 파라미터 없고 리턴값 없는 형식
	public abstract void fly();
}

public class TestMain1 {
	public static void main(String[] args) {
		
		//익명클래스 
		Flyer f = new Flyer() {
			@Override
			public void fly() {
				System.out.println("익명클래스 fly()");
			}
		};
		f.fly();
		
		//람다표현식
		Flyer f2 = () -> {System.out.println("람다표현식 fly()");};
		f2.fly();
		
		// 실행문장이 한줄인 경우: {} 생략 가능
		Flyer f3 = () -> System.out.println("람다표현식 fly()");
		f3.fly();
		
	}//end main
}//end clas
