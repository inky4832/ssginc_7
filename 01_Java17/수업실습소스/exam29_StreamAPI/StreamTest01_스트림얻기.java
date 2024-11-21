package exam29_StreamAPI;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamTest01_스트림얻기 {

	public static void main(String[] args) {

		//1. 배열에서 Stream 얻기-1 (  Arrays.stream(arr) )
		String [] arr = {"홍길동","이순신","유관순"};
		Stream<String> st = Arrays.stream(arr);
		//익명클래스
		Consumer<String> c = new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		};
		//람다표현식
		Consumer<String> c2 = t->System.out.println(t);
		//메서드 참조
		Consumer<String> c3 = System.out::println;
//		st.forEach(c3);  // 사용된 stream은 재사용 불가
		st.forEach(System.out::println);
	   System.out.println("#################################");
	   
	    //1. 배열에서 Stream 얻기-2
	   String [] arr2 = {"홍길동","이순신","유관순"};
	   Stream<String> st2 = Stream.of(arr2);  // of(T t)
	   st2.forEach(System.out::println);
	   System.out.println("#################################");
	   
		//2. 리터럴에서 Stream 얻기
		Stream<String> st3 = Stream.of("홍길동","이순신","유관순");  // of(T... values)
		st3.forEach(System.out::println);
		
		/////////////////////////////////////////////////////////////
		System.out.println("#################################");
		System.out.println("#################################");
		// 3. List에서 Stream 얻기
		List<Integer> list = Arrays.asList(10,20,30);
		Stream<Integer> st4 = list.stream();
		st4.forEach(System.out::println);
		
		System.out.println("#################################");
		//4. 파일에서 Stream 얻기
		 try {
			Stream<String> st5 = Files.lines(Paths.get("c:\\", "ExceptionTest1.java"));
			st5.forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}//end main
}//end class
