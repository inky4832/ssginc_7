package exam14_static;

// Counter
class Counter{
	private int num;
	static int count;
	public Counter() {
		num++;
		count++;
	}
	// 인스턴스 메서드
	public int getNum() {
		return num; // 인스턴스 변수 접근 가능
	}
	// 인스턴스 메서드
	public int getCount() {
		getCount2(); // static 메서드 호출 가능
		return count; // static 변수 접근 가능
	}
	// static 메서드
	public static int getCount2() {
		return count; // static 변수 접근 가능
	}
	// static 메서드 사용시 주의할 점
//	public static int getNum2() {
//		System.out.println(this); // 인스턴스를 참조하는 this 사용 불가
//		getCount(); // 인스턴스 메서드 호출 불가능
//		return num; // 인스턴스 변수 접근 불가능
//	}
}
public class StaticTest2 {
	public static void main(String[] args) {
		// Counter 클래스를 몇 번 new 했는지 출력하자.
		System.out.println(Counter.count);//0
		System.out.println(Counter.getCount2());//0
		
		Counter c = new Counter();
		System.out.println(c.getNum()); // 1
		System.out.println(Counter.count); // 1
		
		Counter c2 = new Counter();
		System.out.println(c2.getNum()); // 1
		System.out.println(Counter.count); //2
		
	}
}
