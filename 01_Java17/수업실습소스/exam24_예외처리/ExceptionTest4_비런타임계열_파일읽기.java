package exam24_예외처리;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class ExceptionTest4_비런타임계열_파일읽기 {
	public static void main(String[] args) {
	
		// java.io 패키지에 있는 클래스의 메서드를 사용할 때는
		//  반드시 try~catch 또는 throws 문을 사용해야 된다.
		//읽을 파일 설정
		File f = new File("c:\\ExceptionTest1.java");
		
		// 파일을 읽을 클래스
		try {
			FileReader reader = new FileReader(f); // FileNotFoundException
			int n = reader.read();  // IOException
			System.out.println((char)n);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
