package exam05_연산자;

public class Operator05_증감연산3 {

	public static void main(String[] args) {
		
		// 증감연산자 주의할점 
		int result = getNum();
		System.out.println(result);  //전치: 11 , 후치:10
	}
	
	public static int getNum() {
		int num = 10;
		
//		return ++num;  // 전치
		return num++;  // 후치
	}
}
