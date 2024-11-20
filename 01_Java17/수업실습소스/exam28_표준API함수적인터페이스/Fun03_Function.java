package exam28_표준API함수적인터페이스;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.IntToDoubleFunction;

public class Fun03_Function {

	public static void main(String[] args) {
//		 Function<T,R> :  파라미터 있고 리턴있는 형식 (***********)
//         
//	        추상메서드: R apply(T t)
//	       
//             하위: BiFunction<T,U,R> : R apply(T t, U u)
//		     DoubleFunction<R> : R apply(double value)
//		     IntFunction<R>    : R apply(int value)
//		     LongFunction<R>    : R apply(long value)
//		     DoubleToIntFunction : int applyAsInt(double value)
//		     DoubleToLongFunction : long applyAsLong(double value)
//		     IntToDoubleFunction  : double applyAsDouble(int value)
//		     IntToLongFunction    : long applyAsLong(int value)
//		     LongToDoubleFunction : double applyAsDouble(long value)
//		     LongToIntFunction    : int applyAsInt(long value)
//		     ToDoubleBiFunction<T,U> : double applyAsDouble(T t, U u)
//		     ToDoubleFunction<T> : double applyAsDouble(T value)
//		     ToIntBiFunction<T,U> : int applyAsInt(T t, U u)
//		     ToIntFunction<T>     : int applyAsInt(T value)
//		     ToLongBiFunction<T,U>  : long applyAsLong(T t, U u)
//		     ToLongFunction<T>   : long applyAsLong(T value)
		
		//1. 익명클래스
		Function<String, Integer> f = new Function<String, Integer>() {
			@Override
			public Integer apply(String t) {
				return t.length();
			}
		};
		System.out.println(f.apply("hello"));
		//2. 람다표현식
		Function<String, Integer> x = t ->t.length();
		System.out.println(x.apply("hello"));
		
		
		//1. 익명클래스
		IntFunction<Integer> f2 = new IntFunction<Integer>() {
			@Override
			public Integer apply(int value) {
				return value * 100;
			}
		};
		System.out.println(f2.apply(3));
		//2. 람다표현식
		IntFunction<Integer> x2 = value ->  value * 100;
		System.out.println(x2.apply(3));
		
		
		//1. 익명클래스
		IntToDoubleFunction f3 = new IntToDoubleFunction() {
			@Override
			public double applyAsDouble(int value) {
				return value / 3.0;
			}
		};
		System.out.println(f3.applyAsDouble(10));
		//2. 람다표현식
		IntToDoubleFunction x3 = value -> value / 3.0;
		System.out.println(x3.applyAsDouble(10));
		
		//1. 익명클래스
		BiFunction<String, String, String> f4 = new BiFunction<String, String, String>() {
			
			@Override
			public String apply(String t, String u) {
				return t.concat(u);
			}
		};
		System.out.println(f4.apply("hello","world"));
		
		//2. 람다표현식
		BiFunction<String, String, String> x4 =( t,  u)->t.concat(u);
		System.out.println(x4.apply("hello","world"));
	}

}
