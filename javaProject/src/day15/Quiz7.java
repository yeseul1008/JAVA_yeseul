package day15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Quiz7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문자열을 입력받아서
		// 문자열 빈도 찾기
		// ex) Show Me The Money
		// s : 1. h: 2. o: 2, w: 1 ......
		// 대소문자 구분 없이 같이 카운팅 공백은 제거

		Scanner s = new Scanner(System.in);
		System.out.print("문자열을 입력하시오: ");
		String str = s.nextLine();
		String finalWord = "";

//		ArrayList<String> arr = new ArrayList<>();
		HashMap<String, Integer> map = new HashMap<>();
//		ArrayList<HashMap<Integer, Integer>> arrList = new ArrayList<>();

		for (int i = 0; i < str.length(); i++) {
			String word = Character.toString(str.charAt(i)).toLowerCase();
			// 모든 문자 소문자로 바꾸기
			if (word.equals(" ")) {
				continue; //공백 제외하기
			}
			if (map.containsKey(word)) {
				map.put(word, map.get(word) + 1);
			} else {
				map.put(word, 1);
			}
		}
		System.out.println(map);
		for(String key : map.keySet()) {
			System.out.print("[ " + key + " : " + map.get(key) + " ] ");
		}
}

	}

