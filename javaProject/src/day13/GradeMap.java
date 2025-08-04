package day13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class GradeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		System.out.println("======성적관리 시스템======");
		System.out.print("인원 수 입력 : ");
		int num = s.nextInt();
		for (int i = 0; i < num; i++) {
			HashMap<String, Object> map = new HashMap<>();
			System.out.print("이름 >> ");
			String name = s.next();
			map.put("name", name);

			while (true) {
				System.out.print("자바 >> ");
				int java = s.nextInt();
				if (java <= 35 && java >= 0) {
					map.put("자바", java);
					break;
				} else {
					System.out.println("자바의 범위는 0부터 35까지 입니다.");
				}
			}
			while (true) {
				System.out.print("오라클 >> ");
				int oracle = s.nextInt();
				if (oracle <= 40 && oracle >= 0) {
					map.put("오라클", oracle);
					break;
				} else {
					System.out.println("오라클의 범위는 0부터 40까지 입니다.");
				}

			}
			while (true) {
				System.out.print("html >> ");
				int html = s.nextInt();
				if (html <= 25 && html >= 0) {
					map.put("html", html);
					break;
				} else {
					System.out.println("html의 범위는 0부터 25까지 입니다.");
				}
			}
			list.add(map);
			System.out.println("-----------------");
		}
		for (int i = 0; i < num; i++) {
			HashMap<String, Object> user = list.get(i); //Object 타입이기 때문에 int로 바꿔줘야함
			int sum = (int) user.get("자바") + (int)user.get("오라클") + (int)user.get("html");
			System.out.println("이름 : " + user.get("name")+", 총점 : "+ sum);
		}
	}

}
