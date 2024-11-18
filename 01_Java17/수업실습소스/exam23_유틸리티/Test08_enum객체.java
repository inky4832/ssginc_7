package exam23_유틸리티;


public class Test08_enum객체 {

	public static void main(String[] args) throws Exception {
		
		Day day = Day.MONDAY;
		
		switch (day) {
		case SUNDAY: System.out.println("SUN");break;
		case MONDAY: System.out.println("MONDAY");break;
		case TUESDAY: System.out.println("TUESDAY");break;
		case WEDNESDAY: System.out.println("WEDNESDAY");break;
		case THURSDAY: System.out.println("THURSDAY");break;
		case FRIDAY: System.out.println("FRIDAY");break;
		case SATURDAY: System.out.println("SATURDAY");break;
		default:System.out.println("default");break;
		}
	
	}
}
