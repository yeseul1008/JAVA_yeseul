package day13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MapEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		//Integer을 넣듯, Human을 넣듯, 해시맵이 들어가는 리스트를 만들거기 때문에 <>안에 해시맵이 들어감
		//해시맵 넣을 리스트 생성
		
		for(int i = 0; i<3; i++) {
			HashMap<String, Object> map = new HashMap<>(); //map이란 이름의 해시맵 생성
			System.out.print("이름 : ");
			String name = s.next();
			map.put("name", name); // 앞에 name은 키
			System.out.print("나이 : ");
			int age = s.nextInt();
			map.put("age", age);
			System.out.print("주소 : ");
			String addr = s.next();
			map.put("addr",addr);
			list.add(map); //리스트에 해시맵 넣기
		
		}
		System.out.println(list);
		// 이름만 출력하기 출력
		for (int i = 0; i<list.size();i++) {
		 	HashMap<String, Object> user = list.get(i); //리스트에서 하나씩 해시맵을 가져와서 user객체를 만들고 특정 키로 출력하기
		 	System.out.println(user.get("name"));
//		 	System.out.println(list.get(i).get("name")); 이렇게 한줄로도 가능
		}
		
		System.out.print("검색할 사람 입력: ");
		String name = s.next();
		for (int i = 0; i<list.size();i++) {
			HashMap<String, Object> user = list.get(i); // 이거 까먹지말기
			if (name.equals(user.get("name"))) { //입력한 것(name)과 유저 객체에서 name키로 연결된것과 비교
				System.out.println("찾았다!");
			}else {
				System.out.println("없다.");
			}
		}
		
	}

}
