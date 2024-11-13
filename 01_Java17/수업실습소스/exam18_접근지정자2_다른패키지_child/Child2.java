package exam18_접근지정자2_다른패키지_child;

import exam18_접근지정자1_같은패키지.Parent;
import exam18_접근지정자2_다른패키지_parent.Parent2;

public class Child2 extends Parent2{

	public void method() {
		//다른패키지의 다른클래스
		System.out.println(n1);
		System.out.println(n2);  // protected
		//System.out.println(n3);
		//System.out.println(n4);
	}
}
//다른패키지의 다른클래스
class Other2{

	public void method() {
		Parent p = new Parent();
		System.out.println(p.n1);
		//System.out.println(p.n2);
		//System.out.println(p.n3);
		//System.out.println(p.n4);
	}
}