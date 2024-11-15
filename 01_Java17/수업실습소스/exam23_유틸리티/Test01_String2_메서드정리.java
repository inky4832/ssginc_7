package exam23_유틸리티;

public class Test01_String2_메서드정리 {

	public static void main(String[] args) {
	
		String s = "hElLo";
		String s2 = "     world     ";

		// String 의 인스턴스 메서드
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

		System.out.println("9. 문자열 비교: " + s.equals("hElLo"));   // true
		System.out.println("9. 문자열 비교: " + s.equals("hello"));   // false
		System.out.println("9. 문자열 비교(대소문자 무시): " + s.equalsIgnoreCase("hello"));   // true
		
		System.out.println("10. 문자열 포함여부: " + s.contains("hE"));   // true
		System.out.println("10. 문자열 포함여부: " + s.contains("xhE"));   // false
		
		System.out.println("11. 문자열 치환: " + s.replace('h', 'H'));   // HElLo
		System.out.println("11. 문자열 치환: " + s.replace("hE", "A"));   // HElLo
	
		
		System.out.println("12. 문자열을 char[] 반환"); 
		String s3 = "hElLo";
		char [] ch = s3.toCharArray();
		for (char c : ch) {
			System.out.println(c);
		}

		System.out.println("13. 구분자 이용한 문자열 분리");
		String s4 = "홍길동/이순신/유관순";
		String [] names = s4.split("/");
		for (String str : names) {
			System.out.println(str);
		}
		
		
		// String 의 static 메서드 :  String.static메서드
		System.out.println("14. 정수를 문자열로 변경" + String.valueOf(10));
		System.out.println("14. 실수를 문자열로 변경" + String.valueOf(3.14));
		char [] ch2 = {'A','B','C'};
		String xxx = String.valueOf(ch2);
		System.out.println("14. char [] 를 문자열로 변경" + xxx );  // ABC , toCharArray() 반대
		
		String f = String.format("이름:%s  나이:%d \n", "홍길동", 20);
		System.out.println("15. 문자열 포맷 지정" + f);  // 이름:홍길동  나이:20
		System.out.printf(f);		
		
		
		// 원본 문자열 출력 : String 은 한번 생성된 문자열은 변경이 안된다. 메서드를 적용하면 새로운 문자열이 생성된다.
		System.out.println(" 원본 문자열 출력: " + s);  // hElLo
	}
}
