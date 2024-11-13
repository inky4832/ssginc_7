package exam18_접근지정자2_다른패키지_parent;

public class Parent2 {
	public int n1 = 10;
	protected int n2 = 20;
	 int n3 = 30;
	private int n4 = 40;
	
	public void method() {
		//같은 클래스
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);
	}
}
