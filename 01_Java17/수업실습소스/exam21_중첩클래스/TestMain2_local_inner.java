package exam21_중첩클래스;


class Outer2{
	
	public int n=10;
	protected int n2=20;
    int n3=30;
	private int n4=40;
	
	public void outerMethod() {
		int m = 100;  //로컬변수
		class Inner{
			int x = 100;
			static int x2 = 200;
			public void innerMethod() {
				System.out.println(n);
				System.out.println(n2);
				System.out.println(n3);
				System.out.println(n4); // Outer의 private 접근 가능.
				System.out.println(x);
				System.out.println(x2);
				System.out.println(m);
			}//end innerMethod
		}//end Inner
		// outerMethod() 내에서만 Inner 생성 가능
		Inner inner = new Inner();
		inner.innerMethod();
	}//end outerMethod()
}//end Outer
public class TestMain2_local_inner {
	public static void main(String[] args) {
		 Outer outer = new Outer();
		  outer.outerMethod();
	}
}
