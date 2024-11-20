package exam28_표준API함수적인터페이스;

import java.util.function.BiPredicate;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class Fun05_Predicate2 {

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
		
		//1. 값이 3의 배수이고 2의 배수냐?
		 
		 IntPredicate xxx = new IntPredicate() {
			@Override
			public boolean test(int n) {
				return n%3==0;
			}
		};
		
		IntPredicate x1 = n ->  n%3==0; // 3의배수 
		IntPredicate x2 = n ->  n%2==0; // 2의배수 
		
		System.out.println("3의 배수냐? " + x1.test(9));
		System.out.println("2의 배수냐? " + x2.test(8));
		
		IntPredicate result = x1.and(x2);
		System.out.println("3의 배수이고 2의 배수냐? " + result.test(6)); // true
		System.out.println("3의 배수이고 2의 배수냐? " + result.test(9)); // false
		System.out.println("3의 배수이고 2의 배수냐? " + x1.and(x2).test(9)); //false
		
		IntPredicate result2 = x1.or(x2);
		System.out.println("3의 배수이거나 2의 배수냐? " + result2.test(9) );  // true
		System.out.println("3의 배수이거나 2의 배수냐? " + x1.or(x2).test(9) );  // true
		
		IntPredicate result3 = x1.negate();
		System.out.println("3의 배수가 아니냐? " + result3.test(9) );  // false
		System.out.println("3의 배수가 아니냐? " + x1.negate().test(9) );  // false
		
		
		
	}//end main

}
