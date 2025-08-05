package day14;

import java.io.Serial;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class FruitMarket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 과일가게 프로그램
		// 메뉴 1(추가). 과일명, 가격, 개수 추가(map)한 후 list에 담기
		// 메뉴 2(확인). => 과일명을 입력받고, 해당 과일명의 가격, 개수 출력
		// 만약 없는 과일명이면 '해당 과일이 존재하지 않습니다' 출력
		// 메뉴 3(판매). 과일명과 개수를 입력받아서 해당 과일명의 개수에서 차감
		// 'oo개가 판매되었습니다.' 출력
		// 만약 없는 과일명이면 '해당 과일이 존재하지 않습니다' 출력
		// 메뉴 -1 (종료) '종료되었습니다' 출력 후 프로그램 종료

		Scanner s = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		System.out.println("=======과일가게 프로그램=======");
		while (true) {
			System.out.print("[ (1)추가 (2)확인 (3)판매 (-1)종료 ] : ");
			int menu = s.nextInt();
			if (menu == 1) {
				HashMap<String, Object> fruit = new HashMap<>();
				System.out.print("과일명: ");
				String fruitname = s.next();
				fruit.put("fruitname", fruitname);

				System.out.print("가격: ");
				int price = s.nextInt();
				fruit.put("price", price);

				System.out.print("개수: ");
				int count = s.nextInt();
				fruit.put("count", count);

				list.add(fruit);

			} else if (menu == 2) {
				System.out.print("과일명을 입력하시오: ");
				String fruitname = s.next();
				boolean searchFlg = false;
				for (int i = 0; i < list.size(); i++) {
					if (list.get(i).get("fruitname").equals(fruitname)) {////리스트 속 i번째 맵에서 fruitname키에 해당하는거 꺼내오기
						System.out.print("가격 : "+list.get(i).get("price")+"원, ");
						System.out.println("개수 : "+list.get(i).get("count")+"개");
						searchFlg = true;
					}
				}
				if (!searchFlg) {
					System.out.println("해당 과일이 존재하지 않습니다.");
				}

			} else if (menu == 3) {
				System.out.print("판매할 과일의 이름 입력: ");
				String fruitname =  s.next();
				boolean searchFlg = false;
				for (int i = 0; i < list.size(); i++) {
					if (list.get(i).get("fruitname").equals(fruitname)) {
						System.out.print("판매할 개수 입력: ");
						int sellcount = s.nextInt();
//						(int)list.get(i).get("count") - sellcount;
						list.get(i).put("count", (int)list.get(i).get("count")- sellcount);
						//// 리스트 속 i번째 맵에 키가 count, 밸류가 저거인 해시맵 넣기
						searchFlg = true;
						System.out.println(sellcount+"개가 판매되었습니다.");
					}
				}
				if (!searchFlg) {
					System.out.println("해당 과일이 존재하지 않습니다.");
				}

			} else if (menu == -1) {
				System.out.println("종료합니다.");
				break;
			} else {

			}

		}

	}

}
