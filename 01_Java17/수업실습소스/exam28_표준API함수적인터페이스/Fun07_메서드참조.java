package exam28_표준API함수적인터페이스;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

class Dog{
	
	int num = 100;
	//생성자
	public Dog() {}
	public Dog(String n, int n2) {}
	
	//static 메서드
	public static int aaa(int n, int n2) {
		return n+n2;
	}
	//instance 메서드
	public int bbb(int n, int n2) {
		return n*n2;
	}
}

public class Fun07_메서드참조 {
	public static void main(String[] args) {

		// static 메서드 :   클래스명::static메서드명
		BinaryOperator<Integer> xxx = new BinaryOperator<Integer>() {
			@Override
			public Integer apply(Integer t, Integer u) {
				return Dog.aaa(t, u);
			}
		};
		
		BinaryOperator<Integer> s = (t,  u)-> Dog.aaa(t, u);
		BinaryOperator<Integer> s2 = Dog::aaa;  // 클래스명::static메서드명
		System.out.println(s2.apply(10, 20));
		
		// "10" --> 10
		Function<String, Integer> xxx2 = new Function<String, Integer>() {
			@Override
			public Integer apply(String t) {
				return Integer.parseInt(t);
			}
		};
		
		Function<String, Integer> s3 = t -> Integer.parseInt(t);
		Function<String, Integer> s4 = Integer::parseInt; // 클래스명::static메서드명
		System.out.println(s4.apply("10") + 20);
		
		// instance 메서드 ==> 참조변수::메서드
		Dog d = new Dog();
		
		BinaryOperator<Integer> yyy = new BinaryOperator<Integer>() {
			@Override
			public Integer apply(Integer t, Integer u) {
				return d.bbb(t, u);
			}
		};
		
		BinaryOperator<Integer> s5 = (t,  u)->d.bbb(t, u);
		BinaryOperator<Integer> s6 = d::bbb;
		System.out.println(s6.apply(10, 3));
		
		// "hello" ---> 모두 대문자로 반환
		UnaryOperator<String> yyy2 = new UnaryOperator<String>() {
			@Override
			public String apply(String t) {
				return t.toUpperCase();
			}
		};
		UnaryOperator<String> s7 = t -> t.toUpperCase();
		// static 메서드는 아니지만 t에 해당되는 데이터타입이 없기 때문에 클래스명으로 사용한다.
		UnaryOperator<String> s8 = String::toUpperCase; 
		System.out.println(s8.apply("hello"));
		
		// 생성자 ==> 클래스명::new
		Supplier<Dog>  zzz = new Supplier<Dog>() {
			@Override
			public Dog get() {
				return new Dog();
			}
		};
		Supplier<Dog> s9 = ()-> new Dog();
		Supplier<Dog> s10 = Dog::new;
		System.out.println(s10.get().num);
		
		// System.out.println  ==> System.out::println
		Consumer<String> x  = m -> System.out.println(m);
		Consumer<String> x2  = System.out::println;
		x2.accept("홍길동");
		
	}//end main

}
