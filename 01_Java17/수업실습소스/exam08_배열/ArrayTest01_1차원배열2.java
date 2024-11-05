package exam08_배열;

public class ArrayTest01_1차원배열2 {

	public static void main(String[] args) {

		// 배열 사용 문법-2
	
		// 1. 기본형 데이터 배열
		/*
		     num(0X100) ------------------> |10|20|30|
		                                     0  1  2   
		 */
		
		 int [] num = {10,20,30};
		 System.out.println(num.length);
		 System.out.println(num[0]);
		 
		 //일반 for 문
		 for (int i = 0; i < num.length; i++) {
			 System.out.println(">>>" + num[i]);
		 }
		 
		 for (int i : num) {
			 System.out.println("###"+ i);
		}
		 
		 System.out.println("########################################");
		 
		// 2. 참조형 데이터 배열
		 /*
	        names(0X200) ------------------> |"홍길동"|"이순신"|
	                                             0      1  
	      */
		 String [] names = {"홍길동","이순신"};
		 System.out.println(names.length);
		 System.out.println(names[0]);
		 //일반 for 문
		 for (int i = 0; i < names.length; i++) {
			 System.out.println(">>>>>" + names[i]);
		}
		 for (String s : names) {
			 System.out.println("###"+ s);
		}
	}

}
