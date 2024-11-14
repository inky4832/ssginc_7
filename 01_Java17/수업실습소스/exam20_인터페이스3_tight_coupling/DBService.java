package exam20_인터페이스3_tight_coupling;

public class DBService {

	//tight coupling : 직접 클래스 접근
	MySQLDAO dao;
	
	public void setDAO(MySQLDAO dao) {
		this.dao = dao;
	}
	
	public void connect() {
		dao.connectMySQL();
	}
}
