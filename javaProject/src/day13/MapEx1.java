package day13;

import java.util.HashMap;

public class MapEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		HashMap<String, String> map = new HashMap<>();
//		map.put("apple", "사과");			
//		map.put("java", "자바");			
//		
//		System.out.println(map); //toString없이 가능
//		System.out.println(map.get("apple"));
//		System.out.println(map.get("없는값은 null로 리턴"));
			
		HashMap<String, Object> map = new HashMap<>();
		map.put("name", "홍길동");
		map.put("age", 30);
		map.put("height", 170.5);
		map.put("isMarried", true);
		System.out.println(map);
	}

	
}
