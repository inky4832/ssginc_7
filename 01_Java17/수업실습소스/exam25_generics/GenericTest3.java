package exam25_generics;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

class Cat{
	String name;
	int age;
	public Cat() {
		super();
	}
	public Cat(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	//getter / setter

	@Override
	public String toString() {
		return "Cat [name=" + name + ", age=" + age + "]";
	}
}//end Cat

public class GenericTest3 {
	public static void main(String[] args) {
		//generic + 다형성 이용한 List 생성
		List<String> list = Arrays.asList("AAA","BBB");
		List<Integer> list2 = Arrays.asList(100,200);
		List<Date> list3 = Arrays.asList(new Date(), new Date());
		List<Cat> list4 = Arrays.asList(new Cat("나비",2), new Cat("망치",1));
		
		// 데이터 출력
		printData(list);
		printData(list2);
		printData(list3);
		printData(list4);
	}
	public static void printData(List<?> xxx) {
		System.out.println(xxx);
	}
}
