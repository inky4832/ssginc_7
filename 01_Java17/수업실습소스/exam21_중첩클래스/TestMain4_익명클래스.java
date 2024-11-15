package exam21_중첩클래스;

interface Flyer{
	public abstract void fly();
}
class Bird implements Flyer{
	@Override
	public void fly() {}
}//end Bird

public class TestMain4_익명클래스 {
	public static void main(String[] args) {
	     // 이름있는 클래스
		 Flyer f = new Bird();
		 f.fly();
		  
		 // 익명클래스
		 /*
		  *     인터페이스명  변수명 = new 인터페이스명(){
		  *     
		  *             추상메서드 재정의
		  *     };
		  *     변수명.메서드;
		  * 
		  */
		 Flyer f2 = new Flyer() {
			@Override
			public void fly() {}
		 };
		 f2.fly();
		 
	
		 
	}//end main
}
