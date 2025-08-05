package day14;

import java.util.ArrayList;
import java.util.HashMap;

public class Review_ListMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// {java=95, oracle=90, name=홍길동, html=93}
		// map 하나만 가지로 관리를하게되면
		// map 하나당 사람 한명만 관리가 가능
		// 그러므로 HashMap은 list와 함께 쓴다
		
		HashMap<String,Object> map = new HashMap<>();
		ArrayList<HashMap<String,Object>> list = new ArrayList<>();
		
		HashMap<String,Object> hong = new HashMap<>();
		hong.put("name", "홍길동");
		hong.put("age", 30);
		
		HashMap<String,Object> kim = new HashMap<>();
		kim.put("name", "김철수");
		kim.put("age", 20);
		
		HashMap<String,Object> park = new HashMap<>();
		park.put("name", "박영희");
		park.put("age", 30);
		
		list.add(hong);
		list.add(kim);
		list.add(park);
		
		System.out.println(list);
	}

}
