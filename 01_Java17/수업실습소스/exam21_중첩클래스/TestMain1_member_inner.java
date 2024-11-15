package exam21_중첩클래스;


class Outer{
	
	public int n=10;
	protected int n2=20;
    int n3=30;
	private int n4=40;
	
	public void outerMethod() {
		// Inner 사용하는 곳-1 ( Outer에서 Inner 생성 )
		Inner inner = new Inner();
		inner.innerMethod();
	}
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
		}//end innerMethod
	}//end Inner
}//end Outer
public class TestMain1_member_inner {
	public static void main(String[] args) {
		// Inner 사용하는 곳-1 ( Outer에서 Inner 생성, 일반적으로 많이 사용되는 형태)
		  Outer outer = new Outer();
		  outer.outerMethod();
		  
		  System.out.println("###########################");
		// Inner 사용하는 곳-2 ( 다른 클래스에서 Inner 생성 )
		  Outer xxx = new Outer();
		  Outer.Inner inner = xxx.new Inner();
		  inner.innerMethod();
		  
		  
	}
}
