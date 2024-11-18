package exam23_유틸리티;

class Earth{ 
    private static Earth e;
	private Earth(){  // 외부에서 new Earth() 불가능.
	            // e = new Earth();
	}
	public static Earth getInstance(){
	       if(e==null){
	            e = new Earth();
	       }
	    return e;
    }
 }
public class SingleTonDesignPatternTest {
	public static void main(String[] args) {
		  Earth xxx = Earth.getInstance();
          Earth xxx2 = Earth.getInstance();
	    System.out.println(xxx == xxx2 ); // true
	}
}
