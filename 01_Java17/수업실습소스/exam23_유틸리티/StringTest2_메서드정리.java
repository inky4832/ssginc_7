package exam23_유틸리티;

public class StringTest2_메서드정리 {

	public static void main(String[] args) {
	
		String s = "hElLo";
		String s2 = "     world     ";

		System.out.println("1. 문자열 길이: " + s.length() + "\t" + s2.length()); // 5  15
		System.out.println("2. 특정문자 얻기: " + s.charAt(0));  // h
		System.out.println("3. 부분열1: " + s.substring(2));   // lLo
		String result = s.substring(0, 4);
		System.out.println("3. 부분열2: " + s.substring(0, 4));   // hElL
		
		System.out.println("4. (양쪽)공백제거1: " + s2.trim());   // world
		System.out.println("4. (양쪽)공백제거1후 길이: " + s2.trim().length());   // 5
		
		System.out.println("4. (양쪽)공백제거2: " + s2.strip());   // world
		System.out.println("4. (왼쪽)공백제거3: " + s2.stripLeading());   // world
		System.out.println("4. (오른쪽)공백제거4: " + s2.stripTrailing());   // world
		
		System.out.println("5. 특정문자 위치 얻기1: " + s.indexOf("L") + "\t" + s.indexOf('L'));  // 3
		System.out.println("5. 특정문자 위치 얻기1: " + s.indexOf("L", 4));  // -1  ( -1 이면 찾는 문자(열)이 없는 경우)
		
		System.out.println("6. 문자열 연결: " + s.concat("!!!!"));   // hElLo!!!!
		System.out.println("7. 대문자: " + s.toUpperCase());   // HELLO
		System.out.println("8. 소문자: " + s.toLowerCase());   // hello
		
		
		
		
		
		
		
		
		
		
	}
}
