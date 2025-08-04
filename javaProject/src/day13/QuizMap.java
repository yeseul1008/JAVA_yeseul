package day13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class QuizMap {

//	private Object a;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		while (true) {
			System.out.print("[ (1) 추가 (2) 확인 (3) 삭제 (4) 종료 ] : ");
			int input = s.nextInt();
			if (input == 1) {
				HashMap<String, Object> map = new HashMap<>(); //map이라는 이름의 해시맵 생성
				System.out.print("이름 : ");
				String name = s.next();
				map.put("name", name); //name이란 키에 입력한 값 연결
				System.out.print("나이 : ");
				int age = s.nextInt();
				map.put("age", age);
				System.out.print("주소 : ");
				String addr = s.next();
				map.put("addr",addr);
				list.add(map); //리스트에 해시맵 넣기
				System.out.println("---------------------");
			} else if (input == 2) {

				for (int i = 0; i < list.size(); i++) {
					HashMap<String, Object> user = list.get(i); // 리스트 속 i번째 인덱스에 있는 해시맵을 user객체에 담기
					System.out.println((i + 1) + ". 이름: " + user.get("name") + ", 나이: " + user.get("age") + ", 주소: "
							+ user.get("addr"));

				}
				System.out.println("---------------------");
			} else if (input == 3) {
				System.out.print("삭제 할 사용자의 이름을 입력하세요: ");
				String name = s.next();
				boolean flag = false; // 이름 찾으면 true;
				for (int i = 0; i < list.size(); i++) {
					HashMap<String, Object> user = list.get(i);
					if(name.equals(user.get("name"))) {
						list.remove(i);
						i--;//삭제 후 인덱스 하나씩 당겨지기 때문에 이 과정 필요
						flag = !flag;
					}
				}
				if(!flag ) {
					System.out.println("해당 이름을 가진 사용자가 존재하지 않습니다.");
				}
				System.out.println("---------------------");
			} else if (input == 4) {
				System.out.println("종료되었습니다.");
				break;
			} else {
				System.out.println("1~4 중 선택해주세요");
			}
		}
	}

}
