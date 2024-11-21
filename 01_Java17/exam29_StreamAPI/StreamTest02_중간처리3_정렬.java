package exam29_StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Person2{
	String name;
	int age;
	
	public Person2() {
		super();
	}
	public Person2(String name, int age) {
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

public class StreamTest02_중간처리3_정렬 {

	public static void main(String[] args) {
	
		List<Person2> list = Arrays.asList( new  Person2("홍길동", 10), 
				new  Person2("이순신", 30),
				new  Person2("유관순", 14),
				new  Person2("정조", 65),
				new  Person2("강감찬", 34),
				new  Person2("세종대왕", 23));
		
		// 1. 정렬1- sorted(Comparator) 인터페이스 이용
		Comparator<Person2> c = new Comparator<Person2>() {
			@Override
			public int compare(Person2 p1, Person2 p2) {
//				return p1.age - p2.age;  // 오름차순
				return -(p1.age - p2.age);  // 내림차순
			}
		};
		
		Comparator<Person2> c2 = (p1, p2)->p1.age - p2.age;
//		list.stream().sorted(c2).forEach(System.out::println);
//		list.stream().sorted((p1, p2)->p1.age - p2.age).forEach(System.out::println);
		
		// 1. 정렬2- sorted(Comparator.comparing(Function))메서드 이용. 정렬하고자 값 타입을 리턴
		Function<Person2, Integer> f = new Function<Person2, Integer>() {
			@Override
			public Integer apply(Person2 t) {
				return t.getAge();
			}
		};
		Function<Person2, Integer> f2 = t->t.getAge();
		Function<Person2, Integer> f3 = Person2::getAge;
//		list.stream().sorted(Comparator.comparing(f3)).forEach(System.out::println); // 오름차순
		list.stream()
		   .sorted(Comparator.comparing(Person2::getAge))
		   .forEach(System.out::println); // 오름차순
		
		list.stream()
		    .sorted(Comparator.comparing(f3, Comparator.reverseOrder()))
		    .forEach(System.out::println);//내림차순
		
	}
}





