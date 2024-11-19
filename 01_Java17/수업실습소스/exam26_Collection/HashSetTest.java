package exam26_Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		// Set 계열:  데이터 순서가 없다. 중복 데이터 저장이 불가

		// 생성1
//		HashSet<Integer> set2  = new HashSet<Integer>();
		Set<Integer> set  = new HashSet<Integer>(); // 다형성
		
		//데이터 저장
		set.add(100);
		set.add(200);
		set.add(300);
		set.add(100);
		
		// 추가메서드 정리
		System.out.println("Set 길이:" + set.size());
		System.out.println("특정 값 존재여부:" + set.contains(100));
		
		//값 삭제
		set.remove(300);
		
		//데이터 출력1 - toString
		System.out.println(set);
		System.out.println("############################################");
		
		//데이터 출력2 - foreach문 이용
		for (int s : set) {
			System.out.println(s);
		}
		System.out.println("############################################");
		//데이터 출력3 - Iterator 이용 (  hasNext(), next() )
		Iterator<Integer> ite = set.iterator();
	    while(ite.hasNext()) {
	    	int n = ite.next();
	    	System.out.println(n);
	    }
	    
	    
		// 생성2 - Set.of(값...) // 수정불가, immutable
	    Set<String> set3 =Set.of("AA","BB");
	    //set3.add("CC"); // UnsupportedOperationException 에러 발생
	    System.out.println("Set.of 이용한 생성"+set3);
	    
	}
}
