package exam26_Collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		// Map 계열: key(name)와 value 쌍으로 저장. 저장 순서 없음

//		HashMap<String, String> map2 = new HashMap<String, String>();
		Map<String, String> map = new HashMap<String, String>();  // 다형성
		
		//데이터 저장
		map.put("p1", "홍길동1");
		map.put("p2", "홍길동2");
		map.put("p3", "홍길동3");
		map.put("p3", "이순신");  // 동일한 key이면 값을 덮어쓴다.
		
		//추가 메서드
		System.out.println("key 존재?" + map.containsKey("p1"));  // true
		System.out.println("key 존재?" + map.containsKey("p4"));  // false
		
		System.out.println("value 존재?" + map.containsValue("이순신"));  // true
		System.out.println("value 존재?" + map.containsValue("홍길동3"));  // false
		
		// 값삭제
		map.remove("p2"); // {p1=홍길동1, p3=이순신}
		
		// 값 치환
		map.replace("p3", "이순신");
		
		// 모두 삭제
//		map.clear();
		
		System.out.println("map 크기?" + map.size());  // 2
		
		
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
		
		// Map 생성-1  
		Map<String, Integer> map3 = Map.of("k1", 100, "k2", 200);  // 값 변경불가, immutable
		
		// 수정가능한 Map으로 변경
		map3 = new HashMap<>(map3);
		map3.put("k1", 300);  // UnsupportedOperationException 에러 발생
		System.out.println(map3);  // {k2=200, k1=100}
		
	}

}
