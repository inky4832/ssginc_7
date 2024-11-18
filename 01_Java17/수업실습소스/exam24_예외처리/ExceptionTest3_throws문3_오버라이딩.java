package exam24_예외처리;

import java.io.IOException;
import java.sql.SQLException;
class Parent{
	public void a() throws ArithmeticException{}
	public void a2() throws RuntimeException{}
	public void a3(){}
	public void a4() throws IOException{}
	public void a5() throws ArithmeticException{}
}

class Child extends Parent{
	@Override
	public void a() throws ArithmeticException{}
	@Override
//	public void a2() throws Exception{}  // 부모보다 확대 불가, 축소 가능
	public void a2() {}  // 축소 가능
	@Override
	public void a3()throws Exception{}   // 부모보다 확대 불가
	@Override
	public void a4()throws SQLException{}   // 부모보다 확대 불가
	@Override
	public void a5() throws RuntimeException{}  // RuntimeException 계열은 무시한다.
}

public class ExceptionTest3_throws문3_오버라이딩 {
	public static void main(String[] args) {
	
	}
}
