package exam28_표준API함수적인터페이스;

import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class Fun02_Supplier {

	public static void main(String[] args) {
//		Supplier<T> : 파라미터 없고 리턴있는 형식  
//        추상메서드: T get()
//
//      하위: BooleanSupplier : boolean getAsBoolean()
//      DoubleSupplier   : double getAsDouble()
//  IntSupplier      : int getAsInt()
//  LongSupplier     : long getAsLong()
		
		//1. 익명클래스
		Supplier<String> s = new Supplier<String>() {
			@Override
			public String get() {
				return "홍길동";
			}
		};
		System.out.println(s.get());
		//2. 람다표현식
		Supplier<String> x = ()->"홍길동";
		System.out.println(x.get());
		
		//1. 익명 클래스
		IntSupplier s2 = new IntSupplier() {
			@Override
			public int getAsInt() {
				return 100;
			}
		};
		System.out.println(s2.getAsInt());
		//2. 람다표현식
		IntSupplier x2 = ()-> 100;
		System.out.println(x2.getAsInt());
	}

}
