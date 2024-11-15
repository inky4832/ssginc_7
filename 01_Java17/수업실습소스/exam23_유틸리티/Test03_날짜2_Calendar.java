package exam23_유틸리티;

import java.util.Calendar;

public class Test03_날짜2_Calendar {

	public static void main(String[] args) throws Exception {
		
		// java.util.Calendar
		
		Calendar cal = Calendar.getInstance(); // new 사용안함. 
		// 현재날짜 정보 출력
		System.out.println("년도:" +  cal.get(Calendar.YEAR));  // 2024
		System.out.println("월:" +  (cal.get(Calendar.MONTH) + 1));   // 11
		System.out.println("일:" +  cal.get(Calendar.DAY_OF_MONTH)); // 15
		System.out.println("시간:" +  cal.get(Calendar.HOUR_OF_DAY));  // 16
		System.out.println("분:" +  cal.get(Calendar.MINUTE));        // 44
		System.out.println("초:" +  cal.get(Calendar.SECOND));       // 54
		
		//특정날짜 설정
		Calendar cal2 = Calendar.getInstance(); 
		cal2.set(2022, 0, 12);
		System.out.println("년도:" +  cal2.get(Calendar.YEAR));  // 2022
		System.out.println("월:" +  (cal2.get(Calendar.MONTH) + 1));   // 1
		System.out.println("일:" +  cal2.get(Calendar.DAY_OF_MONTH)); // 12
		
	}

}
