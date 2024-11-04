package exam07_제어문01_조건문;

public class Statement01_단일if문 {

	public static void main(String[] args) {
		
		// 단일 if 문 :조건식(true/false) 결과에 따라서 문장의 실행여부가 결정되는 문장
		
		// 가. {} 없는 경우
		System.out.println("문장1");
if(false)System.out.println("문장2");
		System.out.println("문장3");
		System.out.println("문장4");

		// 나. {} 있는 경우 (권장)
		System.out.println("문장A");
if(false) {
	System.out.println("문장B");
	System.out.println("문장C");
}
		System.out.println("문장D");
		
	}

}
