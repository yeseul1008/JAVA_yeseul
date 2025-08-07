package exam0807;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Quiz7 {

	public static int checkNumber(String msg) {
		Scanner s = new Scanner(System.in);
		int input;
		while (true) {
			System.out.print(msg);
			input = s.nextInt();

			// 숫자 0 혹은 음수인지 체크하는 조건문
			if (input <= 0) {
				System.out.println("음수는 불가능 합니다. 다시 입력해주세요.");
				
			} else {
				break;
			}
		}

		return input;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		참고 1. 1번 메뉴에서 동일 이름을 다시 등록 시도할 경우 이미지와 같이 안내문구 띄울 것 ㅇ
//		참고 2. 2~4번 메뉴에서 등록되지 않은 이름을 찾을 경우 이미지와 같이 안내문구 띄울 것 ㅇ
//		참고 3. 모든 숫자는 음수 입력 불가능하도록 할 것
//		참고 4. 포인트 차감은 내가 가진 포인트를 초과해서 차감할 수 없음

		Scanner s = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		System.out.println("======= 포인트 관리 프로그램=======");
		while (true) {
			System.out.print("[ (1) 사용자 등록 (2)포인트 적립 (3)포인트 차감 (4)포인트 확인 (5) 종료 ] :");
			int menu = s.nextInt();
			if (menu == 1) {
				HashMap<String, Object> map = new HashMap<>();
				System.out.print("이름: ");
				String name = s.next();
				boolean searchFlg = false;
				for (int i = 0; i < list.size(); i++) {
					HashMap<String, Object> getName = list.get(i);
					if (getName.get("이름").equals(name)) {
						System.out.println("이미 등록된 사용자 입니다.");
						searchFlg = true;
					}
				}
				if (searchFlg == false) {
					map.put("이름", name);
					int age = checkNumber("나이 : ");
					map.put("나이", age);
					list.add(map); // [{이름=홍길동,나이=20}]
					System.out.println(name + "님이 등록되었습니다.");
				}

			}
			if (menu == 2) { // 포인트 적립
				HashMap<String, Object> map = new HashMap<>();
				System.out.print("포인트 적립할 사용자 이름: ");
				String name = s.next();

				boolean flg = false;
				for (int i = 0; i < list.size(); i++) {
					HashMap<String, Object> pointmap = list.get(i); // 리스트에서 해시맵 하나씩 꺼내오기
					if (pointmap.get("이름").equals(name)) { // 꺼내온 해시맵과 쓴 이름 같은경우
						if (pointmap.containsKey("포인트")) {// 이전에 포인트 넣은경우
							int point = checkNumber("적립할 포인트: ");
							list.get(i).put("포인트", (int) list.get(i).get("포인트") + point);
							flg = true;
						} else {
							
							int point = checkNumber("적립할 포인트: ");
							list.get(i).put("포인트", point); // 최초 투입
							flg = true;
							System.out.println(pointmap.get("이름")+"님의 포인트가 "+ point +"만큼 적립되었습니다.");
						}
					}
				}
				if (flg == false) {
					System.out.println("해당 사용자가 존재하지 않습니다.");
				}

			}
			if (menu == 3) {
				System.out.print("포인트 차감할 사용자 이름: ");
				String name = s.next();

				boolean flg = false;
				for (int i = 0; i < list.size(); i++) {
					HashMap<String, Object> pointmap = list.get(i); // 리스트에서 해시맵 하나씩 꺼내오기
					if (pointmap.get("이름").equals(name)) { // 꺼내온 해시맵과 쓴 이름 같은경우
						if (pointmap.containsKey("포인트")) {// 이전에 포인트 넣은경우
							
							int point = checkNumber("차감할 포인트: ");

							if (point > (int) list.get(i).get("포인트")) {
								System.out.println("차감할 수 있는 포인트는"+list.get(i).get("포인트")+"입니다.");
								flg = true;
							} else {

								list.get(i).put("포인트", (int) list.get(i).get("포인트") - point);
								System.out.println(pointmap.get("이름")+"님의 포인트가 "+ point + "만큼 차감되었습니다.");
								flg = true;
							}

						} else {
							System.out.println("해당 사용자는 차감할 포인트가 없습니다."); // 아예 포인트 넣은적 없는 경우
							flg = true;
						}
					}
				}
				if (flg == false) {
					System.out.println("해당 사용자가 존재하지 않습니다.");
				}

			}
			if (menu == 4) {// 포인트 확인
				System.out.print("포인트 확인 할 사용자 이름: ");
				String name = s.next();

				boolean flg = false;
				for (int i = 0; i < list.size(); i++) {
					HashMap<String, Object> pointmap = list.get(i); // 리스트에서 해시맵 하나씩 꺼내오기
					if (pointmap.get("이름").equals(name)) { // 꺼내온 해시맵과 쓴 이름 같은경우
						System.out.println(pointmap.get("이름") + "님의 현재 포인트는 " + pointmap.get("포인트") + " 입니다.");
						flg = true;
					}
				}
				if (flg == false) {
					System.out.println("해당 사용자가 존재하지 않습니다.");
				}

			}
			if (menu == 5) {
				System.out.println("종료되었습니다.");
				break;

			}

		}

	}

}
