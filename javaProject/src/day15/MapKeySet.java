package day15;

import java.util.HashMap;
import java.util.Set;

public class MapKeySet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Object> map = new HashMap<>();
		map.put("name", "홍길동");
		map.put("age", 30);
		map.put("height", 170.5);
		map.put("isMarried", true);
		
		Set<String> keys = map.keySet(); // 맵에 있는 키 값들이 리스트형태로 들어감
		for(String key : keys) {
//			System.out.println(key); // 키값 출력
			System.out.println(map.get(key)); //밸류값 출력
		}
		
	
	}

}
