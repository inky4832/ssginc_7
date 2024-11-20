package exam28_표준API함수적인터페이스;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.ObjIntConsumer;
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

public class Fun01_Consumer {

	public static void main(String[] args) {
//		 @FunctionalInterface <== 반드시 단 하나의 추상메서드만 가지도록 강제한다.
//				    Consumer<T> : 파라미터 있고 리턴없는 형식
//				                 추상메서드: void accept(T t)
//
//				               하위: BiConsumer<T,U> : void accept(T t, U u)
//					           DoubleConsumer   :void accept(double value)
//						   IntConsumer      : void accept(int value)
//						   LongConsumer     : void accept(long value)
//				           ObjDoubleConsumer<T> : void accept(T t, double value)
//						   ObjIntConsumer<T>   : void accept(T t, int value)
//						   ObjLongConsumer<T>  : void accept(T t, long value)

		// 1. 익명클래스
		 Consumer<String> c  = new Consumer<String>() {
			@Override
			public void accept(String s) {
				System.out.println(s);
			}
		};
		c.accept("홍길동");
		
		//2. 람다표현식
		Consumer<String> x  = s -> System.out.println(s);
		x.accept("홍길동");
				
				
		
		// 1. 익명클래스
		Consumer<Cat> c2 = new Consumer<Cat>() {
			@Override
			public void accept(Cat t) {
				System.out.println(t);				
			}
		};
		c2.accept(new Cat("나비", 2));
		
		//2. 람다표현식
		Consumer<Cat> x2 = t->System.out.println(t);	
		x2.accept(new Cat("나비", 2));
		
		
		// 1. 익명클래스
		IntConsumer c3 = new IntConsumer() {
			@Override
			public void accept(int value) {
				System.out.println(value);
			}
		};
		c3.accept(100);
		
		//2. 람다표현식
		IntConsumer x3 = value->System.out.println(value);
		x3.accept(100);
		
		
		// 1. 익명클래스
		BiConsumer<String, Integer> c4 = new BiConsumer<String, Integer>() {
			@Override
			public void accept(String t, Integer u) {
				System.out.println(t+"\t"+ u);				
			}
		};
		c4.accept("홍길동", 20);
		
		//2. 람다표현식
		BiConsumer<String, Integer> x4 = ( t, u) -> System.out.println(t+"\t"+ u);		
		x4.accept("홍길동", 20);
		
		// 1. 익명클래스
		ObjIntConsumer<String> c5 = new ObjIntConsumer<String>() {
			
			@Override
			public void accept(String t, int value) {
				System.out.println(t+"\t"+ value);				
			}
		};
		c5.accept("홍길동2", 30);
		//2. 람다표현식
		ObjIntConsumer<String> x5 =( t,  value)-> System.out.println(t+"\t"+ value);
		x5.accept("홍길동2", 30);
		
	}//end main

}
