package exam01_데이터종류;

public class PDT04_문자2_이스케이프 {

	public static void main(String[] args) {
		
		// 기본형 데이터: 문자 데이터의 이스케이프 
		
		System.out.println("helloworld");
		System.out.println("hello\tworld");
		System.out.println("hello\nworld");
		System.out.println("hello\"nworld");
		System.out.println("hello\'nworld");
		System.out.println("hello\\nworld");
		
		// 파일 경로 지정시 \\ 사용한다.  C:\java_study
		System.out.println("C:\\java_study");
		
	}

}
