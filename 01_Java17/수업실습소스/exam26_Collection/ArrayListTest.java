package exam26_Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {

	public static void main(String[] args) {
		// List 계열  (순서가 존재, 중복 가능 )
		
		ArrayList<String> list = new ArrayList<String>();  // new ArrayList<>() 동일
		
		//데이터 추가
		list.add("홍길동");
		list.add("이순신");
		list.add("유관순");
		
		//데이터 출력1 - toString() 이용
		System.out.println(list); // list.toString() 동일  [홍길동, 이순신, 유관순]
		
		System.out.println("############################################");
		//데이터 출력2 - get(idx) 이용
		System.out.println(list.get(0)+"\t"+list.get(1)+"\t"+list.get(2));
//		 System.out.println(list.get(3)); //존재하지 않는 index 접근은 IndexOutOfBoundsException 에러 발생
		
		System.out.println("############################################");
		//데이터 출력3 - 일반for문 이용
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("############################################");
		//데이터 출력4 - foreach문 이용
		for (String s : list) {
			System.out.println(s);
		}
		
		System.out.println("############################################");
		//데이터 출력5 - Iterator 이용 (  hasNext(), next() )
		Iterator<String> ite = list.iterator();
		while(ite.hasNext()) {
			String s = ite.next();
			System.out.println(s);
		}
		
	}

}
