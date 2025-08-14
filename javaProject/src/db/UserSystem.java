package db;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class UserSystem {

	public static String id;

	public static boolean login() throws SQLException {
		Scanner s = new Scanner(System.in);
		DBClass db = new DBClass();
		boolean loginOK = true;
		System.out.print("아이디를 입력하세요: ");
		UserSystem.id = s.next();
		ResultSet rs1 = db.stmt.executeQuery("SELECT * FROM TBL_USER WHERE USERID = '" + id + "'"); // 아이디가 DB에
																									// 있는지 확인하는															// 쿼리 실행
		boolean idCheck = rs1.next(); // 결과가 있으면 true (아이디 존재), 없으면 false

		System.out.print("비밀번호를 입력하세요: ");
		String pwd = s.next();
		ResultSet rs2 = db.stmt.executeQuery("SELECT * FROM TBL_USER WHERE PASSWORD = '" + pwd + "'");
		boolean pwCheck = rs2.next();

		if (idCheck == true && pwCheck == true) {
			System.out.println("로그인 성공!");
			return loginOK = true;
		} else if (idCheck == true && pwCheck == false) {
			System.out.println("비밀번호를 확인해주세요.");
			return loginOK = false;
		} else {
			System.out.println("아이디를 확인해주세요.");
			return loginOK = false;
		}
	}

	public static void main(String[] args) throws SQLException {
		DBClass db = new DBClass();
		// 사용자 관리 시스템
		// 메뉴 1. 회원가입
//		 		  -> 아이디, 비밀번호, 이름 입력 받은 후 저장
//				  -> 가입일자는 현재 시간으로 넣기
//				  -> 아이디는 중복체크. 중복된 아이디 입력 시 다시 입력하도록
		// 메뉴 2. 로그인
//				  -> 아이디, 비밀번호 입력 받은 후 
//				  -> 아이디는 있는데 비밀번호가 다를 경우 -> '비밀번호를 확인해주세요'
//				  -> 아이디가 없는경우 '아이디를 확인해주세요'
//				  -> 둘다 일치하는 경우 '로그인 성공!'
		// 메뉴 3. 비밀번호수정
//				  -> 2번 과정을 그대로 진행한 후 로그인 성공 시 진행
//				  -> 로그인 성공 후 새롭게 수정할 비밀번호 입력받은 후 업데이트
		// 메뉴 4. 정보확인
//				  -> 2번 과정을 그대로 진행한 후 로그인 성공 시 진행
//				  -> 사용자 아이디, 이름, 가입날짜(YYYY-MM-DD HH24:MI:SS) 출력
		// 메뉴 5. 탈퇴
//				  -> 2번 과정을 그대로 진행한 후 로그인 성공 시 진행
//				  -> '정말 탈퇴하시겠습니까?' 출력 후 'Y' 입력 시 해당 아이디 삭제
//				  -> 그 외 값 누르면 다시 메뉴로 이동
		// 그외. 종료

		Scanner s = new Scanner(System.in);
		while (true) {
			System.out.print("[ (1) 회원가입, (2) 로그인, (3) 비밀번호수정, (4) 정보확인, (5) 탈퇴 (그외) 종료 ] : ");
			int menu = s.nextInt();

			if (menu == 1) {
				String id = "";
				while (true) {
					System.out.print("아이디 : ");
					id = s.next();
					// 중복확인
					ResultSet rs = db.stmt.executeQuery("SELECT * FROM TBL_USER WHERE USERID = '" + id + "'");
					if (rs.next()) { // 중복이라서 읽히는게 있으면 next가 true가 됨
						System.out.println("중복된 아이디가 있습니다. 다시 입력해주세요.");
					} else {
						break;
					}
				}

				System.out.print("비밀번호 : ");
				String pwd = s.next();
				System.out.print("이름 : ");
				String name = s.next();
				System.out.print("성별 : ");
				String gender = s.next();
				System.out.print("나이 : ");
				String age = s.next();

				String query = "INSERT INTO TBL_USER VALUES(" + "'" + id + "'," + "'" + pwd + "'," + "'" + name + "',"
						+ "'" + gender + "'," + "'" + age + "'," + "SYSDATE)";
				int num = db.stmt.executeUpdate(query);
				if (num > 0) {
					System.out.println("가입되었습니다!");
				} else {
					System.out.println("오류가 발생했습니다. 다시 시도해주세요.");
				}

			} else if (menu == 2) {
				boolean loginIdf = login();
			} else if (menu == 3) {
				boolean loginIdf = login();
				if (loginIdf == true) {
					System.out.print("비밀번호 수정: ");
					String newPW = s.next();
					int updated = db.stmt.executeUpdate(
							"UPDATE TBL_USER SET PASSWORD = '" + newPW + "' WHERE USERID = '" + UserSystem.id + "'");
					if (updated > 0) {
						System.out.println("비밀번호가 수정되었습니다.");
					} else {
						System.out.println("비밀번호 수정에 실패했습니다.");
					}

				}
			} else if (menu == 4) {
				boolean loginIdf = login();
				if (loginIdf == true) {
					String sql = "SELECT * FROM TBL_USER WHERE USERID ='" + UserSystem.id + "'";
					ResultSet rs = db.stmt.executeQuery(sql);
					while (rs.next()) { // (rs.next())가 있어야만 쿼리에 접근 가능
						String id = rs.getString("USERID");
						String name = rs.getString("NAME");
						String gender = rs.getString("GENDER").equals("M") ? "남자" : "여자";

						System.out.println("아이디 : " + id + ", 이름 : " + name + ", 성별: " + gender);
					}
				}
			} else if (menu == 5) {
				boolean loginIdf = login();
				if (loginIdf == true) {
					System.out.print("정말 탈퇴하시겠습니까? (Y입력시 탈퇴): ");
					String tal = s.next();
					if (tal.equals("Y")) {
						int updated = db.stmt.executeUpdate("DELETE FROM TBL_USER WHERE USERID ='"+UserSystem.id +"'" );
						System.out.println("탈퇴되었습니다.");
					}else {
						System.out.println("탈퇴가 취소되었습니다.");
					}
				}
			} else if (menu < 1 || menu > 5) {
				System.out.println("종료되었습니다.");
		        break; 
		    }
		}
	}

}
