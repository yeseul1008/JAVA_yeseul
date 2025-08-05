package day14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class QuizEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		while (true) {
			System.out.print("[ (1) 추가 (2) 확인 (3) 점수수정 (4) 종료 ] : ");
			int input = s.nextInt();
			if (input == 1) {
				HashMap<String, Object> map = new HashMap<>();
				System.out.print("이름 : ");
				String name = s.next();
				map.put("name", name);

				System.out.print("국어 점수 :");
				int g = s.nextInt();
				map.put("g", g);
				System.out.print("영어 점수 :");
				int e = s.nextInt();
				map.put("e", e);
				System.out.print("수학 점수 :");
				int m = s.nextInt();
				map.put("m", m);

				list.add(map);
				System.out.println("--------------------------");
			} else if (input == 2) {
				for (int i = 0; i < list.size(); i++) { // 2
					HashMap<String, Object> user = list.get(i);
					System.out.println((i + 1) + ". 이름: " + user.get("name"));
					System.out.print("   국어 : " + user.get("g"));
					System.out.print(", 영어 : " + user.get("e"));
					System.out.print(", 수학 : " + user.get("m"));
					double avg = ((int) user.get("m") + (int) user.get("e") + (int) user.get("g")) / 3.0;
					System.out.print(", 평균 : " + avg);
					System.out.println();
				}
			} else if (input == 3) {
				System.out.print("점수를 수정할 학생의 이름을 입력해주세요 : ");
				String inputName = s.next();
				for (int i = 0; i < list.size(); i++) {
					if (inputName.equals(list.get(i).get("name"))) {
						System.out.print("수정할 과목을 선택하세요 (1. 국어 2. 영어 3. 수학) :");
						int rescorenum = s.nextInt();
						if (rescorenum == 1) {
						HashMap<String, Object> user = list.get(i);
						user.remove("g");
						System.out.print("수정할 과목의 점수를 입력하세요: ");
						int newscore = s.nextInt();
						user.put("g", newscore);
						}
						else if (rescorenum == 2) {
						HashMap<String, Object> user = list.get(i);
						user.remove("e");
						System.out.print("수정할 과목의 점수를 입력하세요: ");
						int newscore = s.nextInt();
						user.put("e", newscore);
						}
						else if (rescorenum == 3) {
						HashMap<String, Object> user = list.get(i);
						user.remove("m");
						System.out.print("수정할 과목의 점수를 입력하세요: ");
						int newscore = s.nextInt();
						user.put("m", newscore);
						}else {
							System.out.println("잘못된 과목 번호 입니다.");
							break;
						}
					}
				}
			} else if (input == 4) {
				System.out.println("종료합니다.");
				break;
			}
		}
	}

}
