package exam08_배열;

public class ArrayTest03_2차원배열3 {

	public static void main(String[] args) {

		// 2차원 배열
		//  문법3- new+리터럴
		
	    int [][] num = new int[][]{ {10,20}, {30,40} };
		
		System.out.println(num[0][0]);
		System.out.println(num[0][1]);
		System.out.println(num[1][0]);
		System.out.println(num[1][1]);
		System.out.println("################################");
		//일반 for문
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				System.out.printf("num[%d][%d]=%d \n", i, j , num[i][j]);
			}
		}
		
		System.out.println("################################");
		//foreach 문
		/*
		 *  for(변수: 배열){}
		 */
		for( int [] n : num) { // 2차원 --> 1차원 추출
			for(int n2: n) {  // 1차원 --> 실제값 추출
				System.out.println(n2);
			}
		}
		
		System.out.println("행 길이:" + num.length);
		System.out.println("1행 열 길이:" + num[0].length);
		System.out.println("################################");
		
		// 참조형
		String [][] names;
	
	
	}

}
