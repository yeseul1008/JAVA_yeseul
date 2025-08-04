package day13;

import java.util.ArrayList;
import java.util.Scanner;

public class QuizHongKimPark {

//	private Object a;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		ArrayList<Human> list = new ArrayList<>(); // 휴먼 관리하는 리스트 생성
		while (true) {
			System.out.print("[ (1) 추가 (2) 확인 (3) 삭제 (4) 종료 ] : ");
			int input = s.nextInt();
			int member = 0;
			if (input == 1) {
				System.out.print("이름 : ");
				String name = s.next();
				System.out.print("나이 : ");
				int age = s.nextInt();
				System.out.print("주소 : ");
				String addr = s.next();
				Human human = new Human(name, age, addr); // 입력받은 3가지 정보로 human 객체 생성
				list.add(human); // 리스트에 차곡차곡 객체 넣기
				System.out.println("---------------------");
			} else if (input == 2) {

				for (int i = 0; i < list.size(); i++) {
					Human human = list.get(i); // 리스트 i번째 인덱스에 담긴 객체를 human객체에 담기
					System.out.println((i + 1) + ". 이름: " + human.getName() + ", 나이: " + human.getAge() + ", 주소: "
							+ human.getAddr());

				}
				System.out.println("---------------------");
			} else if (input == 3) {
				System.out.print("삭제 할 사용자의 이름을 입력하세요: ");
				String name = s.next();
				boolean flag = false; // 이름 찾으면 true;
				for (int i = 0; i < list.size(); i++) {
					Human human = list.get(i);
					if(name.equals(human.getName())) {
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
