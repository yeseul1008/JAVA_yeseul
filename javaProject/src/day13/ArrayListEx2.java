package day13;

import java.util.ArrayList;

public class ArrayListEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Human> list = new ArrayList<>();  
		
		Human hong = new Human("홍길동", 30, "인천");
		list.add(hong);
		Human kim = new Human("김철수", 25, "서울");
		Human park = new Human("박영희", 20, "제주도");
		
		list.add(kim);
		list.add(park);
		
		for(int i = 0; i<list.size(); i++) {
			Human human = list.get(i); /// 휴먼으로 생성한 리스트 객체니까 꺼낼때도 휴먼 타입으로 받아줘야함
			System.out.println(human.getName());
		}
	}

}
