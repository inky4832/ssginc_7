package exam29_StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StreamTest02_중간처리2_가공2 {

	public static void main(String[] args) {
		
		// 중간처리
        /*
         *  flatMap(Function<? super T,? extends Stream<? extends R>> mapper)
             하나의 파라미터가 전달되어 여러개의 값을 가진 리턴값으로 반환됨.
	        예> "a/b/c" ==>[a,b,c]		
	            "홍길동/이순신/유관순" ==> ["홍길동","이순신","유관순"] 배열로 만들어서 Stream<String>으로 리턴
	                               ==> [3,3, 3] 배열로 만들어서 Stream<Integer>으로 리턴
         */
		
		List<String> list = Arrays.asList("홍길동/이순신/유관순", "이몽룡/정조/영조");
		
		Function<String, Stream<String>> f = new Function<String, Stream<String>>() {
			@Override
			public Stream<String> apply(String t) {
				String [] names = t.split("/");  //  ["홍길동","이순신","유관순"]
				return Arrays.stream(names);
			}
		};
		
		list.stream().flatMap(f).forEach(System.out::println);
		
		// 리스트로 변경
		List<String> result = list.stream().flatMap(f).collect(Collectors.toList());
		System.out.println(result);
		
		
	}
}





