package exam29_StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Person4{
	String name;
	int age;
	
	public Person4() {
		super();
	}
	public Person4(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}

public class StreamTest03_최종처리1_타입변환_List_Map {

	public static void main(String[] args) {
	
		List<Person4> list = Arrays.asList( new  Person4("홍길동", 10), 
				new  Person4("이순신", 30),
				new  Person4("유관순", 14),
				new  Person4("정조", 65),
				new  Person4("강감찬", 34),
				new  Person4("세종대왕", 23));
	
		//1. 최종처리- foreach
		list.stream().forEach(System.out::println);
		System.out.println("###########################");
		
		//2. 이름만 출력
		Function<Person4, String> f = new Function<Person4, String>() {
			@Override
			public String apply(Person4 t) {
				return t.getName();
			}
		};
		Function<Person4, String> f2 = t->  t.getName();
		Function<Person4, String> f3 = Person4::getName;
//		list.stream().map(f3).forEach(System.out::println);
		list.stream().map( Person4::getName).forEach(System.out::println);
		
		//3. 이름만 리스트로 반환
		List<String> nameList = list.stream().map( Person4::getName).collect(Collectors.toList());
		System.out.println(nameList);  // [홍길동, 이순신, 유관순, 정조, 강감찬, 세종대왕]
		
	}
}





