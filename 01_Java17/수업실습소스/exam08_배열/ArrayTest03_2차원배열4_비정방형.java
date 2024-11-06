package exam08_배열;

public class ArrayTest03_2차원배열4_비정방형 {

	public static void main(String[] args) {

		// 2차원 배열
		
		//1. 문법1- new
		int [][] num;
		num = new int[2][]; // 행크기만 지정
		
		//열 생성
		num[0]=new int[2];
		num[1]=new int[1];
		
		//초기화
		num[0][0]=10;
		num[0][1]=20;
		num[1][0]=30;
		
		//2. 문법2 - 리터럴
		int [][] num2 = { {1,2}, {3} };
		
		//3. 문법3- new+리터럴
		int [][] num3 = new int[][]{ {100,200}, {300} };
		
	    //foreach 문으로 출력
		for (int [] is : num3) {
			for (int n : is) {
				System.out.println(n);
			}
		}
	
	
	}

}
