package exam20_인터페이스4_loosely_coupling;

import exam20_인터페이스3_tight_coupling.MySQLDAO;

public class DBService {

	//loosely coupling : 인터페이스 이용한 간접 클래스 접근
	DBDao dao;
	public void setDAO(DBDao dao) {
		this.dao = dao;
	}
	
	public void connect() {
		dao.connectDB();
	}
}
