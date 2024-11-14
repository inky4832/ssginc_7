package exam20_인터페이스4_loosely_coupling;

public class MySQLDAO implements DBDao {

	@Override
	public void connectDB() {
		System.out.println("MySQLDAO.connectDB");
	}
}
