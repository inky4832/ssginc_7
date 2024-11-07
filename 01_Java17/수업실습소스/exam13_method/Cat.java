package exam13_method;

public class Cat {

	private String name;
	private int age;
	
	//생성자
	public Cat() {
		System.out.println("Cat 생성자");		
	}
	//메서드
	//1. 파라미터 없고 리턴값 없는 메서드 형식
	public void method1() {
		System.out.println("method1");
	}
	
	
	//2. 파라미터 있고 리턴값이 없는 형식
	// 오버로딩 (overloading) 가능.( 재사용이 가능)
	public void method2(String n) {
		System.out.println("method2(String n)" + n);		
	}
    public void method2(int n) {
    	System.out.println("method2(int n)" + n);		
	}
    public void method2(String n, int n2) {
    	System.out.println("method2(String n, int n2)" + n +"\t" + n2);		
	}
    
    //3. 파라미터 없고 리턴값이 있는 형식
    public int method3() {
    	System.out.println("method3");
    	return 100; // 실제로는 method3에서 연산된 임의의 정수값
    }
    
    //4. 파라미터 있고 리턴값도 있는 형식
    public int method4(int n, int n2) {
    	System.out.println("method4");
    	return n+n2;
    }
}


















