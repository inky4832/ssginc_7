package exam24_예외처리;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class ExceptionTest5_비런타임계열_파일읽기 {
	public static void main(String[] args) {
	
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
