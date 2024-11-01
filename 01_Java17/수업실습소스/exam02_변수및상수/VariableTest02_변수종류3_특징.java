package exam02_변수및상수;

public class VariableTest02_변수종류3_특징 {

	int n = 20;
	
	public static void main(String[] args) {
	
		
	     //1. 변수명 중복 선언 불가
		 int n = 10;
		 //String n = "홍길동";
		 
		 //2. 로컬변수는 사용전에 반드시 초기화
		 int m;
		 //System.out.println(m);
		 
		 //3. 블럭 scope
		 {
			int k = 10;
			System.out.println(k);
		 }
		 //System.out.println(k);  블럭 외부에서 사용 불가
		
		 
		 int k2;
		 {
			 //int k2 = 20;
			 k2=20;
		 }
		 System.out.println(k2);
		 
	}//end main 메서드

}
