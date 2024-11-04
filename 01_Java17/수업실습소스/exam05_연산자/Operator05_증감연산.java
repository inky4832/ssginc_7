package exam05_연산자;

public class Operator05_증감연산 {

	public static void main(String[] args) {
		
		// 증감연산자 
	
	
		//1. 증가 연산자
		 int num=10;
		 
		 ++num;  // 전치 연산자, num=num+1,  num+=1 동일
		 num++;  // 후치 연산자
		 System.out.println(num);
		
		//2. 감소 연산자
		 --num;  // 전치 연산자, num=num-1,  num-=1 동일
		 num--;
		 System.out.println(num);
		 
		 
		
	}
}
