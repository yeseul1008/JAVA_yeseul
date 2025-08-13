package db;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DB_Ex6 {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		// 로그인
		// 아이디, 비밀번호 입력받아서
		// 두개와 일치하는 레코드가 있으면 '로그인 성공!'
		// 없으면 '로그인 실패!'
		
		Scanner s = new Scanner(System.in);
		DBClass db = new DBClass(); 
		
		System.out.print("아이디를 입력하세요: ");
		String id = s.next();
		ResultSet rs1 = db.stmt.executeQuery("SELECT * FROM TBL_USER WHERE USERID = '" +id+"'");  //아이디가 DB에 있는지 확인하는 쿼리 실행
		boolean idCheck = rs1.next(); // 결과가 있으면 true (아이디 존재), 없으면 false
		
		System.out.print("비밀번호를 입력하세요: ");
		String pwd = s.next();
		ResultSet rs2 = db.stmt.executeQuery("SELECT * FROM TBL_USER WHERE PASSWORD = '" +pwd+"'");
		boolean pwCheck = rs2.next();
		
		if(idCheck == true && pwCheck == true) {
			System.out.println("로그인 성공!");
		}else {
			System.out.println("로그인 실패!");
		}
		
		
	}

}
