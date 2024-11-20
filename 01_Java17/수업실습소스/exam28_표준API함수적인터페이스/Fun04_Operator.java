package exam28_표준API함수적인터페이스;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.IntToDoubleFunction;
import java.util.function.UnaryOperator;

public class Fun04_Operator {

	public static void main(String[] args) {
//		
//		Operator    :  파라미터 있고 리턴있는 형식,
//           Function 을 상속받음.
			//Function과 차이점은 Function은 파라미터타입과 리턴타입을 사용자가 임의로 설정이 가능함.
			//즉 파라미터타입과 리턴타입이 서로 다른 타입이어도 가능했음.
			//        
			//Operator 는 파라미터타입과 리턴타입이 서로 같음.
			//따라서 파라미터타입과 명시하도록 되어 있음.
			//
			//       하위: BinaryOperator<T> : T apply(T t, T u)
			//   UnaryOperator<T>  : T apply(T t)
			//   DoubleBinaryOperator : double applyAsDouble(double left, double right)
			//   DoubleUnaryOperator : double applyAsDouble(double operand)
			//   IntBinaryOperator   : int applyAsInt(int left, int right)
			//   IntUnaryOperator    : int applyAsInt(int operand)
			//   LongBinaryOperator : long applyAsLong(long left, long right)
			//   LongUnaryOperator : long applyAsLong(long operand)	
	
		 //1. 익명 클래스
		UnaryOperator<String> s = new UnaryOperator<String>() {
			@Override
			public String apply(String t) {
				return String.valueOf(t.charAt(0));
			}
		};
		System.out.println(s.apply("홍길동"));
		//2. 람다 표현식
		UnaryOperator<String> x = t -> String.valueOf(t.charAt(0));
		System.out.println(x.apply("홍길동"));
				
		//1. 익명 클래스
		BinaryOperator<Integer> s2 = new BinaryOperator<Integer>() {
			@Override
			public Integer apply(Integer t, Integer u) {
				return t + u;
			}
		};
		System.out.println(s2.apply(10,20));
		//2. 람다 표현식
		BinaryOperator<Integer> x2 =( t,  u) -> t + u;
		System.out.println(x2.apply(10,20));
		
		
		
	}//end main
}//end class
