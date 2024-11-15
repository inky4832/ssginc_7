package exam23_유틸리티;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test03_날짜1_Date {

	public static void main(String[] args) throws Exception {
		
		// java.util.Date
		// 생성방법
		Date d = new Date();
		System.out.println(d);  // d.toString()  Fri Nov 15 16:17:37 KST 2024
		
		//java.text.SimpleDateFormat 클래스 이용하면 날짜정보를 얻을수 있음.
		// Date----> String
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh:mm:ss");
		String format = sdf.format(new Date());
		System.out.println(format);  // 
		
		// String ---> Date
		String x = "2022/02/02 11:23";
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd hh:mm");
		Date d2 = sdf2.parse(x);
		System.out.println(d2);  
		
		
		
	}

}
