package exam27_Arrays_Collections유틸리티;

import java.util.Arrays;
import java.util.List;

public class ArraysTest {

	public static void main(String[] args) {
		// java.util.Arrays 클래스 
		
		//1. 배열 출력 : Arrays.toString()
		int [] num = {4,1,87,35};
		System.out.println("1. 배열출력: " + Arrays.toString(num));  // [4, 1, 87, 35]
		
		//2. 정렬 : Arrays.sort()
		int [] num2 = {4,1,87,35};
		Arrays.sort(num2);  // 오름차순(기본)
		System.out.println("2. 정렬: " + Arrays.toString(num2));  // [1, 4, 35, 87]

		//3. List로 생성 : Arrays.asList(T ... 변수), ... 가변인자
		List<String> list = Arrays.asList("A","B");
		System.out.println("3. List로 생성: " + list);  // [A, B]
		
		//4. 특정값으로 모든 배열 채우기:Arrays.fill(배열, 채울값);
		int [] num3 = {4,1,87,35,55,22};
		Arrays.fill(num3, 100);
		System.out.println("4. 특정값으로 모든 배열 채우기: " +  Arrays.toString(num3));  // [100, 100, 100, 100, 100, 100]
	
		//5. 특정값으로 범위지정해서 배열 채우기:Arrays.fill(배열, 시작idx, 끝idx, 채울값);
		int [] num4 = {4,1,87,35,55,22};
		Arrays.fill(num4, 0, 3, 100);
		System.out.println("5. 특정값으로 범위지정해서 배열 채우기: " +  Arrays.toString(num4));  // [100, 100, 100, 35, 55, 22]
		
		// 6. 배열 비교 : Arrays.equals(x, x2)
		int [] x = {4,1,87,35,55,22};
		int [] x2 = {4,1,87,35,55,21};
		System.out.println("6. 배열 비교: " +  Arrays.equals(x, x2));  //false
		
		//7. 배열 크기 변경 Arrays.copyOf(배열, 새로운 크기);
		int [] y = {4,1,87};
		int [] y2 = Arrays.copyOf(y, 5);
		System.out.println("7. 배열 크기 변경: " +  Arrays.toString(y2));  // [4, 1, 87, 0, 0]
		
		//8. 부분배열 Arrays.copyOfRange(배열,  from , to);		
		int [] k = {4,1,87,35,55,22};
		int [] k2 = Arrays.copyOfRange(k, 0, 4);
		System.out.println("8. 부분배열: " +  Arrays.toString(k2));  // [4, 1, 87, 35]
		
		
		//9. 정렬된 배열의 값의 idx 얻기 : Arrays.binarySearch(배열, 값), 반드시 정렬 필요
		int [] z = {4,1,87,35,55,22};
       Arrays.sort(z); // [1, 4, 22, 35, 55, 87]
		System.out.println("9. 정렬된 배열의 값의 idx 얻기: " +  Arrays.binarySearch(z,55));  
		
		
		
		
	}

}
