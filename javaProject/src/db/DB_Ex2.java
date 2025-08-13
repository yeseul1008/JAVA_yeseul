package db;

import java.sql.SQLException;

public class DB_Ex2 {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		DBClass db = new DBClass();
		
		String sql = "DELETE FROM STUDENT WHERE STU_NAME = '옥성우'";
		int num = db.stmt.executeUpdate(sql);  //num에 SQL 실행 결과로 영향을 받은 행(row)의 개수가 저장(삭제된 개수)
		
		if(num > 0 ) {
			System.out.println("삭제되었습니다");
		}else {
			System.out.println("해당 학생이 없습니다.");
		}
		
		
	}

}
