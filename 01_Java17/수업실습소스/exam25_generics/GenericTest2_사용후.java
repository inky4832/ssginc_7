package exam25_generics;

import java.util.Date;

// Box는 임의의 값을 저장할 수 있는 클래스 ( 모든 데이터 저장이 가능)
class Box2<T>{
	T obj;
	public void setValue(T obj) {
		this.obj = obj;
	}
	public T getValue() {
		return obj;
	}
}//end Box

public class GenericTest2_사용후 {
	public static void main(String[] args) {

		//문자열만 저장
		Box2<String> box1 = new Box2<String>();  // new Box2(); 동일
		box1.setValue("홍길동");
//		box1.setValue(10); // 문제1해결: 실행시점이 아닌 컴파일 시점에 잘못 저장된 데이터임을 알 수 있음.
		String str = box1.getValue(); // 문제2 해결. 형변환이 필요 없음.
		System.out.println(str +"\t" + str.length());
		
		//날짜만 저장
	    Box2<Date> box2 = new Box2<Date>();
	    box2.setValue(new Date());
//		box2.setValue(10); // 문제1해결: 실행시점이 아닌 컴파일 시점에 잘못 저장된 데이터임을 알 수 있음.
	    Date d= box2.getValue();  //  문제2 해결. 형변환이 필요 없음.
		System.out.println(d);
	}
}
