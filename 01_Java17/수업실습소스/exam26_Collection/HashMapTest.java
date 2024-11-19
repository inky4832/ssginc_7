package exam26_Collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		// Map 계열: key(name)와 value 쌍으로 저장. 저장 순서 없음

		HashMap<String, String> map = new HashMap<String, String>();
		
		//데이터 저장
		map.put("p1", "홍길동1");
		map.put("p2", "홍길동2");
		map.put("p3", "홍길동3");
		map.put("p3", "이순신");  // 동일한 key이면 값을 덮어쓴다.
		
		//데이터 출력 1 - toString
		System.out.println(map);
		System.out.println("######################################");
		
		//데이터 출력 2 - key 이용
		System.out.println(map.get("p2"));
		System.out.println(map.get("p4")); // key가 존재하지 않으면 null 값 리턴
	
		System.out.println("######################################");
		//데이터 출력 3 - key 값을 먼저 얻고 나중에 값 얻기 (*******)
		Set<String> keys = map.keySet();  // 순서없이 반환
		System.out.println(keys);  // [p1, p2, p3]
		for (String key : keys) {
			System.out.println(map.get(key)); // key가 존재하지 않으면 null 값 리턴
		}
		System.out.println("######################################");
		//데이터 출력 4 - value 값만 얻기 
		Collection<String> data = map.values();
		for (String v : data) {
			System.out.println(v);
		}
	}

}
