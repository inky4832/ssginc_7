package exam05_연산자;

public class Operator05_증감연산2 {

	public static void main(String[] args) {
		
		// 증감연산자 주의할점 
	
		 int num=10;
		 
//		 int result=++num;  // 전치
//		 System.out.println(num + " " + result);  // 11 11
		 
		 int result=num++;  // 후치
		 System.out.println(num + " " + result);  // 11 10
		
	}
}
