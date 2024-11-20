package exam26_Collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {

		Vector<String> v = new Vector<String>();
		v.add("홍길동1");
		v.add("홍길동2");
		v.add("홍길동3");
		v.add("홍길동1");

		//Iterator 이용 출력
		Iterator<String> ite = v.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		System.out.println("###########################");
		//Enumeration 이용 출력
		Enumeration<String> enu = v.elements();
		while(enu.hasMoreElements()) {
			System.out.println(enu.nextElement());
		}
		

	}

}
