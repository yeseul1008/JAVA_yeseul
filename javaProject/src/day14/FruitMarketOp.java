package day14;

import java.io.Serial;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class FruitMarketOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 과일가게 프로그램
//		개선 1. o
//		 - 1번메뉴에서 과일을 추가할 때,
//		   이미 있는 과일이면 가격을 물어보지 말고
//		   개수만 물어본 후 해당 개수를 기존개수에 더하기
//
//		개선 2. 
//		 - 가격, 개수에 음수 입력 불가능하도록 o
//		   + 가격은 100단위(1500 ok, 1310 x) o
//		 - 판매 개수가 원래 개수보다 많을 경우
//		   '판매 가능한 개수는 oo개 입니다' 출력 후 메뉴로 이동 o
//		개선 3.
//		 - 메뉴 4번 추가
//		   과일명을 입력받고 가격을 수정할 수 있도록
//		   ex) 사과 입력 후 수정할 가격 2000을 입력하면
//		       사과의 가격(price)이 2000으로 변경​

		Scanner s = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		System.out.println("=======과일가게 프로그램=======");
		while (true) {
			System.out.print("[ (1)추가 (2)확인 (3)판매 (4)가격수정 (-1)종료 ] : ");
			int menu = s.nextInt();
			boolean flg = true;
			if (menu == 1) {
				while (flg == true) {
					HashMap<String, Object> fruit = new HashMap<>();
					System.out.print("과일명: ");
					String fruitname = s.next();
					for (int i = 0; i < list.size(); i++) {
						if (list.get(i).get("fruitname").equals(fruitname)) {
							System.out.print("개수: ");
							int count = s.nextInt();
							list.get(i).put("count", (int) list.get(i).get("count") + count); /// 중요
							flg = false;
							break;
						}
					}
					if (flg) {
						fruit.put("fruitname", fruitname);

						System.out.print("가격: ");
						int price = s.nextInt();
						if (price < 0) {
							System.out.println("음수 입력은 불가능합니다.");
							flg = false;
							break;
						} else {
							if (price % 100 == 0) {
								fruit.put("price", price);
							} else {
								System.out.println("가격은 100단위만 가능합니다. 다시입력하세요");
								flg = false;
								break;
							}
						}
						System.out.print("개수: ");
						int count = s.nextInt();
						if (count < 0) {
							System.out.println("음수 입력은 불가능합니다.");
							flg = false;
							break;
						} else {
							fruit.put("count", count);
						}

						list.add(fruit);
						flg = false;
					}
				}

			} else if (menu == 2) {
				System.out.print("과일명을 입력하시오: ");
				String fruitname = s.next();
				boolean searchFlg = false;
				for (int i = 0; i < list.size(); i++) {
					if (list.get(i).get("fruitname").equals(fruitname)) {//// 리스트 속 i번째 맵에서 fruitname키에 해당하는거 꺼내오기
						System.out.print("가격 : " + list.get(i).get("price") + "원, ");
						System.out.println("개수 : " + list.get(i).get("count") + "개");
						searchFlg = true;
					}
				}
				if (!searchFlg) {
					System.out.println("해당 과일이 존재하지 않습니다.");
				}

			} else if (menu == 3) {
				System.out.print("판매할 과일의 이름 입력: ");
				String fruitname = s.next();
				boolean searchFlg = false;
				for (int i = 0; i < list.size(); i++) {
					if (list.get(i).get("fruitname").equals(fruitname)) {
						System.out.print("판매할 개수 입력: ");
						int sellcount = s.nextInt();
//						(int)list.get(i).get("count") - sellcount;
						if (sellcount>(int) list.get(i).get("count")) {
							System.out.println("판매 가능한 개수는 "+(int) list.get(i).get("count")+"개 입니다.");
							searchFlg = true;
							break;
						}
						list.get(i).put("count", (int) list.get(i).get("count") - sellcount);
						//// 리스트 속 i번째 맵에 키가 count, 밸류가 저거인 해시맵 넣기
						searchFlg = true;
						System.out.println(sellcount + "개가 판매되었습니다.");
					}
				}
				if (!searchFlg) {
					System.out.println("해당 과일이 존재하지 않습니다.");
				}

			} else if (menu == 4) {
				System.out.print("가격을 수정할 과일 이름을 입력하세요 : ");
				String rename = s.next();

				for (int i = 0; i < list.size(); i++) {
					if (list.get(i).get("fruitname").equals(rename)) {
						System.out.print("수정할 가격을 입력하세요: ");
						int reprice = s.nextInt();
						list.get(i).put("price", reprice);
						System.out.println(list.get(i).get("fruitname")+"의 가격이 "+reprice+ "원으로 수정되었습니다.");
					}
				}
			}
			else if (menu == -1) {
				System.out.println("종료합니다.");
				break;
			} else {

			}

		}

	}

}
