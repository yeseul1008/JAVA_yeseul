package day14;

import java.util.ArrayList;
import java.util.Random;

public class Review_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
//		ArrayList<Integer> list = new ArrayList<Integer>(); //뒤에 Integer 생략가능
		
		// list에 랜덤한 숫자 5개를 넣기
		// 랜덤 숫자의 범위는 1~30 중복은 일단 상관X
		
//		list.add(1); // [1]
//		list.add(30); // [1, 30]
//		list.add(50); // [1, 30, 50]
//		list.add(1,20); //[1, 20, 30 ,50]
//		System.out.println(list);
		
		Random ran = new Random();
		for(int i = 0; i < 5; i++) {
//			int num = ran.nextInt(30)+1;
			list.add(ran.nextInt(30)+1);
		}
		System.out.println(list);
		
	}

}
