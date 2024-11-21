package exam29_StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamTest02_중간처리1_중복제거_필터링 {

	public static void main(String[] args) {
		
		// 중간처리
		List<String> list = Arrays.asList("홍길동", "이순신","유관순","정조","영조","세종대왕","홍길동");

		//1. 모두 출력
		list.stream().forEach(System.out::println);
        System.out.println("##############################");
        
		//2. 중복 제거 : distinct()
		list.stream()
		    .distinct()
		    .forEach(System.out::println);
		
		System.out.println("##############################");
		
		//3. 필터링 : 조건지정해서 원하는 값만 반환
		//익명클래스
		Predicate<String> x = new Predicate<String>() {
			@Override
			public boolean test(String t) {
				// 이름이 2글자만 반환
				return t.length()==2;
			}
		};
		// 람다 표현식
		Predicate<String> x2 =  t-> t.length()==2;
		list.stream().filter(x2).forEach(System.out::println);
		list.stream().filter(t-> t.length()==2).forEach(System.out::println);
		
		System.out.println("##############################");
		//문제1: 이름이 '이' 로 시작하는 사람만 출력하시오
		
		Predicate<String> x3 = new Predicate<String>() {
			@Override
			public boolean test(String t) {
				// 이름이 '이' 로 시작하는 사람만 반환
				return t.startsWith("이");
			}
		};
		Predicate<String> x4 = t -> t.startsWith("이");
		list.stream().filter(x4).forEach(System.out::println);
		list.stream().filter(t -> t.startsWith("이")).forEach(System.out::println);
		
		System.out.println("##############################");
		// 4. 중복제거 + 필터링
		// 이름이 3글자이고 중복제거 출력
		list.stream().distinct().filter(t-> t.length()==3).forEach(System.out::println);
	}

}
