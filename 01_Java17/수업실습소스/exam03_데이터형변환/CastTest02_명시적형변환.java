package exam03_데이터형변환;

public class CastTest02_명시적형변환 {

	public static void main(String[] args) {

		//명시적 형변환
		
	    int n = 10;
//	    short n2 = n; // 에러
	    short n2 = (short)n; // 형변환
		
	    short a = 10;
		short b = 20;
//		short result = a + b;// 에러
		short result = (short)(a + b); // 형변환
		
		String s = "hello";
        Object s2 = s;   // String 인 s가 Object 형으로 자동 형변환 됨.
        
 
	}

}
