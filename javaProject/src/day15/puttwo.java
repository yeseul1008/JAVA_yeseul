package day15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;
import java.util.Set;

public class puttwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		6. 20개의 공간을 가지는 배열을 생성하고, 랜덤한 숫자 1~10사이의 값을 20개의 공간에 모두 넣으시오.
//		그 후, 중복된 숫자가 가장 많은 수의 숫자와 개수를 출력하시오.
//		ex) [1,2,3,5,4,2,7,1,2,3,6,8,1,3,2,6,2,3,1,2]
//		위처럼 배열이 생성된 경우 2는 6개로 가장 많으므로 
//		'가장 많은 수 : 2, 개수 : 6' 형태로 출력
//		 -- 오늘 실습한 수도 맞추기 퀴즈에서 HashMap의 keyTable 형식을 참고하면 도움이 될 것

		Random ran = new Random();
		HashMap<Integer, Integer> map = new HashMap<>();
		ArrayList<HashMap<Integer, Integer>> arrList = new ArrayList<>(); // 해시맵들 넣는 리스트 생성
		int[] arr = new int[20];
		for (int i = 0; i < arr.length; i++) {
			int ranNum = ran.nextInt(10) + 1;
			arr[i] = ranNum;
			if (map.containsKey(arr[i])) { // 이미 나왔던 숫자인 경우
				map.put(arr[i], map.get(arr[i]) + 1); // 랜덤 수가 있는 해시맵의 밸류값(keyTable.get(arr[i]))에다가 1을 더함
			} else {
				map.put(arr[i], 1); // {4 : 0}
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(map);
		
		///
		int maxValue = 0;
		for(int key : map.keySet()) { // 밸류값이 가장 큰 것 찾기
			if(maxValue < map.get(key)) {
				maxValue = map.get(key);
			}
		}
		///
		for(int key : map.keySet()) {
			if(maxValue == map.get(key)) { //위에서 찾은 큰것과 밸류값이 같은 키 찾기
				System.out.println("가장 많은 수 : "+key +", 개수 : "+ map.get(key));
			}
		}

	}
}
