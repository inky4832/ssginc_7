package exam27_Arrays_Collections유틸리티;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsTest {

	public static void main(String[] args) {
		
		 //1. shuffle 기능
		List<Integer> list = Arrays.asList(9,2,1,34,67);
		 Collections.shuffle(list);
		 System.out.println("1. shuffle 기능: " +  list);
		 
		 //2. copy 기능
		 List<Integer> x = Arrays.asList(9,2,1,34,67); // 5개
		 List<Integer> x2 = Arrays.asList(10,20,30,40); //4개
		 
		 Collections.copy(x, x2);  // (dest, src)
//		 Collections.copy(x2, x);  // (dest, src) // src가 더 크기 때문에 에러발생
		 System.out.println("2. copy: x" + x); // [10, 20, 30, 40, 67]
		 System.out.println("2. copy: x2" + x2); // [10, 20, 30, 40]
		 
	}

}
