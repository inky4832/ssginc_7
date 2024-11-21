package exam29_StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

class Person9{
	String name;
	int age;
	
	public Person9() {
		super();
	}
	public Person9(String name, int age) {
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

public class StreamTest03_최종처리2_그룹메서드2_클래스 {

	public static void main(String[] args) {
		   
//        stream().collect( Collectors.averagingInt( Function))
//    stream().collect( Collectors.averagingDouble( Function))
//
//        stream().collect( Collectors.counting())
//    stream().collect( Collectors.maxBy(Comparator))
//        stream().collect( Collectors.minBy(Comparator)
//        stream().collect( Collectors.summingInt((Function))
		List<Person9> list = Arrays.asList( new  Person9("홍길동", 10), 
				new  Person9("이순신", 30),
				new  Person9("유관순", 14),
				new  Person9("정조", 65),
				new  Person9("강감찬", 34),
				new  Person9("세종대왕", 23));
	
		//1. list 갯수 :  count()
		long count = list.stream().collect(Collectors.counting());
		System.out.println("갯수: " + count);
		
		//2. age 의 총합
		ToIntFunction<Person9> f = new ToIntFunction<Person9>() {
			@Override
			public int applyAsInt(Person9 value) {
				return value.getAge();
			}
		};
		ToIntFunction<Person9> f2 = value-> value.getAge();   // 람다표현식
	    ToIntFunction<Person9> f3 = Person9::getAge;    // 메서드 참조
		int sum = list.stream().collect(Collectors.summingInt(f3));
		System.out.println("총합: " + sum); // 176
		
	
		//2. age 의 평균
		ToDoubleFunction<Person9> f4 = new ToDoubleFunction<Person9>() {
			@Override
			public double applyAsDouble(Person9 value) {
				return value.getAge();
			}
		};
		ToDoubleFunction<Person9> f5 = value -> value.getAge();
		ToDoubleFunction<Person9> f6 = Person9::getAge;
		double avg = list.stream().collect(Collectors.averagingDouble(f6));
		System.out.println("평균: " + avg); // 29.333333333333332
		
		//2. age 의 최대
		//  stream().collect( Collectors.maxBy(Comparator))
		Optional<Person9> xxx = 
				 list.stream().collect(Collectors.maxBy(Comparator.comparing(Person9::getAge)));
		System.out.println(xxx); // xxx.toString() , Optional[Person [name=정조, age=65]]		
		System.out.println(xxx.orElse(null)); // Person [name=정조, age=65]
		
		//2. age 의 최소
		Optional<Person9> xxx2 = 
				 list.stream().collect(Collectors.minBy(Comparator.comparing(Person9::getAge)));
		System.out.println(xxx2); // xxx.toString() , Optional[Person [name=홍길동, age=10]]		
		System.out.println(xxx2.orElse(null)); // Person [name=홍길동, age=10]
		
	}
}





