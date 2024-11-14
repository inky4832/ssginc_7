package exam20_인터페이스3_tight_coupling;

public class TestMain {

	public static void main(String[] args) {
		DBService service = new DBService();
//		OracleDAO dao = new OracleDAO();
//		service.setDAO(dao);
//		service.setDAO(new OracleDAO());
		service.setDAO(new MySQLDAO());
		service.connect();
	}

}
