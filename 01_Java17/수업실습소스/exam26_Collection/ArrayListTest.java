package exam26_Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		// List 계열  (순서가 존재, 중복 가능 )
		
		ArrayList<String> list = new ArrayList<String>();  // new ArrayList<>() 동일
		
		//데이터 추가 ( append 기능 )
		list.add("홍길동");
		list.add("이순신");
		list.add("유관순");
		list.add("홍길동");
		
		//데이터 삽입 ( insert 기능 )
		list.add(0, "정조");  // [정조, 홍길동, 이순신, 유관순, 홍길동]
		
		//데이터 수정 ( update 기능 )
		list.set(1, "홍길동2");  // [정조, 홍길동2, 이순신, 유관순, 홍길동]
		
		//데이터 삭제 ( idx 또는 값 이용 )
		list.remove("홍길동2");  // [정조, 이순신, 유관순, 홍길동]
		list.remove(0);        // [이순신, 유관순, 홍길동]
		
		//추가 메서드
		System.out.println("크기:" + list.size()); // 3
		System.out.println("값 포함여부:" + list.contains("유관순")); // true
		System.out.println("값 위치:" + list.indexOf("이순신"));  // 0
		System.out.println("값이 없냐:" + list.isEmpty());   // false
		
		// 부분 리스트
		List<String> subList = list.subList(0, 2);  //  endIdx는 포함안됨
		System.out.println("부분 리스트:"+ subList); // [이순신, 유관순]
		
		
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
