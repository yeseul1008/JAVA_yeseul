package db;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DB_Ex3 {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		DBClass db = new DBClass();
		// 1. TBL_USER에 있는 모든 사용자 출력
		// 출력 컬럼은 아이디, 이름, 성별(M이면 남자, F면 여자로 출력)
		// 출력 형식은 '아이디 : hong1234, 이름: 홍길동, 성별 : 남자'
		String sql = "SELECT * FROM TBL_USER";
		ResultSet rs = db.stmt.executeQuery(sql); //주어진 sql문 실행하고 결과를 반환함
		while(rs.next()) { //rs 개수만큼 반복
			String id = rs.getString("USERID");
			String name = rs.getString("NAME");
			String gender = rs.getString("GENDER").equals("M") ? "남자" : "여자";
		
			System.out.println("아이디 : " + id +", 이름 : "+name+", 성별: "+gender);
		}
		
		
	}

}
