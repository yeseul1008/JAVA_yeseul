package day14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Review_ListMap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// List + Map
		// 사용자로부터 이름, 나이를 입력받아서
		// 3명의 정보를 Map의 형태로 만든 후 List에 저장하는 코드 작성
		
		Scanner s = new Scanner(System.in);
		
		ArrayList<HashMap<String,Object>> list = new ArrayList<>();
		
		for (int i = 0; i<3; i++) {
			HashMap<String,Object> map = new HashMap<>(); // 새로운 객체 계속만들어야 다르게 입력되니까 주의하기
			System.out.print("이름을 입력하시오:");
			String name = s.next();
			map.put("name", name);
			System.out.print("나이를 입력하시오:");
			Object age = s.next();
			map.put("age", age);
			list.add(map);
		}
		
		System.out.println(list);
		for(int i = 0; i<list.size();i++) {
			HashMap<String, Object> user = list.get(i);
			System.out.println(user.get("name")); // name 키 값에 들어있는 밸류값(이름)이 출력됨
			System.out.println(list.get(i).get("name")); //// 위 두 코드를 이렇게 줄여서 가능
		}
	}

}
