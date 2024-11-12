package exam16_Object;

import java.util.Date;

public class ObjectTest {
	public static void main(String[] args) {
		Cat c = new Cat("나비", 2);
		
		// Object의 toString() 메서드 호출 ==> 클래스명@16진수
		System.out.println(c);  // exam16_Object.Cat@2f92e0f4, 자동으로 toString() 호출된다.
		//System.out.println(c.toString());  // exam16_Object.Cat@2f92e0f4
		//System.out.println(c.getCat());  // exam16_Object.Cat@2f92e0f4, 자동으로 toString() 호출된다.
		
		String s = "hello";
		System.out.println(s);  // hello , 자동으로 toString() 호출된다.
		//System.out.println(s.toString()); //hello 
		
		Integer i = new Integer(100);
		System.out.println(i);  // 자동으로 toString() 호출된다.
		//System.out.println(i.toString());
		
		Date d = new Date();
		System.out.println(d);  // 자동으로 toString() 호출된다.
		//System.out.println(d.toString());
		
	}
}





