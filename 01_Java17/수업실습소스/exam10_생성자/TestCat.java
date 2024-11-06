package exam10_생성자;

public class TestCat {

	public static void main(String[] args) {
		
		// 객체생성(인스턴스화)
		Cat c = new Cat();
		Cat c2 = new Cat(2);
		Cat c3 = new Cat("나비");
		Cat c4 = new Cat("나비",2);
		Cat c5 = new Cat(2, "나비");

	}

}
