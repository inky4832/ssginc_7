package exam25_generics;

import java.util.Date;

// Box는 임의의 값을 저장할 수 있는 클래스 ( 모든 데이터 저장이 가능)
class Box{
	Object obj;
	public void setValue(Object obj) {
		this.obj = obj;
	}
	public Object getValue() {
		return obj;
	}
}//end Box

public class GenericTest1_사용전 {

	public static void main(String[] args) {

		// 문자열만 저장
		Box box1 = new Box();
		box1.setValue("홍길동");
box1.setValue(10);  // 문제1: 잘못된 데이터가 저장된것을 컴파일 시점이 아니고 사용자가 사용하는 런타임에 알 수 있다.
		Object obj1 = box1.getValue();
	    String str = (String)obj1; // 문제2. 형변환이 필요함.
	    System.out.println(str +"\t" + str.length());
	    
		// 정수만 저장
		Box box2 = new Box();
		box2.setValue(10);
//box2.setValue("홍길동");  // 문제1: 잘못된 데이터가 저장된것을 컴파일 시점이 아니고 사용자가 사용하는 런타임에 알 수 있다.
		Object obj2 = box2.getValue();
		Integer i = (Integer)obj2; // 문제2. 형변환이 필요함.
		System.out.println(i +"\t" + (i+20));
		
		// 날짜만 저장
		Box box3 = new Box();
		box3.setValue(new Date());
box3.setValue(10); // 문제1: 잘못된 데이터가 저장된것을 컴파일 시점이 아니고 사용자가 사용하는 런타임에 알 수 있다.
		Object obj3 = box3.getValue();
		Date d = (Date)obj3; // 문제2. 형변환이 필요함.
		System.out.println(d);
	
	}
}
