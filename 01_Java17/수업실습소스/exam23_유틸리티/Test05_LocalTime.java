package exam23_유틸리티;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Test05_LocalTime {

	public static void main(String[] args) throws Exception {
		
		// java.time.LocalTime
		
		
		//현재 시간
		LocalTime time = LocalTime.now();
		System.out.println(time);  // 10:32:05.297651900
		
		// 특정 시간 설정
		LocalTime time2 = LocalTime.of(9,10, 10);
		System.out.println(time2);  // 09:10:10

		// str ---> LocalTime
		String str = "14:56:10";  
		LocalTime time3 = LocalTime.parse(str, DateTimeFormatter.ofPattern("HH:mm:ss"));  // hh: 1~12, HH:24
		System.out.println(time3);  // 14:56:10
		
		String str2 = "14시56분10초";  
		LocalTime time4 = LocalTime.parse(str2, DateTimeFormatter.ofPattern("HH시mm분ss초"));  // hh: 1~12, HH:24
		System.out.println(time4);  // 14:56:10
	}

}
