package exam13_method4_파라미터전달;

public class MainTest {

	//메서드
	public static void  primitive_method(int x) {
		x = 100;
	}
	public static void  reference_method(int [] y) {
		y[0]=100;
	}
	
	//Cat 수정
	public static void setCat(Cat x) {  // x값은 주소값 (0x100 )
		x.name="망치";
	}
	
	public static void main(String[] args) {

		// 참조형 전달
		Cat c = new Cat("나비", 2);
		System.out.println("참조형 전달 전: " + c.name +"\t" + c.age ); //  나비, 2 		
		setCat(c);  // c값은 주소값 (0x100 )
		System.out.println("참조형 전달 후: " + c.name +"\t" + c.age ); //  망치, 2		
		
		
//		//기본형 전달
//		int num = 10;
//		System.out.println("기본형 전달 전: " + num ); //  10
//		primitive_method(num);
//		System.out.println("기본형 전달 후: " + num ); //  10 ( 원래값은 수정 안됨 )
//		
//		//참조형 전달
//		int [] arr = {10,20,30}; // int [] arr = new int[]{10,20,30} 과 동일
//		System.out.println("참조형 전달 전: " + arr[0] ); //  10		
//		reference_method(arr);
//		System.out.println("참조형 전달 후: " + arr[0] ); // 	100	( 원래값이 수정됨 )
		
		
		
	}
}
