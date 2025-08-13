package db;

import java.sql.SQLException;
import java.util.Scanner;

public class DB_Ex4 {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		// STUDENT
		// 학번을 입력받아서 해당 학번의 학생이 있으면 해당학생의 키를 1 증가 후 '키를 1 증가했습니다' 출력
		// 없으면 '학생이 없습니다' 출력
		Scanner s = new Scanner(System.in);
		DBClass db = new DBClass();
		System.out.print("학번을 입력하시오: ");
		String name = s.next();

		String sql = "UPDATE STUDENT SET stu_height = stu_height + 1 WHERE stu_no = '" + name + "'";
		
		int num = db.stmt.executeUpdate(sql); // num에 SQL 실행 결과로 영향을 받은 행(row)의 개수가 저장(삭제된 개수)

		if (num > 0) {
			System.out.println("키를 1 증가했습니다");
		} else {
			System.out.println("해당 학생이 없습니다.");
		}
	}

}
