package exam23_유틸리티;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Test04_LocalDate {

	public static void main(String[] args) throws Exception {
		
		// java.time.LocalDate
		
		
		//현재 날짜
		LocalDate today = LocalDate.now();
		System.out.println(today);  // 2024-11-18
		
		LocalDate today2 = today.minusDays(2);
		today2 = today.minusMonths(2);
		today2 = today.minusYears(2);
		System.out.println(today2);  // 2024-11-16
		
		LocalDate today3 = today.plusDays(2);
		today3 = today.plusMonths(2);
		today3 = today.plusYears(2);
		System.out.println(today3);  // 2024-11-20
		
		//특정날짜 설정-1
		LocalDate xxx = LocalDate.of(1999, 10, 12);
		System.out.println(xxx);  // 1999-10-12
		
		// str---> LocalDate
		// LocalDate parse(CharSequence text, DateTimeFormatter formatter)
		String str = "1999-10-12";
		LocalDate xxx2 = LocalDate.parse(str, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		System.out.println(xxx2);  // 1999-10-12
		
		String str2 = "1999년10월12일";
		LocalDate xxx3 = LocalDate.parse(str2, DateTimeFormatter.ofPattern("yyyy년MM월dd일"));
		System.out.println(xxx3);  // 1999-10-12
		
	}

}
