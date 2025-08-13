package db;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DB_Ex5 {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		// 2. 아이디, 비번, 이름, 성별, 나이를 입력받은 후
		// TBL_USER에 저장, (CDATETIME는 현재시간 저장)
		// 단, 아이디 입력시 이미 있는 아이디를 입력할 경우
		// 이미 사용중인 아이디입니다 출력후 다시 입력받도록
		Scanner s = new Scanner(System.in);
		DBClass db = new DBClass(); // 데이터베이스에 연결

		String id = "";
		boolean idCheck = true;
		while(idCheck) {
			System.out.print("아이디를 입력하세요: ");
			id = s.next();
			ResultSet rs = db.stmt.executeQuery("SELECT * FROM TBL_USER WHERE USERID = '" +id+"'");
			idCheck = rs.next();	// 이미 있는 아이디면 true가 리턴됨	없는 아이디면 false
		}
	

		System.out.print("비밀번호를 입력하세요: ");
		String pwd = s.next();
		System.out.print("이름을 입력하세요: ");
		String name = s.next();
		System.out.print("성별을 입력하세요: ");
		String gender = s.next();
		System.out.print("나이를 입력하세요: ");
		String age = s.next();

		String query = "INSERT INTO TBL_USER VALUES("
				+ "'" + id + "',"
				+ "'" + pwd + "',"
				+ "'" + name + "',"
				+ "'" + gender +"',"
				+ "'" + age + "',"
				+ "SYSDATE)";
		int num = db.stmt.executeUpdate(query);
		if(num > 0) {
			System.out.println("가입되었습니다");
		}else {
			System.out.println("오류가 발생했습니다");
		}

	}

}
