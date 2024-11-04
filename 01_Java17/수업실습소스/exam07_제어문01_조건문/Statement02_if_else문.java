package exam07_제어문01_조건문;

public class Statement02_if_else문 {

	public static void main(String[] args) {
		
		// if~else문 : 조건식(true/false) 결과에 따라서 실행되는 문장이 달라지는 경우.
		
		if(false)
			System.out.println("문장1");
		else
			System.out.println("문장2");
			
		if(false) {
			System.out.println("문장A");
			System.out.println("문장A-1");
		}else {
			System.out.println("문장B");
			System.out.println("문장B-1");
		}
		
	}

}
