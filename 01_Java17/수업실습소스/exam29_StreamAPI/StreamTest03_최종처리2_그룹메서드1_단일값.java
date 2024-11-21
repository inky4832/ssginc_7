package exam29_StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest03_최종처리2_그룹메서드1_단일값 {

	public static void main(String[] args) {
	
		
		//1. 배열 단일값
		int [] num = { 1,2,3,4,5};
		
		IntStream st = Arrays.stream(num);
		OptionalInt x = st.max();
		System.out.println("최대값:" + x +"\t" + x.getAsInt());
		
		OptionalInt x2 = Arrays.stream(num).min();
		System.out.println("최소값:" + x2 +"\t" + x2.getAsInt());
		System.out.println("합계:" + Arrays.stream(num).sum());
		OptionalDouble x3 = Arrays.stream(num).average();
		System.out.println("평균:" + x3 +"\t" + x3.getAsDouble());
		System.out.println("갯수:" + Arrays.stream(num).count());
		
		System.out.println("###########################################");
		//2. 리스트 단일값
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		Stream<Integer> st2 = list.stream();
		IntStream st3 = st2.mapToInt(t-> t);
		System.out.println("최대값:" +  st3.max().getAsInt());
		System.out.println("최소값:" + list.stream().mapToInt(t-> t).min() +"\t" +list.stream().mapToInt(t-> t).min().getAsInt());
		System.out.println("합계:" + list.stream().mapToInt(t-> t).sum());
		System.out.println("평균:" +list.stream().mapToInt(t-> t).average() +"\t" + list.stream().mapToInt(t-> t).average().getAsDouble());
		System.out.println("갯수:" + list.stream().mapToInt(t-> t).count());
		
		
		
	}
}





