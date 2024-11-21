package exam29_StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Person3{
	String name;
	int age;
	
	public Person3() {
		super();
	}
	public Person3(String name, int age) {
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

public class StreamTest02_중간처리4_skip_limit {

	public static void main(String[] args) {
	
		List<Person3> list = Arrays.asList( new  Person3("홍길동", 10), 
				new  Person3("이순신", 30),
				new  Person3("유관순", 14),
				new  Person3("정조", 65),
				new  Person3("강감찬", 34),
				new  Person3("세종대왕", 23));
	
	    //1. 갯수 제한
		list.stream().limit(3).forEach(System.out::println);
		System.out.println("################################");
		
		//2. skip 
		list.stream().skip(3).forEach(System.out::println);
		
	}
}





