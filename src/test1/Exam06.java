package test1;

public class Exam06{
	public static void dbWork(DataAccessObject dao) {
		dao.insert();
		dao.insert();
		dao.update();
		dao.delect();
	}
	public static void main(String[] args) {
		dbWork(new OracleDao());
		dbWork(new MySqlDao());
		
	}
}
