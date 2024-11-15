package exam21_중첩클래스;


class Outer3{
	
	public int n=10;
	protected int n2=20;
    int n3=30;
	private int n4=40;
	static int k = 100;
	public void outerMethod() {}
	
	static class Inner{
		int x = 100;
		static int x2 = 200;
		public void innerMethod() {
//			System.out.println(n);
//			System.out.println(n2);
//			System.out.println(n3);
//			System.out.println(n4); // 
			System.out.println(x);
			System.out.println(x2);
			System.out.println(k);
		}//end innerMethod
	}//end Inner
	
}//end Outer
public class TestMain3_static_inner {
	public static void main(String[] args) {
	
		// static inner 접근은 Outer.Inner 형식 
		Outer3.Inner inner = new Outer3.Inner();
		inner.innerMethod();
		  
	}
}
