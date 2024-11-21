package exam29_StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class StreamTest04_Optional {

	public static void main(String[] args) {
		// OptionalXXX : 배열이나 리스트에 값이 없는 경우에
		//            그룹핑 메서드를 사용하면 NoSuchElementException이 발생될 수 있다.
		//            이때 NoSuchElementException 발생을 방지할 수 있다.
		//            기본값으로 설정할 수 있다. orElse(기본값)
		//   정리하면  OptionalXXX 타입인 경우에는 getXXX 호출하지 말고 orElse(기본값) 사용하자.

		//1. 값이 있는 경우
		List<Integer> list  = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(5);
		
		OptionalDouble result = list.stream().mapToDouble(t->t).average();
		System.out.println(result); // OptionalDouble[11.666666666666666], result.toString() 동일
		//System.out.println(result.getAsDouble()); // 11.666666666666666
		System.out.println(result.orElse(0.0));  // 11.666666666666666
		
		//2. 값이 없는 겨우
		List<Integer> list2  = new ArrayList<Integer>();
		OptionalDouble result2 = list2.stream().mapToDouble(t->t).average();
		System.out.println(result2);  // OptionalDouble.empty
//		System.out.println(result2.getAsDouble());  // NoSuchElementException 발생됨.
		System.out.println(result2.orElse(0.0));  // 0.0
		
		
	}

}
