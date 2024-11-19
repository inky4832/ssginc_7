package exam25_generics;

import java.util.Arrays;
import java.util.List;

class Person{}
class Man extends Person{}
class Woman extends Person{}


public class GenericTest4 {
	public static void main(String[] args) {
		
		List<Person> list1 = Arrays.asList(new Person());
		List<Man> list2 = Arrays.asList(new Man());
		List<Woman> list3 = Arrays.asList(new Woman());
		
		List<String> list4 = Arrays.asList("hello");
		
		//전체 출력 
		printData(list1);
		printData(list2);
		printData(list3);
		printData(list4);
		
		//Person을 상속받은 클래스만 출력
		printData2(list1); // Person
		printData2(list2); // Man
		printData2(list3); // Woman
		//printData2(list4);
		
		//  Man 의 부모 클래스만 출력
		printData3(list1); // Person
		printData3(list2); // Man
//		printData3(list3); // Woman
//		printData3(list4); // String
	}
	//전체 출력
	public static void printData(List<?> list) {
		System.out.println(list);
	}
	// Person을 상속받은 클래스만 출력 ( Person 자신 포함됨 )
	public static void printData2(List<? extends Person> list) {
		System.out.println(list);
	}
	// Man 의 부모 클래스만 출력 ( Man 자신 포함됨 )
	public static void printData3(List<? super Man> list) {
		System.out.println(list);
	}
}
