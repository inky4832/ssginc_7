package exam29_StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Stream;

class Person{
	String name;
	int age;
	
	public Person() {
		super();
	}
	public Person(String name, int age) {
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

public class StreamTest02_중간처리2_가공 {

	public static void main(String[] args) {
		
		// 중간처리
		List<Person> list = Arrays.asList( new  Person("홍길동", 10), 
				new  Person("이순신", 30),
				new  Person("유관순", 14),
				new  Person("정조", 65),
				new  Person("강감찬", 34),
				new  Person("세종대왕", 23));

	   //1. 전체 출력
		list.stream().forEach(System.out::println);
		System.out.println("##############################");
		
		
	   //2. 가공 (  map(Function<? super T,? extends R> mapper) ) - 많이 사용됨.
		// 이름에서 성만 출력하시오
		// 익명클래스
		Function<Person, String> f = new Function<Person, String>() {
			@Override
			public String apply(Person t) {
				return String.valueOf(t.getName().charAt(0));
			}
		};
		//람다 표현식
		Function<Person, String> f2 = t ->  String.valueOf(t.getName().charAt(0));
//		list.stream().map(f2).forEach(System.out::println);
		list.stream().map(t ->  String.valueOf(t.getName().charAt(0))).forEach(System.out::println);
		System.out.println("##############################");
		
		//문제1 - Person 의 age값에 + 2 해서 age값만  출력하시오
		Function<Person, Integer> f3 = new Function<Person, Integer>() {
			@Override
			public Integer apply(Person t) {
				return t.getAge()+2;
			}
		}; 
		Function<Person, Integer> f4 = t -> t.getAge()+2;
//		list.stream().map(f4).forEach(System.out::println);
		list.stream().map(t -> t.getAge()+2).forEach(System.out::println);
		System.out.println("##############################");
		
		
		ToIntFunction<Person> f5 = new ToIntFunction<Person>() {
			@Override
			public int applyAsInt(Person value) {
				return value.getAge()+2;
			}
		};
		ToIntFunction<Person> f6 = value -> value.getAge()+2;
//		list.stream().mapToInt(f6).forEach(System.out::println);
		list.stream().mapToInt(value -> value.getAge()+2).forEach(System.out::println);
		
		
	}

}
