package exam20_인터페이스4_loosely_coupling;

public class OracleDAO implements DBDao {

	@Override
	public void connectDB() {
		System.out.println("OracleDAO.connectDB");
	}

}
