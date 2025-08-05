package day14;

import java.util.HashMap;

public class Review_Map1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// map => {name : "홍길동", age : 30, addr : "인천"}
		// 해시맵은 키값과 그에 대응하는 밸류 값 가짐
		
//		HashMap<String, Integer> scoreMap = new HashMap<>();
//		// 이것도 위에 <> 속 생략 가능
//		scoreMap.put("java", 95);
//		scoreMap.put("oracle", 90);
//		scoreMap.put("html", 93);
//		System.out.println(scoreMap);
		
		HashMap<String, Object> scoreMap = new HashMap<>();
		scoreMap.put("java", 95);
		scoreMap.put("oracle", 90);
		scoreMap.put("html", 93);
		scoreMap.put("name", "홍길동");
		System.out.println(scoreMap);
		
	}

}
