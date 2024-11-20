package exam28_표준API함수적인터페이스;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class Fun05_Predicate {

	public static void main(String[] args) {
//		Predicate<T> : 파라미터 있고 리턴있는 형식
//        반드시 리턴값은 boolean 으로 반환.
//    따라서 조건지정시 주로 사용됨.
// 
//    추상메서드: boolean test(T t)
//
//    하위: BiPredicate<T,U> : boolean test(T t, U u)
//        DoublePredicate   : boolean test(double value)
//	 IntPredicate      : boolean test(int value)
//	 LongPredicate     : boolean test(long value)
//       
	//    * 논리연산자에 해당하는 메서드 제공
	//    && : and()
	//    || : or()
	//    !  :  negate()
		
		
		// 1.익명클래스
		Predicate<String> s = new Predicate<String>() {
			@Override
			public boolean test(String t) {
				return t!=null;
			}
		};
		System.out.println(s.test("hello"));
		// 2. 람다표현식
		Predicate<String> x = t->t!=null;
		System.out.println(x.test("hello"));
				
				
		// 1.익명클래스
		BiPredicate<Integer, String> s2 = new BiPredicate<Integer, String>() {
			@Override
			public boolean test(Integer t, String u) {
				return u.length() > t;
			}
		};
		System.out.println(s2.test( 4, "hello"));
		// 2. 람다표현식
		BiPredicate<Integer, String> x2 = ( t,  u) -> u.length() > t;
		System.out.println(x2.test( 4, "hello"));
		
	}//end main

}
