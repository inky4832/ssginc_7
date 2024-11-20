package exam27_Arrays_Collections유틸리티;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
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
	//getter/setter
	@Override
	public String toString() {
		return "Cat [name=" + name + ", age=" + age + "]";
	}
}//end Cat

public class CollectionsTest {

	public static void main(String[] args) {
		
		 //1. shuffle 기능
		List<Integer> list = Arrays.asList(9,2,1,34,67);
		 Collections.shuffle(list);
		 System.out.println("1. shuffle 기능: " +  list);
		 
		 //2. copy 기능
		 List<Integer> x = Arrays.asList(9,2,1,34,67); // 5개
		 List<Integer> x2 = Arrays.asList(10,20,30,40); //4개
		 
		 Collections.copy(x, x2);  // (dest, src)
//		 Collections.copy(x2, x);  // (dest, src) // src가 더 크기 때문에 에러발생
		 System.out.println("2. copy: x" + x); // [10, 20, 30, 40, 67]
		 System.out.println("2. copy: x2" + x2); // [10, 20, 30, 40]
		 
		 //2. sort 기능
		 List<Cat> catList =  Arrays.asList( new Cat("c5", 2),
											 new Cat("c4", 5),
											 new Cat("c2", 7),
											 new Cat("c1", 10),
											 new Cat("c3", 1)
				                           );
		 System.out.println(catList);
		 // Collections.sort( 리스트, Comparator타입)
		 /*
		      Comparator 인터페이스의 compare(값1, 값2) 추상메서드를 재정의해서
		      Cat의 어떤 값으로 정렬할지를 알려준다.
		      
		      Comparator 인터페이스 사용방법
		      1) 이름있는 클래스 이용.
		         예> public class XXX implments Comparator{compare재정의}
		         
		      2) 이름없는 클래스(익명클래스) 이용
		       예>  Comparator c = new Comparator(){
		                 compare재정의
		           }
		      3) 람다표현식 이용
		         Comparator c = (값1, 값2)->{};
		       
		  */
		  // 이름없는 클래스(익명클래스) 이용
		  Comparator<Cat> comp = new Comparator<Cat>() {
			
			@Override
			public int compare(Cat c1, Cat c2) {
//				return c1.age - c2.age; // 오름차순 
				return -(c1.age - c2.age); // 내림차순 
			}
		 };
		 // 람다 표현식
		 Comparator<Cat> comp2 = (Cat c1, Cat c2)->{
//				return c1.age - c2.age; // 오름차순 
				return -(c1.age - c2.age); // 내림차순 
			};
		 Comparator<Cat> comp3 = (c1, c2)-> -(c1.age - c2.age); // 내림차순 
//		  Collections.sort(catList, comp3);
		 
		  Collections.sort(catList, (c1, c2)-> -(c1.age - c2.age));
		  
		  System.out.println(catList);
		 
		 
		 
	}//end main

}
